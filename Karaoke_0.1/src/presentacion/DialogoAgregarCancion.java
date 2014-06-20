package presentacion;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logica.Cancion;
import logica.Karaoke;

public class DialogoAgregarCancion extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String COMANDO_BOTON_GUARDAR_CANCION = "GUARDAR_CANCION";

	private JTextField nombre;
	private JTextField autor;
	private JTextField txNombre;
	private JComponent txAutor;
	private JComponent boxGenero;
	private JTextArea txLetra;
	private JButton btnGuardar;
	private JTextField txGenero;
	private Karaoke karaoke;

	public DialogoAgregarCancion() {
		karaoke = new Karaoke();

		setTitle("Karaoke");
		setLayout(new GridLayout(5, 1));
		getContentPane().setBackground(Color.WHITE);
		setSize(500, 500);

		txNombre = new JTextField();
		txNombre.setBorder(BorderFactory.createTitledBorder("Nombre"));
		add(txNombre);

		txAutor = new JTextField();
		txAutor.setBorder(BorderFactory.createTitledBorder("Autor"));
		add(txAutor);

		txGenero = new JTextField();
		txGenero.setBorder(BorderFactory.createTitledBorder("Autor"));
		add(txGenero);

		txLetra = new JTextArea();
		txLetra.setBorder(BorderFactory.createTitledBorder("Letra"));
		add(txLetra);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setActionCommand(COMANDO_BOTON_GUARDAR_CANCION);
		btnGuardar.addActionListener(this);
		add(btnGuardar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case COMANDO_BOTON_GUARDAR_CANCION:
			JFileChooser jFileChooser = new JFileChooser("./");
			int opcion = jFileChooser.showSaveDialog(this);
			if (opcion == JFileChooser.APPROVE_OPTION) {
				String ruta = jFileChooser.getSelectedFile().getPath();
//				Cancion cancion = new Cancion(txNombre.getText());
//				karaoke.agregarCancion(txLetra.getText(), cancion, ruta);
			}
			break;

		default:
			break;
		}

	}
	
	public static void main(String[] args) {
		DialogoAgregarCancion agregarCancion = new DialogoAgregarCancion();
		agregarCancion.setVisible(true);
	}

}
