package modelo;

public class Fuego extends Decorator{

	private Personaje personaje;

	@Override
	public double getAtaqueCorto() {
		return personaje.getAtaqueCorto()*1.8;	//+80%
	}

	@Override
	public double getAtaqueDistante() {
		return personaje.getAtaqueDistante()*1.7;	//+70%
	}

	@Override
	public double getArmadura() {
		return personaje.getArmadura()*0.5;	//-50%
	}

	public void incendiar() {
		System.out.println("Incendio");
	}
	
}
