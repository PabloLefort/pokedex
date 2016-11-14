package programa;

public class Pokemon {
	private String nombre;
	private int puntosDeCombate;
	private int puntosDeSalud;
	private int ataque;
	private int defensa;
	private int stamina;
	private TIPO tipo;
	
	public Pokemon(String nombre, int puntosDeCombate, int puntosDeSalud, int ataque, int defensa, int stamina,
			TIPO tipo) {
		super();
		this.nombre = nombre;
		this.puntosDeCombate = puntosDeCombate;
		this.puntosDeSalud = puntosDeSalud;
		this.ataque = ataque;
		this.defensa = defensa;
		this.stamina = stamina;
		this.tipo = tipo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosDeCombate() {
		return puntosDeCombate;
	}
	public void setPuntosDeCombate(int puntosDeCombate) {
		this.puntosDeCombate = puntosDeCombate;
	}
	public int getPuntosDeSalud() {
		return puntosDeSalud;
	}
	public void setPuntosDeSalud(int puntosDeSalud) {
		this.puntosDeSalud = puntosDeSalud;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public TIPO getTipo() {
		return tipo;
	}
	public void setTipo(TIPO tipo) {
		this.tipo = tipo;
	}

	
}