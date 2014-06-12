package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ArchivoBinario {

	private File file;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	
	
	public void crearArchivo() {
		JFileChooser jf = new JFileChooser("src/files");
//		int opcion = jf.showOpenDialog(null);
		int opcion = jf.showSaveDialog(null);
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath());
		}
	}
	
	public void escribirArchivo() throws IOException {
		fileOutputStream = new FileOutputStream(file);
		for (int i = 0; i < 256; i++) {
			fileOutputStream.write(i);			
		}
	}
	
	public void leerArchivo() throws IOException {
		JFileChooser jf = new JFileChooser("src/files");
//		int opcion = jf.showOpenDialog(null);
		int opcion = jf.showSaveDialog(null);
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath());
		} 
		
		fileInputStream = new FileInputStream(file);
		int c;
		while((c = fileInputStream.read()) != -1){
			 System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		ArchivoBinario archivoBinario = new ArchivoBinario();
		archivoBinario.crearArchivo();
		try {
//			archivoBinario.escribirArchivo();
			archivoBinario.leerArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
