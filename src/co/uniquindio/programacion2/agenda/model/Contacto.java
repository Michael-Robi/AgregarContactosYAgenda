package co.uniquindio.programacion2.agenda.model;

/**
 * Clase Contacto
 * @author Curso programación 2 nocturna
 *
 */
public class Contacto {
	
	Grupo [] listGruposAsociados;
	
	// Declaracion de los atributos
	private String nombre;
	private int edad;
	private String telefono;
	
	/**
	 * Metodo constructor para inicializar solo el nombre
	 * @param nombre
	 */
	public Contacto(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		this.telefono = "0000000000";
	}
	
	/**
	 * Metodo constructor para inicializar nombre y telÃ©fono
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, String telefono, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
	
	/**
	 * Metodo edad
	 * @return 
	 */
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Grupo[] getListGruposAsociados() {
		return listGruposAsociados;
	}

	public void setListGruposAsociados(Grupo[] listGruposAsociados) {
		this.listGruposAsociados = listGruposAsociados;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono +"]";
	}

	public boolean ContactoConVocal() { 
		
		char caracter1 = this.getNombre().charAt(0);//Obtener de nombre la primera posicion
		char letraMinuscula =  Character.toLowerCase(caracter1); 
		
		if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') { //Si inicia con vocal
			return true;
		}
		
		return false;
	}
	
}
