package implementacion;

import tda.ColaTDA;

public class ColaID implements ColaTDA{
	class Nodo{
		int valor;
		Nodo sig;
	}

	Nodo primero;
	Nodo ultimo;


	public void InicializarCola(){
		primero = ultimo = null;
	}

	public void Acolar(int e){
		Nodo aux = new Nodo();
		aux.valor = e;
		aux.sig = null;
	}
	
	public int Primero(){
		return primero.valor;
	}
	
	public void Desacolar(){
		primero = primero.sig;
		if (primero == null)
			ultimo = primero;
	}
	
	public boolean ColaVacia(){
		return primero==null;
	}
	
}