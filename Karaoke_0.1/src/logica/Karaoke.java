package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Karaoke implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cancion cancionActual;
	private ArrayList<Genero> listsGeneros;
	
	
	public Karaoke() {
		
		listsGeneros = new ArrayList<>();
	}
	
	public void agregarGenero(Genero genero){
		listsGeneros.add(genero);
	}

	public Cancion getCancionActual() {
		return cancionActual;
	}

	public void setCancionActual(Cancion cancionActual) {
		this.cancionActual = cancionActual;
	}
	
	public ArrayList<Genero> getListsGeneros() {
		return listsGeneros;
	}

	public void setListsGeneros(ArrayList<Genero> listsGeneros) {
		this.listsGeneros = listsGeneros;
	}

	
}
