package presentacion;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import logica.GenerosEnum;
import persistencia.ArchivoBinario;

public class JPanelGeneros extends JPanel{

	private ArchivoBinario archivoBinario;
	private JComboBox<GenerosEnum> jComboBoxGeneros;
	
	
	public JPanelGeneros() {
		jComboBoxGeneros = new JComboBox<>();
		jComboBoxGeneros.addItem(GenerosEnum.VALLENATO);
		jComboBoxGeneros.addItem(GenerosEnum.ROCK);
		jComboBoxGeneros.addItem(GenerosEnum.SALSA);
		jComboBoxGeneros.addItem(GenerosEnum.POP);
		
		add(jComboBoxGeneros);
		
	}
	
}
