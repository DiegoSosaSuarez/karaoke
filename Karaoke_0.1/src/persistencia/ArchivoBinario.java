package persistencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

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

	private Genero autor;
	
	public ArchivoBinario() {
		
	}
	
	public void escribirGenero(Karaoke karaoke) throws IOException {
		file = new File("./src/Files/Generos.dd");
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(karaoke);
		objectOutputStream.close();
	}

	public void escribirAutor(Genero genero) throws IOException {
		file = new File("./src/Files/Autores.dd");
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(genero);
		objectOutputStream.close();
	}
	
	public Karaoke leerGeneros() throws IOException, ClassNotFoundException {
		file = new File("./src/Files/Generos.dd");
		fileInputStream = new FileInputStream(file);
		objectInputStream = new ObjectInputStream(fileInputStream);
		Karaoke karaoke;
		karaoke = (Karaoke)objectInputStream.readObject();
		for (Genero nombreGenero : karaoke.getListsGeneros()) {
//			System.out.println(nombreGenero.getNombre());
		}
		objectInputStream.close();
		return karaoke;
	}
	public void leerAutores(int posicion) throws IOException, ClassNotFoundException {
		file = new File("./src/Files/Autores.dd");
		fileInputStream = new FileInputStream(file);
		objectInputStream = new ObjectInputStream(fileInputStream);
		Genero genero;
		genero = (Genero)objectInputStream.readObject();
		for (Autor autor : genero.getListaAutores()) {
			if(autor.getGenero().getNombre().equals(leerGeneros().getListsGeneros().get(posicion).getNombre())){
				System.out.println(autor.getNombre()+" --- "+autor.getGenero().getNombre());
			}
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
		karaoke.agregarGenero(new Genero("Reggae"));
		karaoke.agregarGenero(new Genero("Cumbia"));
		karaoke.agregarGenero(new Genero("Bolero"));
		karaoke.agregarGenero(new Genero("Merengue"));
		karaoke.agregarGenero(new Genero("Bachata"));
		karaoke.agregarGenero(new Genero("Tropical"));
		karaoke.agregarGenero(new Genero("Tango"));
		karaoke.agregarGenero(new Genero("Ranchera"));
		karaoke.agregarGenero(new Genero("Reguetón"));
		karaoke.agregarGenero(new Genero("Samba"));
		karaoke.agregarGenero(new Genero("Electrónica"));
		karaoke.agregarGenero(new Genero("Metálica"));
		

				try {
//				archivoBinarioClase.leerGeneros();
					archivoBinarioClase.leerAutores(5);
//					archivoBinarioClase.escribirGenero(karaoke);
				} catch (IOException e) {
					e.printStackTrace();
				}
//				archivoBinarioClase.escribirAutor(autor);
	}
	
	public void creaAutores(){

		
		
		
		
//		autor = new Genero();
//		autor.agregarAutor(new Autor("Juan Fernando Velasco", karaoke.getListsGeneros().get(3)));
//		autor.agregarAutor(new Autor("Jorge Velosa", karaoke.getListsGeneros().get(4)));
//		autor.agregarAutor(new Autor("Andres Cepeda", karaoke.getListsGeneros().get(3)));
//		autor.agregarAutor(new Autor("Los inquietos", karaoke.getListsGeneros().get(0)));
//		autor.agregarAutor(new Autor("Silvestr Dangond", karaoke.getListsGeneros().get(0)));
//		autor.agregarAutor(new Autor("Shakira", karaoke.getListsGeneros().get(4)));
//		autor.agregarAutor(new Autor("Juanes", karaoke.getListsGeneros().get(4)));
//		autor.agregarAutor(new Autor("Diomedes Diaz", karaoke.getListsGeneros().get(0)));
//		autor.agregarAutor(new Autor("Mikey Taveras", karaoke.getListsGeneros().get(2)));
//		autor.agregarAutor(new Autor("Joe Arroyo", karaoke.getListsGeneros().get(2)));
//		autor.agregarAutor(new Autor("Grupo Niche", karaoke.getListsGeneros().get(2)));
//		autor.agregarAutor(new Autor("Marc Anthony", karaoke.getListsGeneros().get(2)));
		
		
		
	
	}
	
	
}
