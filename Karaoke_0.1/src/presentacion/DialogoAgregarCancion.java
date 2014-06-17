package presentacion;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JTextField;

public class DialogoAgregarCancion extends JDialog {
	
	private JTextField nombre;
	private JTextField autor;
	

	public DialogoAgregarCancion() {
		setTitle("Agregar Cancion");
		setSize(300, 280);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
}
