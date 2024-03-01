package main;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		SomaController sfat = new SomaController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
		while(n > 12) {
			n = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
		}
		double ressoma = 0.0;
		double resultado = sfat.soma(n, ressoma);
		System.out.println(resultado);
	}

}
