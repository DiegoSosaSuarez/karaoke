package logica;

import java.util.ArrayList;

public class Genero {

	private String nombre;
	private String imagenGenero;
	private ArrayList<String> listaAutores;

	public Genero() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagenGenero() {
		return imagenGenero;
	}

	public void setImagenGenero(String imagenGenero) {
		this.imagenGenero = imagenGenero;
	}

	public ArrayList<String> getListaAutores() {
		return listaAutores;
	}

	public void setListaAutores(ArrayList<String> listaAutores) {
		this.listaAutores = listaAutores;
	}
	
	
	
}
