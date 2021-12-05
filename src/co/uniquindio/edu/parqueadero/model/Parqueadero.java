package co.uniquindio.edu.parqueadero.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.uniquindio.edu.parqueadero.exception.VehiculoException;

/**
 * Clase parqueadero
 * 
 * @author Admin
 *
 */
public class Parqueadero {

	// ---------------------------------------------------------------------------
	// ATRIBUTOS
	// ---------------------------------------------------------------------------
	private String nombre;
	private ArrayList<Propietario> listaPropietarios;


	/**
	 * Constructor de la clase parqueadero
	 */
	public Parqueadero(String nombre) {

		listaPropietarios = new ArrayList<Propietario>();

		this.nombre = nombre;

		inicializarDatos();
	}

	private void inicializarDatos() {
		Propietario propietario = new Propietario("Carlos","Masculino","123","2130312","2000-08-21");
		getListaPropietarios().add(propietario);
		
		propietario = new Propietario("Juana","Femenino","124","2130313","1998-07-10");
		getListaPropietarios().add(propietario);
		
		propietario = new Propietario("Pedro","Masculino","125","2130314","1997-04-06");
		getListaPropietarios().add(propietario);
		
		propietario = new Propietario("Daniela","Femenino","126","2130315","1994-12-16");
		getListaPropietarios().add(propietario);
	}

	// ---------------------------------------------------------------------------
	// METODOS SET Y GET
	// ---------------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Asignar y Obtener Lista
	public ArrayList<Propietario> getListaPropietarios() {
		return listaPropietarios;
	}

	public void setListaPropietarios(ArrayList<Propietario> listaPropietarios) {
		this.listaPropietarios = listaPropietarios;
	}

	@Override
	public String toString() {
		return "Parqueadero [nombre=" + nombre + ", listaPropietarios=" + listaPropietarios + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parqueadero other = (Parqueadero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
