package co.uniquindio.programacion2.agenda.aplicacion;

import static co.uniquindio.programacion2.agenda.utilidades.Utilidades.*;
import static co.uniquindio.programacion2.agenda.utilidades.Utilidades.mostrarMenu;

import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;
import co.uniquindio.programacion2.agenda.model.Grupo;
import co.uniquindio.programacion2.agenda.test.TestContactos;
import co.uniquindio.programacion2.agenda.test.TestGrupo;

public class AplicacionMenu {
	
	public static void main(String[] args) {
		
		//Instancias
		Agenda agenda = null;
		Grupo grupo = null;
		Contacto con = null;
		TestContactos testContactos = null;
		TestGrupo testGrupo = null;
		
		// Opción seleccionada por el usuario
		String seleccion = "";
			
		// Variables Auxiliares
		String nombreContracto = "";
		String telefonoContactoString = "";	
		int edad = 0;
		
		//return 
		String mensaje = "";
		boolean resultado = false;
		
		//Test 
		agenda = new Agenda("Agenda1");
		grupo = new Grupo("Grupo A");
		
		testContactos = new TestContactos(agenda);
		testGrupo = new TestGrupo(grupo); 
		
//		agenda.agregarGrupo(grupo);
		
		do {
			
			seleccion = mostrarMenu();
			
			switch (seleccion) {
			
			case "Agregar contacto":
				
				// El usuario ingresa el nombre del contacto
				nombreContracto = leerStringVentana("Ingrese el nombre del contacto");
				// EL usuario ingresa el numero de telefono
				telefonoContactoString = leerStringVentana("Ingrese el telefono del contacto");
				// EL usuario ingresa la edad
				edad = leerEnteroVentana("Ingrese la edad");
				
				con = new Contacto(nombreContracto,telefonoContactoString,edad);
//				agenda.agregarContacto(con);
				
				// imprimirMensaje("Nuevo contacto");
				
				break;
			case "Existe contacto":
//				agenda.mostrarContacto();
//				agenda.mostrarGrupo();
				System.out.println(agenda.toString());
				break;
			case "Buscar contacto":
				
				break;
			case "Eliminar contacto":
				
				break;
			case "Consultar disponibilidad de cupo":
				
				break;
			case "Consultar espacios disponibles":
				
				break;
			}
						
		} while (seleccion != "Salir");
		
	}	
	
}
