package modelo;

public class Agua extends Decorator{

	private Personaje personaje;

	@Override
	public double getAtaqueCorto() {
		return personaje.getAtaqueCorto()*1.2;	//+20%
	}

	//para el ataque distante no implemento método ya que queda igual el valor, no se le suma ni resta nada
	
	@Override
	public double getArmadura() {
		return personaje.getArmadura()*0.85;	//-15%
	}
	
}
