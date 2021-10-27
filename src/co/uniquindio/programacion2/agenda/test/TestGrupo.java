package co.uniquindio.programacion2.agenda.test;

import co.uniquindio.programacion2.agenda.model.Contacto;
import co.uniquindio.programacion2.agenda.model.Grupo;

public class TestGrupo {
	
	public TestGrupo(Grupo grupo) {
		inicializarDatos(grupo);
	}

	private void inicializarDatos(Grupo grupo) {
		
		for (int i = 0; i <3; i++) {
		Contacto con = new Contacto("Contacto"+(i+1),"310231332"+i);
			grupo.crearContacto(con);
		}
	}

}
