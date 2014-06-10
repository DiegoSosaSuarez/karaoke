package logica;

import java.util.ArrayList;

public class Karaoke {

	private Cancion cancionActual;
	private ArrayList<Genero> listsGeneros;
	
	
	public Karaoke() {
		
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
