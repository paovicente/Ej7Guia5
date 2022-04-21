package modelo;

public class Dragon extends Personaje{

	@Override
	public double getAtaqueCorto() {
		return 500;
	}

	@Override
	public double getAtaqueDistante() {
		return 200;
	}

	@Override
	public double getArmadura() {
		return 10000;
	}
	
}
