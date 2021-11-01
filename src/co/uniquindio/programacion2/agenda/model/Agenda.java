package co.uniquindio.programacion2.agenda.model;

import java.util.Arrays;

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
	private int numGrupos = 0;
	
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
	public void crearContacto(String nombre, String telefono, int edad) throws ContactoExcepction {
		Contacto contactoExistente = null;
		int posicion = -1;
		
		//1Validar que no exista
		contactoExistente = obtenerContacto(telefono);
		
		if (contactoExistente == null) {
			
			//2. Validar una posicion disponible(0-9)
			posicion = obtenerPosicion();
			
			if (posicion != -1) {
				
				//3. Crear el Contacto
				Contacto contacto = new Contacto(nombre, telefono, edad);
				
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
	public Contacto obtenerContacto(String telefono) {
		
		Contacto contacto = null;
		
		for(int i = 0; i < listContactos.length; i++){
			
			contacto = listContactos[i];
			
			if(contacto != null && contacto.getTelefono().equals(telefono)){
				break;
			}
		}
		return contacto; 
	}
	
	/**
	 * Metodo eliminarContacto() 
	 * @param telefono
	 */
	private void eliminarContacto(String telefono){
		
		Contacto contacto;
		
	    contacto = obtenerContacto(telefono);
	    
	    if(contacto != null){
	    	
	    	contacto = null;
	    }
		
	}
	
	/**
	 * Metodo ActualizarContacto()
	 * @param telefono
	 * @return
	 */
	private String ActualizarContacto(String telefono, String nombre){
		
		Contacto contacto = null;
		String mensaje = " El contacto no se pudo actualizar";
		
		for(int i = 0; i < this.listContactos.length; i++){
			
			
			if(existeContacto(telefono) == true){
				contacto = listContactos[i];
				contacto.setNombre(nombre);
				mensaje = "El contacto fue actualizado";
				
			}
		}
		
		return mensaje;
		
	}

	/**
	 * Metodo verificarAgendaLlena()
	 * @return
	 */
	private boolean verificarAgendaLlena(){
		
		boolean agendaLlena = true;
		
		for(int i = 0; i<listContactos.length;i++){
			
			if(listContactos[i] == null){
				agendaLlena = false;
				break;
			}
		}
		
		return agendaLlena;
	}
	
	/**
	 * Metodo obtenerEspaciosDisponibles()
	 * @return
	 */
	private int obtenerEspaciosDisponibles(){
		
		int contadorEspacios = 0;
		
		for(int i = 0; i<listContactos.length;i++){
			
			if(listContactos[i] == null){
				contadorEspacios++;
			}
		}
		
		return contadorEspacios;
	}
	
	/**
	 * Metodo existeContacto()
	 * @param telefono
	 * @return
	 */
	private boolean existeContacto(String telefono){
		
		boolean existeContacto = false;
		
		for(int i = 0; i< listContactos.length; i++){
			
			if(listContactos[i] != null){
				if(listContactos[i].getTelefono().equals(telefono)){
					existeContacto = true;
					break;
				}
			}
		}
		
		return existeContacto;
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

	/**
	 * Nuevo metodo grupo3 agregarGrupo(Grupo g) 
	 * @param g
	 */
	public void agregarGrupo(Grupo g) {
		if (numGrupos<listGrupos.length) {
			listGrupos[numGrupos++] = g;
		}
	}
	
	/**
	 * Nuevo metodo grupo3 mostrarGrupo()
	 */
	public void mostrarGrupo() {
		for (int i = 0; i < listGrupos.length; i++) {
			if (listGrupos[i]!=null) {
				System.out.println(listGrupos[i].toString());
			}
		}
	}
	
	/** Nuevo metodo grupo3 Metodo1
	 * Obtener los grupos que tengan un contacto donde su nombre inicie con vocal
	 */
	public void mostrarGruposDeContactoConVocal() {
		
		int contador = 0;
		Grupo grupo = null;
		
		Grupo []listaGruposInicialContactoVocal = null;
		
		
		contador = verificarCantidadGruposContactosIniciaVocal();
		
		listaGruposInicialContactoVocal = new Grupo[contador];
		int j = 0;
		
		for (int i = 0; i < listGrupos.length; i++) {  //listGrupos => existencia de la relacion
			
			grupo = listGrupos[i];
			
			if (grupo != null) {
				
				if (grupo.verificarContactoIniciaVocal()) {
					listaGruposInicialContactoVocal[j] = grupo;
					j++;
				}
				
			}
		}
		
		imprimirArreglo(listaGruposInicialContactoVocal);

	}
	
	private void imprimirArreglo(Grupo[] listaGruposInicialContactoVocal) {
	
		Grupo grupo = null;
		for (int i = 0; i < listaGruposInicialContactoVocal.length; i++) {
			grupo = listaGruposInicialContactoVocal[i];
			if (grupo != null) {
				System.out.println(grupo.getNombre());
			}
		}
		
	}

	private int verificarCantidadGruposContactosIniciaVocal() {
		
		int contador = 0;
		Grupo grupo = null;
		
		for (int i = 0; i < listGrupos.length; i++) {  //listGrupos => existencia de la relacion
			
			grupo = listGrupos[i];
			
			if (grupo != null) {
				
				if (grupo.verificarContactoIniciaVocal()) {
					contador++;
				}
				
			}
		}
		
		return contador;
		
		
	}
	
	/**
	 * Nuevo metodo grupo3 Metodo2
	 * Desviacion estandar edades contactos
	 * @return
	 */
	public double desviacionEstandarEdadesContactos() {
		
		Contacto contacto = null;
		double media = 0;
		double primeraParteVarianza = 0;
		double varianza = 0;
		double desviacion = 0;

			media = contadorEdades()/ConctactosCreados();
		
		for (int i = 0; i < listContactos.length; i++) {
			contacto = listContactos[i];
			
			if (contacto != null) {
				primeraParteVarianza += Math.pow(listContactos[i].getEdad() - media,2);
			}
		}
		
			varianza = primeraParteVarianza / ConctactosCreados();
			desviacion = Math.sqrt(varianza);
			return desviacion;
	}
	
	private int ConctactosCreados() {
		Contacto contacto = null;
		int contarContacotos = 0;
		
		for (int i = 0; i < listContactos.length; i++) {
			contacto = listContactos[i];
			
			if (contacto != null) {
				contarContacotos++;
			}
		}
		
		return contarContacotos;
	}
	
    private double contadorEdades() {
    	Contacto contacto = null;
    	double contadorEdades = 0;
		for (int i = 0; i < listContactos.length; i++) {
			contacto = listContactos[i];
			
			if (contacto != null) {
				contadorEdades += listContactos[i].getEdad();
			}
		}
		return contadorEdades;
	}

}
