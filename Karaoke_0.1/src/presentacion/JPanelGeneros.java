package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import logica.Autor;
import logica.Genero;
import logica.GenerosEnum;
import persistencia.ArchivoBinario;

public class JPanelGeneros extends JPanel{

	private JComboBox<GenerosEnum> jComboBoxGeneros;
	private JPanel jPanelListas;
	private JList listAutores;
	private DefaultListModel modelAutores;
	private JScrollPane jScrollPaneAutores;
	private JList listCanciones;
	private DefaultListModel modelCanciones;
	private JScrollPane jScrollPaneCanciones;
	public static final String MOSTRAR_AUTOREES ="MOSTRAR_AUTORES";
	private ManejaEventos manejaEventos;
	private int indexListaAutores;
	private int indexListaTitulosCanciones;
	
	public JPanelGeneros(ManejaEventos eventos) {
		this.manejaEventos=eventos;
		setLayout(new BorderLayout());

		jComboBoxGeneros = new JComboBox<GenerosEnum>(GenerosEnum.values());
		
		jPanelListas = new JPanel();
		jPanelListas.setLayout(new GridLayout(3, 2));
		
		modelAutores = new DefaultListModel();
		listAutores = new JList(modelAutores);
		
		
		jComboBoxGeneros.addActionListener(this.manejaEventos);
		jComboBoxGeneros.setActionCommand(MOSTRAR_AUTOREES);
		
		jScrollPaneAutores = new JScrollPane(listAutores);
		
		modelCanciones = new DefaultListModel();
		listCanciones = new JList(modelCanciones);
		jScrollPaneCanciones = new JScrollPane(listCanciones);

		jPanelListas.add(jComboBoxGeneros);
		jPanelListas.add(new JLabel());
		jPanelListas.add(new JLabel("Lista de Autores"));
		jPanelListas.add(new JLabel("Lista de Canciones"));
		jPanelListas.add(jScrollPaneAutores);
		jPanelListas.add(jScrollPaneCanciones);
		
		add(jPanelListas, BorderLayout.CENTER);
		seleccionarAutor();
	}

	public int seleccionarAutor(){
		indexListaAutores = 0;
		MouseListener mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					indexListaAutores = listAutores.locationToIndex(e.getPoint());
					System.out.println("seleccionó: "+indexListaAutores);
					
				}
			}
		};
		listAutores.addMouseListener(mouseListener);
		return indexListaAutores;
	}
	
	
	public JList getListAutores() {
		return listAutores;
	}

	public void setListAutores(JList listAutores) {
		this.listAutores = listAutores;
	}

	public DefaultListModel getModelAutores() {
		return modelAutores;
	}

	public void setModelAutores(DefaultListModel modelAutores) {
		this.modelAutores = modelAutores;
	}

	public JComboBox<GenerosEnum> getjComboBoxGeneros() {
		return jComboBoxGeneros;
	}

	public void setjComboBoxGeneros(JComboBox<GenerosEnum> jComboBoxGeneros) {
		this.jComboBoxGeneros = jComboBoxGeneros;
	}

	public JList getListCanciones() {
		return listCanciones;
	}

	public void setListCanciones(JList listCanciones) {
		this.listCanciones = listCanciones;
	}

	public DefaultListModel getModelCanciones() {
		return modelCanciones;
	}

	public void setModelCanciones(DefaultListModel modelCanciones) {
		this.modelCanciones = modelCanciones;
	}
	
	
}
