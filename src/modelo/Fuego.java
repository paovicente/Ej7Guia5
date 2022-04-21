package modelo;

public class Fuego extends Decorator{

	public Fuego(Personaje p) {
		super(p);
	}

	@Override
	public double getAtaqueCorto() {
		return this.p.getAtaqueCorto()*1.8;	//+80%
	}

	@Override
	public double getAtaqueDistante() {
		return this.p.getAtaqueDistante()*1.7;	//+70%
	}

	@Override
	public double getArmadura() {
		return this.p.getArmadura()*0.5;	//-50%
	}

	public void incendiar() {
		System.out.println("Incendio");
	}
	
}
