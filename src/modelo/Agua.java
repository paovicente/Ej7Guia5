package modelo;

public class Agua extends Decorator{
	
	public Agua(Interfaz i) {
		super(i);
	}

	@Override
	public double getAtaqueCorto() {
		return this.i.getAtaqueCorto()*1.2;	//+20%
	}

	@Override
	public double getAtaqueDistante() {
		return this.i.getAtaqueDistante();
	}
	
	@Override
	public double getArmadura() {
		return this.i.getArmadura()*0.85;	//-15%
	}
	
}
