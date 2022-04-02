package umu.tds.lanzador;

import java.awt.EventQueue;

import umu.tds.vista.LoginView;

/**
 * Hello world!
 *
 */
public class AppVideo {

	public static void main(final String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView ventana = new LoginView();
					ventana.mostrarVentana();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
}
