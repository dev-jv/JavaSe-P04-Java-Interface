package linnerclass1;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador3 {
	
	public static void main(String[] args) {
		
		Reloj miReloj = new Reloj(3000, true);
		
		miReloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.exit(0);
	}
}


class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	
	public void enMarcha() {
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	private class DameLaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 seg: " + ahora);
		
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
	
	
	private int intervalo;
	
	private boolean sonido;
}