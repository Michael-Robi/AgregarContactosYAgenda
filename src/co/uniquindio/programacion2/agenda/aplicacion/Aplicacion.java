package co.uniquindio.programacion2.agenda.aplicacion;

import co.uniquindio.programacion2.agenda.exceptions.ContactoExcepction;
import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;
import co.uniquindio.programacion2.agenda.test.TestData;

public class Aplicacion {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
//		TestData testData = new TestData();
		
//		mostrarContactos(testData.inicializarDatosPrueba());
		
		//CRUD
		//1. Crear contacto
		crearContacto(agenda, "Carlos", "45678", 20);
		
		//2. actualizar contacto
//		actualizarContacto("Pedro","45678");
		
		//3. Consultar
		consultarContacto(agenda, "45678");
		
		//4. elmininar contacto
//		eliminarContacto("45678");
		
		//5. mostrar contactos
//		mostrarContactos(agenda);
	}

	private static void crearContacto(Agenda agenda, String nombre, String telefono, int edad) {
		
		try {
			agenda.crearContacto(nombre,telefono,edad);
		} catch (ContactoExcepction e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void consultarContacto(Agenda agenda, String telefono) {
		// TODO Auto-generated method stub
		Contacto[] listaContactos = agenda.getListContactos();
		
//		listaContactos[0] = agenda.obtenerContacto(telefono);
		
		for (int i = 0; i < listaContactos.length; i++) {
			
			if (listaContactos[i]!=null) {
				System.out.println(listaContactos[i]);
			}
			
		}
	}

	private static void actualizarContacto(String string, String string2) {
		// TODO Auto-generated method stub
	}

	private static void eliminarContacto(String string) {
		// TODO Auto-generated method stub
	}

	private static void mostrarContactos(Agenda agenda) {
		agenda.mostrarContactos();
	}
}
