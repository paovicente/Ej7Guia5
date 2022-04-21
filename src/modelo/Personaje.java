package modelo;

import modelo.Mazo;

public abstract class Personaje {

	protected String nombre;
		
	public Personaje(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAtaqueCorto() {
		return this.getAtaqueCorto();
	}
	
	public double getAtaqueDistante() {
		return this.getAtaqueDistante();
	}
	
	public double getArmadura() {
		return this.getArmadura();
	}
	
	/*public Personaje eligeAdversario() {
		return Mazo.getPersonaje();
	}*/
}
