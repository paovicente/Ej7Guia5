package modelo;

public class PersonajeFactory {

	public static Decorator getPersonaje(String tipo, String elemento, String nombre) {
		
		Interfaz personaje = null;
		Decorator personajeConTipo = null;
		
		if (tipo.equalsIgnoreCase("MAGO"))
			personaje = new Mago(nombre);
		else if (tipo.equalsIgnoreCase("ELFO"))
			personaje = new Elfo(nombre);
		else if (tipo.equalsIgnoreCase("HECHICERA"))
			personaje = new Hechicera(nombre);
		else if (tipo.equalsIgnoreCase("DRAGON"))
			personaje = new Dragon(nombre);
		else if (tipo.equalsIgnoreCase("GUERRERO"))
			personaje = new Guerrero(nombre);

		if (personaje != null){
			if (elemento.equalsIgnoreCase("FUEGO"))
				personajeConTipo = new Fuego(personaje);
			else if (elemento.equalsIgnoreCase("AGUA"))
				personajeConTipo = new Agua(personaje);
			else if (elemento.equalsIgnoreCase("AIRE"))
				personajeConTipo = new Aire(personaje);
			else if (elemento.equalsIgnoreCase("TIERRA"))
				personajeConTipo = new Tierra(personaje);		
		}

		return personajeConTipo;
	}
}
