package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import logica.Autor;
import logica.Cancion;
import logica.Genero;

public class ArchivoBinario {

	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
	private File file;

	public void escribir(Genero genero) throws IOException {
		file = new File("./src/Files/Generos.dd");
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(genero);
		objectOutputStream.close();
	}

	
	public void leer() throws IOException, ClassNotFoundException {
		file = new File("./src/Files/Generos.dd");
		fileInputStream = new FileInputStream(file);
		objectInputStream = new ObjectInputStream(fileInputStream);
		
		Genero genero;
		genero = (Genero)objectInputStream.readObject();
		System.out.println(genero.getNombre()+" , "+genero.getListaAutores());
		objectInputStream.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		ArchivoBinario archivoBinarioClase = new ArchivoBinario();
		ArrayList<Autor> listaAutores = new ArrayList<>();
		try {
			archivoBinarioClase.leer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
