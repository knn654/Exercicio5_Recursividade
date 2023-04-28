package view;
import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
		System.out.println(Controller.contNum(num)); 
		
	}
}