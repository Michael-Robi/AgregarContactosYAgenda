package co.uniquindio.programacion2.agenda.test;

import co.uniquindio.programacion2.agenda.exceptions.ContactoExcepction;
import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;

public class TestContactos {
	
	public TestContactos(Agenda agenda) {
		inicializarDatos(agenda);
	}

	private void inicializarDatos(Agenda agenda) {

			Contacto con = new Contacto("Contacto1","3102313321");
			
			try {
				agenda.crearContacto(con.getNombre(),con.getTelefono());
			} catch (ContactoExcepction e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
