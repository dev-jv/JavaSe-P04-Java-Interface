package interfaces4;

import javax.swing.*; // Timer

import java.awt.event.*;

import java.util.*; // Timer

import javax.swing.Timer; // Aclara la confisión respecto que Timer utilizaremos

public class PruebaTemporizador {
	
	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();
		
		//actionListener oyente = dameLaHora();
		
		Timer mitemporizador = new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa para detener");
		
		System.exit(0);
	}
}

class DameLaHora implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 seg: " + ahora);
		
	}
}












