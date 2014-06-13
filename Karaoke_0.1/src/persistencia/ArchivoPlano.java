package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ArchivoPlano {

	private String linea;

	public void datosPersonas() throws Exception {
		JFileChooser jf = new JFileChooser();
		int opcion = jf.showOpenDialog(null);

		if (opcion == JFileChooser.APPROVE_OPTION) {
			File archivo = jf.getSelectedFile();
			try {
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error","No se encuentra el archivo",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		ArchivoPlano archivoPlano  = new ArchivoPlano();
		try {
			archivoPlano.datosPersonas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
