package linnerclass2;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador4 {
	
	public static void main(String[] args) {
		
		Reloj miReloj = new Reloj();
		
		miReloj.enMarcha(3000, true); // Pasamos los parámetros aquí
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.exit(0);
	}
}

class Reloj{
	
//	public Reloj(int intervalo, boolean sonido) { // Prescindimos del constructor
//		
//		this.intervalo = intervalo;
//		this.sonido = sonido;
//	}
	
	public void enMarcha(int intervalo, final boolean sonido) { // final se usa si se accede a dicha variable
		
		class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 seg: " + ahora);
			
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	

//	private int intervalo; // Prescindimos de las variables
//	
//	private boolean sonido;
	
}