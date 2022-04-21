package modelo;

import java.util.ArrayList;

public class Mazo {

	private static Mazo instancia = null;	//patrón Singleton
	
	private ArrayList<Interfaz> personajes = new ArrayList<Interfaz>();
	
	public static Mazo getInstancia() {
		if (instancia == null)
			instancia = new Mazo();
		return instancia;
	}

	public ArrayList<Interfaz> getPersonajes() {
		return personajes;
	}

	public Interfaz getPersonaje() {
		int indice = (int) Math.random()*personajes.size();
		return personajes.get(indice);
	}
	
	public void agregarPersonaje(Interfaz personaje) {
		this.personajes.add(personaje);
	}
	
	public void eliminarPersonaje(Interfaz personaje) {
		this.personajes.remove(personaje);
	}
}
