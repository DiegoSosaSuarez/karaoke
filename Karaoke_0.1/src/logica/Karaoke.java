package logica;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import persistencia.ArchivoPlano;

public class Karaoke implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cancion cancionActual;
	private ArrayList<Genero> listsGeneros;
	private ArrayList<Cancion> listaCanciones;
	
	public Karaoke() {
		listaCanciones = new ArrayList<>();
		listsGeneros = new ArrayList<>();
	}
	
	public void agregarCancion(String letra, Cancion nuevaCancion, String ruta){
		try {
			ArchivoPlano.crearArchivoLetra(letra, ruta + ".txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listaCanciones.add(nuevaCancion);
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
