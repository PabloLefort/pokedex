package programa;

import Implementaciones.ColaPrioridad;
import tda.TDAPokedex;

public class NodoPokemonABB {
	private TIPO especie;
	private ColaPrioridad<Pokemon> pokemones;
	private TDAPokedex hijoIzq;
	private TDAPokedex hijoDer;
	
	public NodoPokemonABB(TIPO especie, ColaPrioridad<Pokemon> pokemones, TDAPokedex hijoIzq, TDAPokedex hijoDer) {
		super();
		this.especie = especie;
		this.pokemones = pokemones;
		this.hijoIzq = hijoIzq;
		this.hijoDer = hijoDer;
	}

	public TIPO getEspecie() {
		return especie;
	}

	public void setEspecie(TIPO especie) {
		this.especie = especie;
	}

	public ColaPrioridad<Pokemon> getPokemones() {
		return pokemones;
	}

	public void setPokemones(ColaPrioridad<Pokemon> pokemones) {
		this.pokemones = pokemones;
	}

	public TDAPokedex getHijoIzq() {
		return hijoIzq;
	}

	public void setHijoIzq(TDAPokedex hijoIzq) {
		this.hijoIzq = hijoIzq;
	}

	public TDAPokedex getHijoDer() {
		return hijoDer;
	}

	public void setHijoDer(TDAPokedex hijoDer) {
		this.hijoDer = hijoDer;
	}
	
	
}
