package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoPlano {

	public static void crearArchivoLetra(String letra, String ruta)
			throws IOException {

		File archivo = new File(ruta);
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(archivo);
		fileWriter.write(letra);
		fileWriter.close();
	}

	public static ArrayList<String> leerArchivoLetra(String ruta) {
		File archivo = new File(ruta);
		FileReader fileReader = null;

		ArrayList<String> letra = new ArrayList<String>();

		try {
			fileReader = new FileReader(archivo);
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String linea = null;
		try {
			while ((linea = bufferedReader.readLine()) != null) {
				letra.add(linea);
			}
			return letra;
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// try {
		// crearArchivoLetra("asdjkalsdjalskdjas",
		// "C:/SPB_Data/git/karaoke/Karaoke_0.1/src/archivoPlano/hola.txt");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		ArchivoPlano
				.leerArchivoLetra("C:/SPB_Data/git/karaoke/Karaoke_0.1/src/archivoPlano/cancion.txt");

	}
}
