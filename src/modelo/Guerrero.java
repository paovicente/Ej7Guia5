package modelo;

public class Guerrero extends Personaje{

	@Override
	public double getAtaqueCorto() {
		return 100;
	}

	@Override
	public double getAtaqueDistante() {
		return 100;
	}

	@Override
	public double getArmadura() {
		return 1500;
	}
	
}