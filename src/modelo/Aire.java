package modelo;

public class Aire extends Decorator{

	public Aire(Interfaz i) {
		super(i);
	}

	@Override
	public double getAtaqueCorto() {
		return this.i.getAtaqueCorto()*1.2;	//+20%
	}

	@Override
	public double getAtaqueDistante() {
		return this.i.getAtaqueDistante()+10;	//+10
	}

	@Override
	public double getArmadura() {
		return this.i.getArmadura()*0.9;	//-10%
	}
	
	public void invocarHuracan() {
		System.out.println("Se invoco un huracan");
	}
}
