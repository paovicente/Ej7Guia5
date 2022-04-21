package modelo;

public class Tierra extends Decorator{

	public Tierra(Personaje p) {
		super(p);
	}

	private Personaje personaje;

	@Override
	public double getAtaqueCorto() {
		return personaje.getAtaqueCorto()*0.8;	//-20%
	}

	@Override
	public double getAtaqueDistante() {
		return personaje.getAtaqueDistante()*0.7;	//-30%
	}

	@Override
	public double getArmadura() {
		return personaje.getArmadura()*1.25;	//+25%
	}
	
	
}
