package modelo;

public class Fuego extends Decorator{

	public Fuego(Interfaz i) {
		super(i);
	}

	@Override
	public double getAtaqueCorto() {
		return this.i.getAtaqueCorto()*1.8;	//+80%
	}

	@Override
	public double getAtaqueDistante() {
		return this.i.getAtaqueDistante()*1.7;	//+70%
	}

	@Override
	public double getArmadura() {
		return this.i.getArmadura()*0.5;	//-50%
	}

	public void incendiar() {
		System.out.println("Incendio");
	}
	
}
