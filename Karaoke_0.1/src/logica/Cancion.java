package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Cancion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String imagen;
	private Genero genero;
	private Autor autor;
	private int duracion;
	private int numeroLineaActual;
	private ArrayList<String> letra;
	
	
	public Cancion() {
		super();
	}

	public Cancion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void agregarLetra(){
		
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public ArrayList<String> getLetra() {
		return letra;
	}


	public void setLetra(ArrayList<String> letra) {
		this.letra = letra;
	}


	public int getNumeroLineaActual() {
		return numeroLineaActual;
	}


	public void setNumeroLineaActual(int numeroLineaActual) {
		this.numeroLineaActual = numeroLineaActual;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
}
