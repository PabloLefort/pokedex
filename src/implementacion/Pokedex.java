package implementacion;

import Implementaciones.ColaPrioridad;
import TDA.ColaPrioridadTDA;
import tda.Pokemon;
import tda.TDAPokedex;
import tda.TIPO;

public class Pokedex implements TDAPokedex {

	class NodoABB{
		//ColaPrioridad donde iran los diferentes pokemones del tipo indicado
		TIPO valor;
		ColaPrioridadTDA<Pokemon> cola;
		Pokedex hijoIzq;
		Pokedex hijoDer;
	}

	NodoABB raiz;
	
	public void Inicializar() {
		// TODO Auto-generated method stub
		raiz = null;
	}

	public void Agregar(Pokemon p) {
		// Para agregar un Pokemon, pregunto primero si la raiz esta vacia
		if(raiz == null){
			//Si es nula, creo un nodo con el tipo de Pokemon y le asigno una cola prioridad
			raiz = new NodoABB();
			
			//El valor del nodo será el tipo de Pokemon
			//if(p.getTipo().getId() > 0)
			raiz.valor.setTipo(p.getTipo());
			
			//Cada nodo tendra una ColaPrioridad<Pokemon> con pokemones
			raiz.cola = new ColaPrioridad<Pokemon>();
			raiz.cola.InicializarCola();
			
			//Creo los arboles de izq y der del nodo raiz
			raiz.hijoIzq = new Pokedex();
			raiz.hijoIzq.Inicializar();
			raiz.hijoDer = new Pokedex();
			raiz.hijoDer.Inicializar();
			
			//Agrego un pokemon a la ColaPrioridad, ordenado por sus Puntos de Combate
			raiz.cola.AgregarElemento(p, p.getPuntosDeCombate());
		}else{
			if(raiz.valor.getId() == p.getIdTipo()){
				raiz.cola.AgregarElemento(p, p.getPuntosDeCombate());
			}else 
				if(raiz.valor.getId() < p.getIdTipo()){
					raiz.hijoDer.Agregar(p);
				}else
					raiz.hijoIzq.Agregar(p);
		}

	}

	public void Transferir(Pokemon p) {
		// TODO Auto-generated method stub

	}

	public <TIPO> ColaPrioridadTDA<Pokemon> Recuperar(TIPO t) {
		// TODO Auto-generated method stub
		return null;
	}

}
