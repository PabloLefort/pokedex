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
		pokemonID raiz = poke.getRaiz();
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
	
}
