package co.uniquindio.programacion2.agenda.aplicacion;

import co.uniquindio.programacion2.agenda.exceptions.ContactoExcepction;
import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;
import co.uniquindio.programacion2.agenda.model.Grupo;
import co.uniquindio.programacion2.agenda.test.TestData;

import java.text.DecimalFormat;

public class TestAplicacion {
	
	
	public static void main(String[] args) {
		TestData testData = new TestData();
		
		DecimalFormat formateador = new DecimalFormat("####.####");
		Agenda agenda = testData.inicializarDatosPrueba(); 
//new Agenda("Agenda1");
//		for (int i = 0; i<4; i++) {
//			Contacto con = new Contacto("Contacto"+(i+1),"310231332"+i, 20+i);
//			try {
//				agenda.crearContacto(con.getNombre(),con.getTelefono(),con.getEdad());
//			} catch (ContactoExcepction e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		//Main metodo 1 Obtener los grupos que tengan un contacto donde su nombre inicie con vocal
		agenda.mostrarContactos();
		System.out.println(formateador.format(agenda.desviacionEstandarEdadesContactos()));

		//Main metodo 2 Desviacion estandar edades contactos
//		Grupo grupo = new Grupo("Grupo A");
//		Grupo grupo1 = new Grupo("Grupo B");
//		
//		for (int i = 0; i <3; i++) {
//			Contacto con = new Contacto("Alex"+(i+1),"310231332"+i, 20+i);
//			Contacto con1 = new Contacto("Andres"+(i+1),"310231332"+i, 20+i);
//			grupo.crearContacto(con);
//			grupo1.crearContacto(con1);
//		}
//		
//		agenda.agregarGrupo(grupo);
//		agenda.agregarGrupo(grupo1);
//		agenda.mostrarGrupo();
//		System.out.println(agenda.toString());
//		
//		agenda.mostrarGruposDeContactoConVocal();
		
		
	}

}
