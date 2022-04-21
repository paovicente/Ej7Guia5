package modelo;

public class Tierra extends Decorator{

	public Tierra(Interfaz i) {
		super(i);
	}

	@Override
	public double getAtaqueCorto() {
		return this.i.getAtaqueCorto()*0.8;	//-20%
	}

	@Override
	public double getAtaqueDistante() {
		return this.i.getAtaqueDistante()*0.7;	//-30%
	}

	@Override
	public double getArmadura() {
		return this.i.getArmadura()*1.25;	//+25%
	}
	
	
}
