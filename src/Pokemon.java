public class Pokemon {
	private String nombre;
	private int puntosDeCombate;
	private int puntosDeSalud;
	private int ataque;
	private int defensa;
	private int stamina;
	private TIPO tipo;
	
	public Pokemon(String nombre, int puntosDeCombate, int puntosDeSalud,
			int ataque, int defensa, int stamina, TIPO tipo) {
		super();
		this.nombre = nombre;
		this.puntosDeCombate = puntosDeCombate;
		this.puntosDeSalud = puntosDeSalud;
		this.ataque = ataque;
		this.defensa = defensa;
		this.stamina = stamina;
		this.tipo = tipo;
	}

	
}
