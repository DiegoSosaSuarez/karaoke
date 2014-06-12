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
import logica.Karaoke;

public class ArchivoBinario {

	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
	private File file;

	public ArchivoBinario() {
		
	}
	
	public void escribirGenero(Karaoke karaoke) throws IOException {
		file = new File("./src/Files/Generos.ds");
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(karaoke);
		objectOutputStream.close();
	}

	public void escribirAutor(Genero genero) throws IOException {
		file = new File("./src/Files/Autores.ds");
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(genero);
		objectOutputStream.close();
	}
	
	public void leerGeneros() throws IOException, ClassNotFoundException {
		file = new File("./src/Files/Generos.ds");
		fileInputStream = new FileInputStream(file);
		objectInputStream = new ObjectInputStream(fileInputStream);
		Karaoke karaoke;
		karaoke = (Karaoke)objectInputStream.readObject();
		for (Genero nombreGenero : karaoke.getListsGeneros()) {
			System.out.println(nombreGenero.getNombre());
		}
		
		objectInputStream.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		ArchivoBinario archivoBinarioClase = new ArchivoBinario();
		
		Karaoke karaoke = new Karaoke();
		karaoke.agregarGenero(new Genero("Vallenato"));
		karaoke.agregarGenero(new Genero("Rock"));
		karaoke.agregarGenero(new Genero("Salsa"));
		karaoke.agregarGenero(new Genero("Pop"));
		karaoke.agregarGenero(new Genero("Carranga"));
		karaoke.agregarGenero(new Genero("Reggue"));
		karaoke.agregarGenero(new Genero("Cumbia"));
		
		Genero autor = new Genero();
		autor.agregarAutor(new Autor("Juan Fernando Velasco"));
		autor.agregarAutor(new Autor("Jorge Velosa"));
		autor.agregarAutor(new Autor("Andres Cepeda"));
		autor.agregarAutor(new Autor("Los inquietos"));
		autor.agregarAutor(new Autor("EL Binomio"));
		
		
		try {
			archivoBinarioClase.escribirAutor(autor);
			//archivoBinarioClase.leerGeneros();
			//archivoBinarioClase.escribirGenero(karaoke);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
