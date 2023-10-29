package view;

import controller.ControllerBarras;
import model.Barra;

public class Principal {

	public static void main(String[] args) {
		ControllerBarras c = new ControllerBarras();
		
		//Valores que entram na fila 
		Barra b = new Barra ();
		b.volume = 59;
		Barra b1 = new Barra ();
		b1.volume = 55;
		Barra b2 = new Barra ();
		b2.volume = 105.1;
		Barra b3 = new Barra ();
		b3.volume = 160.2;
		Barra b4 = new Barra ();
		b4.volume = 210.5;
		Barra b5 = new Barra ();
		b5.volume = 272.72;
		
		// Valores que não entram
		Barra b6 = new Barra ();
		b6.volume = 49;
		Barra b7 = new Barra ();
		b7.volume = 80;
		Barra b8 = new Barra ();
		b8.volume = 145;
		Barra b9 = new Barra ();
		b8.volume = 199;
		Barra b10 = new Barra ();
		b10.volume = 221.6;
		Barra b11 = new Barra ();
		b11.volume = 280;
		
		try {
			c.add(b);
			c.add(b1);
			c.add(b2);
			c.add(b3);
			c.add(b4);
			c.add(b5);
			c.add(b6);
			c.add(b7);
			c.add(b8);
			c.add(b9);
			c.add(b10);
			c.add(b11);
			c.conta();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
