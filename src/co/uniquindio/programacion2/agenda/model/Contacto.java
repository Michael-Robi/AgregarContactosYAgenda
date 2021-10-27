package co.uniquindio.programacion2.agenda.model;

/**
 * Clase Contacto
 * @author Curso programaci�n 2 nocturna
 *
 */
public class Contacto {
	
	Grupo [] listGruposAsociados;
	
	// Declaracion de los atributos
	private String nombre;
	private String telefono;
	
	/**
	 * Metodo constructor para inicializar solo el nombre
	 * @param nombre
	 */
	public Contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = "0000000000";
	}
	
	/**
	 * Metodo constructor para inicializar nombre y teléfono
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		
		listGruposAsociados = new Grupo [3];
	}

	/**
	 * Metodo para obtener el nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para modificar el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el teléfono
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo para modificar el teléfono
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}
