package programa;

import Implementaciones.ColaPrioridad;
import implementacion.ColaID;
import implementacion.pokemonID;
import tda.TDAPokedex;

public class systemPokedex {
	private pokemonID poke;

	public static void main(String[] args) {
		
	}

	
	public systemPokedex(pokemonID poke) {
		super();
		this.poke = new pokemonID();
		poke.Inicializar();
		
	}

	public ColaID OrdenarPokemones(TIPO t, String criterio){
		NodoPokemonABB raiz = poke.getRaiz();
		int aux = raiz.getEspecie().compareTo(t);
		while(aux != 0){
			if(aux > 0){
				aux = raiz.getHijoDer().getTipo()
			} else {
				//izq
			}
		}
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
