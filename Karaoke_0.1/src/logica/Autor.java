package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Autor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private ArrayList<Cancion> listaCanciones;
	private Genero genero;
	private String foto;
	
	public Autor() {
		
	}

	public Autor(String nombre, Genero genero) {
		super();
		this.genero=genero;
		this.nombre = nombre;
		listaCanciones = new ArrayList<>();
	}
	
	public void agregarCancion(Cancion cancion, Autor autor){
		listaCanciones.add(cancion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
