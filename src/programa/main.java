package programa;

import implementacion.Pokedex;
import tda.Pokemon;
import tda.TIPO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokemon a = new Pokemon("Pikachu", 10, 100, 100, 100, 50, TIPO.ELECTRICO);
		
		
		Pokedex pokedex = new Pokedex();
		pokedex.Inicializar();
		
		pokedex.Agregar(a);
		
	}

}
