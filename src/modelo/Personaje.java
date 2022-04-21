package modelo;

public abstract class Personaje implements Interfaz{

	protected String nombre;
	private Mazo mazo = Mazo.getInstancia();
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*public double getAtaqueCorto() {
		return this.getAtaqueCorto();
	}
	
	public double getAtaqueDistante() {
		return this.getAtaqueDistante();
	}
	
	public double getArmadura() {
		return this.getArmadura();
	}*/
	
	public Interfaz elijeAdversario()
	{
		Interfaz adversario = this;
		while (adversario == this)
			adversario = mazo.getPersonaje();
		return adversario;
	}
}
