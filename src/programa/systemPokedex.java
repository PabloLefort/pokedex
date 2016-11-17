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
	
}
