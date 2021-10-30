package co.uniquindio.programacion2.agenda.aplicacion;

import co.uniquindio.programacion2.agenda.exceptions.ContactoExcepction;
import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;
import co.uniquindio.programacion2.agenda.model.Grupo;

public class TestAplicacion {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("Agenda1");
		
		for (int i = 0; i<5; i++) {
			Contacto con = new Contacto("Contacto"+(i+1),"310231332"+i, 20+i);
			try {
				agenda.crearContacto(con.getNombre(),con.getTelefono(),con.getEdad());
			} catch (ContactoExcepction e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		agenda.mostrarContactos();
		System.out.println(agenda.desviacionEstandarEdadesContactos());
//		
//		Grupo grupo = new Grupo("Grupo A");
//		Grupo grupo1 = new Grupo("Grupo B");
////		
//		for (int i = 0; i <3; i++) {
//			Contacto con = new Contacto("Alex"+(i+1),"310231332"+i, 20+i);
//			Contacto con1 = new Contacto("Carlos"+(i+1),"310231332"+i, 20+i);
//			grupo.crearContacto(con);
//			grupo1.crearContacto(con1);
//		}
//		
//		agenda.agregarGrupo(grupo);
//		agenda.agregarGrupo(grupo1);
//		agenda.mostrarGrupo();
//		System.out.println(agenda.toString());
		
//		agenda.mostrarGruposDeContactoConVocal();
		
		
	}

}
