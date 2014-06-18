package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Genero implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private ArrayList<Autor> listaAutores;
	private String imagenGenero;

	public Genero() {
		listaAutores = new ArrayList<>();
	}
	
	public Genero(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void agregarAutor(Autor autor){
		listaAutores.add(autor);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Autor> getListaAutores() {
		return listaAutores;
	}

	public void setListaAutores(ArrayList<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

	public String getImagenGenero() {
		return imagenGenero;
	}

	public void setImagenGenero(String imagenGenero) {
		this.imagenGenero = imagenGenero;
	}

}
