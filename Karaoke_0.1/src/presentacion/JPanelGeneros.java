package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import logica.Autor;
import logica.Genero;
import logica.GenerosEnum;
import persistencia.ArchivoBinario;

public class JPanelGeneros extends JPanel{

	private ArchivoBinario archivoBinario;
	private JComboBox<GenerosEnum> jComboBoxGeneros;
	private JList listAutores;
	private DefaultListModel modelAutores;
	private JScrollPane jScrollPaneAutores;
	
	public JPanelGeneros() {
		setLayout(new BorderLayout());
		archivoBinario = new ArchivoBinario();

		jComboBoxGeneros = new JComboBox<GenerosEnum>(GenerosEnum.values());
		
		modelAutores = new DefaultListModel();
		listAutores = new JList(modelAutores);
		
		jComboBoxGeneros.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				modelAutores.clear();
				try {
					archivoBinario.leerAutores(jComboBoxGeneros.getSelectedIndex());
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				for (int i = 0; i < archivoBinario.getListAutoresEscogidos().size(); i++) {
					modelAutores.addElement(archivoBinario.getListAutoresEscogidos().get(i));
				}
				
			}
		});
		
		
		jScrollPaneAutores = new JScrollPane(listAutores);
		
	

		add(jComboBoxGeneros, BorderLayout.NORTH);
		add(jScrollPaneAutores, BorderLayout.CENTER);
		
		
	}
	
	
	
	
	
}
