package presentacion;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import logica.GenerosEnum;

public class Ventana extends JFrame {

	private JPanelGeneros jPanelGeneros;
	
	public Ventana() {
		setTitle("Karaoke");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		jPanelGeneros = new JPanelGeneros();
		add(jPanelGeneros, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		
	}
	
}
