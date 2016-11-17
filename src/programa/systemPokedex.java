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

	public ColaID OrdenarPokemones(TIPO t, String criterio){
		TDAPokedex raiz = this.buscarTDA(t, poke.getRaizTDA());
		ColaID pokemones = new ColaID();
		switch (criterio) {
			case "Nombre":
				
			break;
			
			case "PC":
				
			break;
			
			case "PS":
				
			break;
			
			case "Ataque":
				
			break;

			case "Defensa":
				
			break;
			
			case "Stamina":
				
			break;
		}
		return pokemones;
	}

	public ColaPrioridad PokemonesPoderosos(int cantidad){
		
		//Creo la cola prioridad que sera el resultado del metodo
		ColaPrioridad pokesPoderosos = new ColaPrioridad();
		pokesPoderosos.InicializarCola();
		
		
		ColaPrioridad aux = new ColaPrioridad();
		aux.InicializarCola();
		
		//Me traigo el nodo principal del arbol
		NodoPokemonABB raiz = poke.getRaiz();
		
		//Metodo para buscar la cantidad de pokemones del nodo y que recorra el arbol subsiguiente
		//Me devuelve una colaPrioridad con todo ya ordenado
		aux = TraigoPokes(raiz, cantidad, aux);
		
		int cont = 0;
		while(!aux.ColaVacia() || cont <= cantidad){
			
			try {
				
				pokesPoderosos.AgregarElemento(aux.RecuperarMaxElemento(), aux.RecuperarMaxPrioridad());
				aux.EliminarMaxPrioridad();
				cont++;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return pokesPoderosos;
		
	}
	
	private ColaPrioridad TraigoPokes(NodoPokemonABB raiz, int cantidad, ColaPrioridad resultado){
		
		if(raiz != null){
			ColaPrioridad aux = raiz.getPokemones();
			
			int cont = 0;
			while(!aux.ColaVacia() || cont <= cantidad){
				
				try {
					
					resultado.AgregarElemento(aux.RecuperarMaxElemento(), aux.RecuperarMaxPrioridad());
					aux.EliminarMaxPrioridad();
					cont++;
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(raiz.getHijoIzq() != null)
				resultado = TraigoPokes(raiz.getHijoIzq(), cantidad, resultado);
			
			if(raiz.getHijoDer() != null)
				resultado = TraigoPokes(raiz.getHijoDer(), cantidad, resultado);
			
		}
		return resultado;
	}
	
}
