package tda;

import TDA.ColaPrioridadTDA;

public interface TDAPokedex {

	//Inicializa la estruc
	//PRE: - 
	//POS: estruc inic
	public void Inicializar();
	
	//Agrega un pokemon a la estruc
	//PRE: estruc inic
	//POS: estruc con un pokemon mas
	public void Agregar(Pokemon p);
	
	//Elimina un pokemon de la estruc
	//PRE: estruc inic y pokemon debe existente
	//POS: pokemon transferido
	public void Transferir(Pokemon p);
	
	//Recupera todos los pokemones del tipo pasado por parametro
	//PRE: estruc inic
	//POS: -
	public <TIPO> ColaPrioridadTDA Recuperar(TIPO t);
}
