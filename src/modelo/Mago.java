package modelo;

public class Mago extends Personaje{

	public Mago(String nombre) {
		super(nombre);
	}

	@Override
	public double getAtaqueCorto() {
		return 50;
	}

	@Override
	public double getAtaqueDistante() {
		return 70;
	}

	@Override
	public double getArmadura() {
		return 500;
	}
}
