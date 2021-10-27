package co.uniquindio.programacion2.agenda.model;

import java.util.Arrays;
import java.util.Iterator;

import co.uniquindio.programacion2.agenda.exceptions.ContactoExcepction;

/**
 * Clase Agenda
 * @author Curso programación 2 nocturna
 *
 */
public class Agenda {
	
	private String nombre;
	private Contacto[] listContactos;
	private Grupo[] listGrupos;
	private int tamanioListContactos;
	private int tamanioListGrupos;
//	private int numContactos = 0;
//	private int numGrupos = 0;
	
	/**
	 * Metodo constructor vacio en el cual sus parametros se asignan por defecto
	 */
	public Agenda() {
		this.nombre = "AgendaDefecto";
		this.tamanioListContactos = 10;
		this.tamanioListGrupos = 10;
		this.listContactos = new Contacto[this.tamanioListContactos];
		this.listGrupos = new Grupo[this.tamanioListGrupos];
	}
	
	/**
	 * Metodo contructor en el cual se le asigna el nombre por parametro
	 * y el tamaño de los arreglos se asignan por defectos
	 * @param nombre
	 */
	public Agenda(String nombre) {
		this.nombre = nombre;
		this.tamanioListContactos = 10;
		this.tamanioListGrupos = 10;
		this.listContactos = new Contacto[this.tamanioListContactos];
		this.listGrupos = new Grupo[this.tamanioListGrupos];
	}
	
	/**
	 * Metodo constructor en el cual se asignan los datos por medio de paramtros
	 * 
	 * @param nombre
	 * @param tamanioListContacto
	 * @param tamanioListGrupo
	 */
	public Agenda(String nombre,int tamanioListContactos,int tamanioListGrupos) {
		this.nombre = nombre;
		this.tamanioListContactos = tamanioListContactos;
		this.tamanioListGrupos = tamanioListGrupos;
		this.listContactos = new Contacto[this.tamanioListContactos];
		this.listGrupos = new Grupo[this.tamanioListGrupos];
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the listContactos
	 */
	public Contacto[] getListContactos() {
		return listContactos;
	}
	
	/**
	 * @param listContactos the listContactos to set
	 */
	public void setListContactos(Contacto[] listContactos) {
		this.listContactos = listContactos;
	}

	/**
	 * @return the listGrupos
	 */
	public Grupo[] getListGrupos() {
		return listGrupos;
	}

	/**
	 * @param listGrupos the listGrupos to set
	 */
	public void setListGrupos(Grupo[] listGrupos) {
		this.listGrupos = listGrupos;
	}
	
	/**
	 * @return the tamanioListContactos
	 */
	public int getTamanioListContactos() {
		return tamanioListContactos;
	}

	/**
	 * @param tamanioListContactos the tamanioListContactos to set
	 */
	public void setTamanioListContactos(int tamanioListContactos) {
		this.tamanioListContactos = tamanioListContactos;
	}

	/**
	 * @return the tamanioListGrupos
	 */
	public int getTamanioListGrupos() {
		return tamanioListGrupos;
	}

	/**
	 * @param tamanioListGrupos the tamanioListGrupos to set
	 */
	public void setTamanioListGrupos(int tamanioListGrupos) {
		this.tamanioListGrupos = tamanioListGrupos;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", listContactos=" + Arrays.toString(listContactos) + ", listGrupos="
				+ Arrays.toString(listGrupos) + "]";
	}
	
	// Crud
	
	/**
	 * Metodo CrearContacto()
	 * @param nombre
	 * @param telefono
	 */
	public void crearContacto(String nombre, String telefono) throws ContactoExcepction {
		Contacto contactoExistente = null;
		int posicion = -1;
		
		//1Validar que no exista
		contactoExistente = obtenerContacto(telefono);
		
		if (contactoExistente == null) {
			
			//2. Validar una posicion disponible(0-9)
			posicion = obtenerPosicion();
			
			if (posicion != -1) {
				
				//3. Crear el Contacto
				Contacto contacto = new Contacto(nombre, telefono);
				
				//4. Agregarlo al arreglo (lista)
				listContactos[posicion] = contacto;
			}else {
				//Lanzar una expeción
				throw new ContactoExcepction("No se puede agregar mas contactos al arreglo. Esta lleno");
			}
		}else {
			//Lanzar la excepción
			throw new ContactoExcepction("El contacto ya existe");
		}
	}
	
	/**
	 * obtenerPosicion()
	 * @return posicion
	 */
	private int obtenerPosicion() {

		int posicion = -1;
		
		for (int i = 0; i < listContactos.length; i++) {
			
			if(listContactos[i] == null){
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}
	
	/**
	 * Metodo obtenerContacto()
	 * @param telefono
	 * @return
	 */
	private Contacto obtenerContacto(String telefono) {
		
		Contacto contacto = null;
		
		for(int i = 0; i < listContactos.length; i++){
			
			contacto = listContactos[i];
			
			if(contacto != null && contacto.getTelefono().equals(telefono)){
				break;
			}
		}
		return contacto; 
	}

	public void mostrarContactos() {
		
		Contacto contacto = null;
		
		for (int i = 0; i < listContactos.length; i++) {
			
			contacto = listContactos[i];
			
			if (contacto!=null) {
				System.out.println(contacto.toString());
			}
		}
		
	}
	
//	public void agregarContacto(Contacto c) {
//		listContactos[numContactos++] = c;
//	}
//	
//	public void mostrarContacto() {
//		for (int i = 0; i < listContactos.length; i++) {
//			if (listContactos[i]!=null) {
//				System.out.println(listContactos[i].toString());
//			}
//		}
//	}
//	
//	public void agregarGrupo(Grupo g) {
//		listGrupos[numGrupos++] = g;
//	}
//	
//	public void mostrarGrupo() {
//		for (int i = 0; i < listGrupos.length; i++) {
//			if (listGrupos[i]!=null) {
//				System.out.println(listGrupos[i].toString());
//			}
//		}
//	}

}
