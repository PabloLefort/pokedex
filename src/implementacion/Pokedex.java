package implementacion;

import Implementaciones.ColaPrioridad;
import programa.NodoPokemonABB;
import programa.Pokemon;
import programa.TIPO;
import tda.TDAPokedex;

public class Pokedex implements TDAPokedex{
	NodoPokemonABB raiz;
	
	@Override
	public void Inicializar() {
		raiz = null;
	}

	@Override
	public void Agregar(Pokemon p) {
		if(raiz == null){
			ColaPrioridad pokemones = new ColaPrioridad<Pokemon>();
			pokemones.InicializarCola();
			pokemones.AgregarElemento(p, p.getPuntosDeCombate());
			TDAPokedex hijoDer = new Pokedex();
			hijoDer.Inicializar();
			TDAPokedex hijoIzq = new Pokedex();
			hijoIzq.Inicializar();
			raiz = new NodoPokemonABB(p.getTipo(), pokemones, hijoIzq, hijoDer);
		} else {
			int aux = raiz.getEspecie().compareTo(p.getTipo()); // compara tipo del nuevo pokemon con el tipo de la raiz
			if(aux == 0){
				raiz.getPokemones().AgregarElemento(p, p.getPuntosDeCombate());
			} else if(aux > 0){
				raiz.getHijoDer().Agregar(p);
			} else {
				raiz.getHijoIzq().Agregar(p);
			}
		}
	}

	@Override
	public void Transferir(Pokemon p) {
		int aux = raiz.getEspecie().compareTo(p.getTipo()); // compara tipo del nuevo pokemon con el tipo de la raiz
		ColaPrioridad<Pokemon> colaAux = new ColaPrioridad<Pokemon>();
		colaAux.InicializarCola();
		if(aux == 0){
			boolean flag = true;
			while(flag){
				try {
					if(raiz.getPokemones().RecuperarMaxElemento().getNombre() == p.getNombre()){
						flag = false;
					} else {
						Pokemon auxp = raiz.getPokemones().RecuperarMaxElemento();
						colaAux.AgregarElemento(auxp, auxp.getPuntosDeCombate());
					}
					raiz.getPokemones().EliminarMaxPrioridad();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			while(!colaAux.ColaVacia()){
				try {
					Pokemon auxp = colaAux.RecuperarMaxElemento();
					raiz.getPokemones().AgregarElemento(auxp, auxp.getPuntosDeCombate());
					colaAux.EliminarMaxPrioridad();
					if(colaAux.ColaVacia())
						flag = false;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if(aux > 0){
			raiz.getHijoDer().Transferir(p);
		} else {
			raiz.getHijoIzq().Transferir(p);
		}
	}

	@Override
	public ColaPrioridad<Pokemon> Recuperar(TIPO t) {
		int aux = raiz.getEspecie().compareTo(t);
		if(aux == 0){
			ColaPrioridad<Pokemon> colaAux = new ColaPrioridad<Pokemon>();
			ColaPrioridad<Pokemon> copia = new ColaPrioridad<Pokemon>();
			colaAux.InicializarCola();
			copia.InicializarCola();
			while(!raiz.getPokemones().ColaVacia()){
				try {
					Pokemon paux = raiz.getPokemones().RecuperarMaxElemento();
					colaAux.AgregarElemento(paux, paux.getPuntosDeCombate());
					copia.AgregarElemento(paux, paux.getPuntosDeCombate());
					raiz.getPokemones().EliminarMaxPrioridad();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			while(!copia.ColaVacia()){
				try {
					Pokemon paux = copia.RecuperarMaxElemento();
					raiz.getPokemones().AgregarElemento(paux, paux.getPuntosDeCombate());
					copia.EliminarMaxPrioridad();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return colaAux;
		} else if(aux > 0){
			return raiz.getHijoDer().Recuperar(t);
		} else {
			return raiz.getHijoIzq().Recuperar(t);
		}
	}

	@Override
	public NodoPokemonABB getRaiz() {
		return raiz;
	}
	
	public TIPO getTipo(){
		return raiz.getEspecie();
	}

	@Override
	public TDAPokedex getRaizTDA() {
		return this;
	}


}
