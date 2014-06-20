package presentacion;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import logica.Genero;
import logica.GenerosEnum;

public class Ventana extends JFrame {

	private JPanelGeneros jPanelGeneros;
	private ManejaEventos manejaEventos;
	
	public Ventana() {
		setTitle("Karaoke");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		manejaEventos = new ManejaEventos();
		jPanelGeneros = new JPanelGeneros(manejaEventos);
		manejaEventos.llamarJPanelGenero(jPanelGeneros);
		add(jPanelGeneros, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		
	}
	
}
