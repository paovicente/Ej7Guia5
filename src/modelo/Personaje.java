package modelo;

import modelo.Mazo;

public abstract class Personaje {

	protected double ataqueCorto;
	protected double ataqueDistante;
	protected double armadura;
	
	public double getAtaqueCorto() {
		return this.ataqueCorto;
	}
	
	public double getAtaqueDistante() {
		return this.ataqueDistante;
	}
	
	public double getArmadura() {
		return this.armadura;
	}
	
	/*public Personaje eligeAdversario() {
		return Mazo.getPersonaje();
	}*/
}
