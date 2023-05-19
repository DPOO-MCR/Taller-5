package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import mundo.Calculadora;

public class VentanaCalculadora extends JFrame{

	private PanelEntradas panelEntradas;
	private PanelOperaciones panelOperaciones;
	private Calculadora calc;
	
	public VentanaCalculadora() {
	
		calc = new Calculadora();
		
		//ESTO NO VA A CAMBIAR
		panelEntradas = new PanelEntradas();
		
		//ESTO VA A CAMBIAR!
		panelOperaciones = new PanelOperaciones(this);
		
		setLayout(new BorderLayout());
		
		add(panelEntradas, BorderLayout.NORTH);
		add(panelOperaciones, BorderLayout.SOUTH);
		
		setSize(new Dimension(300,185));
		setResizable(false);
		setTitle("Calculadora :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void sumar() {
		double n1 = panelEntradas.darNumero1();
		double n2 = panelEntradas.darNumero2();
		panelEntradas.actualizarResultado(calc.sumar(n1, n2)+"");
	}
	
	
	public static void main(String[] args) {
		VentanaCalculadora vc = new VentanaCalculadora();
	}
	
}





