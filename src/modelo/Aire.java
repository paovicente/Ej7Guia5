package modelo;

public class Aire extends Decorator{

	public Aire(Personaje p) {
		super(p);
	}

	@Override
	public double getAtaqueCorto() {
		return this.p.getAtaqueCorto()*1.2;	//+20%
	}

	@Override
	public double getAtaqueDistante() {
		return this.p.getAtaqueDistante()+10;	//+10
	}

	@Override
	public double getArmadura() {
		return this.p.getArmadura()*0.9;	//-10%
	}
	
	public void invocarHuracan() {
		System.out.println("Se invoco un huracan");
	}
}
