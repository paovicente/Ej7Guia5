package modelo;

import java.util.ArrayList;

public class Mazo {

	private static Mazo instancia = null;	//patrón Singleton
	
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	
	public static Mazo getInstancia() {
		if (instancia == null)
			instancia = new Mazo();
		return instancia;
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public Personaje getPersonaje() {
		int indice = (int) Math.random()*personajes.size();
		return personajes.get(indice);
	}
	
	
}
