package tda;

public enum TIPO {
	TIERRA ("TIERRA", 1), 
	FUEGO ("FUEGO",2), 
	AGUA ("AGUA", 3), 
	ROCA ("ROCA", 4), 
	AIRE ("AIRE", 5),
	ELECTRICO("ELECTRICO", 6);
	
	private String nombre;
	private int id;
	
	TIPO (String nombre, int id){
		this.nombre = nombre;
		this.id = id;
	}
	
	public String getNombre() {return nombre;}
	public int getId(){return id;}
	
	public void setTipo(TIPO tipo){
		this.nombre = tipo.getNombre();
		this.id = tipo.getId();
	}
	
}
//Update de caguirre 28/10
//Update de dmalagueno 30/10