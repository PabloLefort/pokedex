package tda;

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
		this.setNombre(nombre);
		this.setPuntosDeCombate(puntosDeCombate);
		this.setPuntosDeSalud(puntosDeSalud);
		this.setAtaque(ataque);
		this.setDefensa(defensa);
		this.setStamina(stamina);
		this.setTipo(tipo);
	}
	


	public int getPuntosDeCombate() {
		return puntosDeCombate;
	}

	public void setPuntosDeCombate(int puntosDeCombate) {
		this.puntosDeCombate = puntosDeCombate;
	}
	
	public TIPO getTipo(){
		return tipo;
	}
	
	//Metodo que setea el tipo al pokemon
	public void setTipo(TIPO tipo){
		this.tipo = tipo;
	}

	//Metodo que retorna el id del tipo del pokemon
	public int getIdTipo() {
		return tipo.getId();
	}
	
	//Metodo que retorna el nombre del tipo del pokemon
	public String getNombreTipo(){
		return tipo.getNombre();
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
}
