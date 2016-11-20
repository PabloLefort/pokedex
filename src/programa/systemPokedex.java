package programa;

import Implementaciones.ColaPrioridad;
import implementacion.ColaID;
import implementacion.Pokedex;
import tda.ColaTDA;
import tda.TDAPokedex;

public class systemPokedex {
	private Pokedex poke;

	public static void main(String[] args) {
		
	}

	
	public systemPokedex(Pokedex poke) {
		super();
		this.poke = new Pokedex();
		poke.Inicializar();
	}
	
	private TDAPokedex buscarTDA(TIPO t, TDAPokedex p){
		int aux = p.getTipo().compareTo(t);
		if(aux == 0)
			return p;
		else if(aux > 0)
			return buscarTDA(t, p.getRaiz().getHijoDer());
		else
			return buscarTDA(t, p.getRaiz().getHijoIzq());
	}

	public ColaPrioridad<Pokemon> OrdenarPokemones(TIPO t, String criterio){
		TDAPokedex raiz = this.buscarTDA(t, poke.getRaizTDA());
		ColaPrioridad<Pokemon> resultado = new ColaPrioridad<Pokemon>();
		resultado.InicializarCola();
		ColaPrioridad<Pokemon> pokemones = raiz.getRaiz().getPokemones();
		while(!pokemones.ColaVacia()){
			Pokemon aux;
			try {
				aux = pokemones.RecuperarMaxElemento();
				switch (criterio) {
					case "Nombre":
						resultado.AgregarElemento(aux, Integer.parseInt(aux.getNombre()));
					break;
					
					case "PC":
						resultado.AgregarElemento(aux, aux.getPuntosDeCombate());
					break;
					
					case "PS":
						resultado.AgregarElemento(aux, aux.getPuntosDeSalud());
					break;
					
					case "Ataque":
						resultado.AgregarElemento(aux, aux.getAtaque());
					break;
		
					case "Defensa":
						resultado.AgregarElemento(aux, aux.getDefensa());
					break;
					
					case "Stamina":
						resultado.AgregarElemento(aux, aux.getStamina());
					break;
				}
				pokemones.EliminarMaxPrioridad();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}
	
	public ColaPrioridad PokemonesDebiles(int cantidad){
		ColaPrioridad pokemonesDebiles = new ColaPrioridad();
		pokemonesDebiles.InicializarCola();
		ColaPrioridad aux = new ColaPrioridad();
		aux.InicializarCola();
		NodoPokemonABB raiz = poke.getRaiz();
		aux = TraerPokemones(raiz, cantidad, aux, false);
		int cont = 0;
		while(!aux.ColaVacia() || cont <= cantidad){
			try {
				pokemonesDebiles.AgregarElemento(aux.RecuperarMinElemento(), aux.RecuperarMinPrioridad());
				aux.EliminarMinPrioridad();
				cont++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pokemonesDebiles;
	}

	public ColaPrioridad PokemonesPoderosos(int cantidad){
		ColaPrioridad pokesPoderosos = new ColaPrioridad();
		pokesPoderosos.InicializarCola();
		ColaPrioridad aux = new ColaPrioridad();
		aux.InicializarCola();
		NodoPokemonABB raiz = poke.getRaiz();
		if(raiz == null)
			return pokesPoderosos;
		aux = this.TraerPokemones(raiz, cantidad, aux, true);
		int cont = 0;
		while(!aux.ColaVacia() || cont <= cantidad){
			try {
				pokesPoderosos.AgregarElemento(aux.RecuperarMaxElemento(), aux.RecuperarMaxPrioridad());
				aux.EliminarMaxPrioridad();
				cont++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pokesPoderosos;
	}
	
	private ColaPrioridad TraerPokemones(NodoPokemonABB raiz, int cantidad, ColaPrioridad resultado, boolean poderosos){
		if(poderosos){
			ColaPrioridad aux = raiz.getPokemones();
			
			int cont = 0;
			while(!aux.ColaVacia() || cont <= cantidad){
				
				try {
					resultado.AgregarElemento(aux.RecuperarMaxElemento(), aux.RecuperarMaxPrioridad());
					aux.EliminarMaxPrioridad();
					cont++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} else {
			ColaPrioridad aux = raiz.getPokemones();
			
			int cont = 0;
			while(!aux.ColaVacia() || cont <= cantidad){
				
				try {
					resultado.AgregarElemento(aux.RecuperarMinElemento(), aux.RecuperarMinPrioridad());
					aux.EliminarMinPrioridad();
					cont++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if(raiz.getHijoIzq() != null)
			resultado = this.TraerPokemones(raiz.getHijoIzq().getRaiz(), cantidad, resultado, poderosos);
		
		if(raiz.getHijoDer() != null)
			resultado = this.TraerPokemones(raiz.getHijoDer().getRaiz(), cantidad, resultado, poderosos);
		
		return resultado;
	}


	
}
