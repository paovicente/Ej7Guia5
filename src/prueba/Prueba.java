package prueba;

import modelo.Interfaz;
import modelo.Mazo;
import modelo.PersonajeFactory;

public class Prueba {

	public static void main(String[] args) {

		Interfaz p1 = PersonajeFactory.getPersonaje("Mago", "Fuego", "Cazorla");
		Interfaz p2 = PersonajeFactory.getPersonaje("Hechicera", "Agua", "Luqui");
		Mazo mazo = Mazo.getInstancia();
		mazo.agregarPersonaje(p1);
		mazo.agregarPersonaje(p2);
		
		System.out.println(p1.getArmadura());
		System.out.println(p1.getAtaqueCorto());
		System.out.println(p1.getAtaqueDistante());
		
		System.out.println(p2.getArmadura());
		System.out.println(p2.getAtaqueCorto());
		System.out.println(p2.getAtaqueDistante());
	}

}
