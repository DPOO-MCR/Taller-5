package gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradas extends JPanel{

	private JLabel lbNum1;
	private JLabel lbNum2;
	private JLabel lbResultado;
	
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;
	
	public PanelEntradas() {

		lbNum1 = new JLabel("Número 1");
		lbNum1.setPreferredSize(new Dimension(50, 20));
		
		txtNum1 = new JTextField();
		txtNum1 .setPreferredSize(new Dimension(50, 20));

		lbNum2 = new JLabel("Número 2");
		lbNum2.setPreferredSize(new Dimension(50, 20));
		
		txtNum2 = new JTextField();
		txtNum2 .setPreferredSize(new Dimension(50, 20));

		
		lbResultado = new JLabel("Resultado");
		lbResultado.setPreferredSize(new Dimension(50, 20));
		
		txtResultado = new JTextField();
		txtResultado.setPreferredSize(new Dimension(50, 20));
		txtResultado.setEditable(false);

		
		setBorder(new TitledBorder("Entradas"));

		setLayout(new GridLayout(3,2));
		
//		GridLayout gl = new GridLayout();
//		setLayout(gl);
		
		add(lbNum1);
		add(txtNum1);
		add(lbNum2);
		add(txtNum2);
		add(lbResultado);
		add(txtResultado);

		
	}
	
	public double darNumero1() {
		double n1 = Double.parseDouble(txtNum1.getText());
		return n1;
	}

	public double darNumero2() {
		double n2 = Double.parseDouble(txtNum2.getText());
		return n2;
	}
	
	public void actualizarResultado(String valor) {
		txtResultado.setText(valor);
	}
	
}

















