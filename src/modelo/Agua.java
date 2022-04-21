package modelo;

public class Agua extends Decorator{
	
	public Agua(Personaje p) {
		super(p);
	}

	@Override
	public double getAtaqueCorto() {
		return this.p.getAtaqueCorto()*1.2;	//+20%
	}

	//para el ataque distante no implemento método ya que queda igual el valor, no se le suma ni resta nada
	
	@Override
	public double getArmadura() {
		return this.p.getArmadura()*0.85;	//-15%
	}
	
}
