package testKaraoke;

import javax.swing.JFrame;

import persistencia.ArchivoBinario;

public class TestKaraoke {

	public static void main(String[] args) {
		ArchivoBinario archivoBinario = new ArchivoBinario();
		archivoBinario.crearArchivo();
	}
}
