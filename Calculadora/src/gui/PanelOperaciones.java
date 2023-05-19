package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel implements ActionListener{
	
	private static final String SUMA = "SUMA";
	private static final String RESTA = "RESTA";
	
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplicacion;
	private JButton btnDivision;
	
	private VentanaCalculadora padre;
	
	public PanelOperaciones(VentanaCalculadora papa) {
		
		padre = papa;
		
		setBorder(new TitledBorder("Operaciones"));
		
		btnSuma = new JButton("+");
		btnSuma.setPreferredSize(new Dimension(50, 30));
		btnSuma.addActionListener(this);
		btnSuma.setActionCommand(SUMA);
		
		btnResta = new JButton("-");
		btnResta.setPreferredSize(new Dimension(50, 30));
		btnResta.addActionListener(this);
		btnResta.setActionCommand(RESTA);
		
		btnMultiplicacion = new JButton("X");
		btnMultiplicacion.setPreferredSize(new Dimension(50, 30));
		btnMultiplicacion.addActionListener(this);
		
		btnDivision = new JButton("/");
		btnDivision.setPreferredSize(new Dimension(50, 30));
		btnDivision.addActionListener(this);
		setLayout(new FlowLayout());

		add(btnSuma);
		add(btnResta);
		add(btnMultiplicacion);
		add(btnDivision);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if(grito.equals(SUMA)) {
			padre.sumar();
		}
		
	}
	

}













