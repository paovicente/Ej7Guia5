package modelo;

public abstract class Decorator extends Personaje{

	protected Personaje p;
	
	public Decorator(Personaje p) {
		this.p = p;
	}
	
}
