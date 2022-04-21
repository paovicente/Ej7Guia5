package modelo;

public abstract class Decorator implements Interfaz{

	protected Interfaz i;
	
	private Mazo mazo = Mazo.getInstancia();
	
	public Decorator(Interfaz i) {
		this.i = i;
	}
	
	public Interfaz eligeAdversario() {
		Interfaz adversario = this;
		while (adversario == this)
			adversario = mazo.getPersonaje();
		return adversario;		
	}
}
