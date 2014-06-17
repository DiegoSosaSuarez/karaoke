package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import logica.GenerosEnum;
import persistencia.ArchivoBinario;

public class JPanelGeneros extends JPanel{

	private ArchivoBinario archivoBinario;
	private JComboBox<GenerosEnum> jComboBoxGeneros;
	private JButton jButtonMuestraAutores;
	private JTextArea jTextAreaAutores;
	private JList listAutores;
	private DefaultListModel modelAutores;
	private JScrollPane jScrollPaneAutores;
	
	public JPanelGeneros() {
		setLayout(new BorderLayout());
		archivoBinario = new ArchivoBinario();

		jComboBoxGeneros = new JComboBox<GenerosEnum>(GenerosEnum.values());
		
		
		jTextAreaAutores = new JTextArea();
		
		modelAutores = new DefaultListModel<>();
		listAutores = new JList(modelAutores);
		
		
		
		
		jScrollPaneAutores = new JScrollPane(listAutores);
		
		
		
		jButtonMuestraAutores = new JButton("Mostrar Autores");
		jButtonMuestraAutores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jTextAreaAutores.setText("");
					jTextAreaAutores.append(""+archivoBinario.leerAutores(jComboBoxGeneros.getSelectedIndex()));
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});

		add(jComboBoxGeneros, BorderLayout.NORTH);
		add(jButtonMuestraAutores, BorderLayout.SOUTH);
		add(jTextAreaAutores, BorderLayout.CENTER);
		
		
		
		
		
	}
	
}
