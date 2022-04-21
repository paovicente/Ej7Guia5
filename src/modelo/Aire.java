package modelo;

public class Aire extends Decorator{

	private Personaje personaje;

	@Override
	public double getAtaqueCorto() {
		return personaje.getAtaqueCorto()*1.2;	//+20%
	}

	@Override
	public double getAtaqueDistante() {
		return personaje.getAtaqueDistante()+10;	//+10
	}

	@Override
	public double getArmadura() {
		return personaje.getArmadura()*0.9;	//-10%
	}
	
	public void invocarHuracan() {
		System.out.println("Se invoco un huracan");
	}
}
