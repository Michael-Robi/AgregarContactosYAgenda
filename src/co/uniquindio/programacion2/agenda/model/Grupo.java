package co.uniquindio.programacion2.agenda.model;

import java.util.Arrays;

public class Grupo {
	
	private String nombre;
	private Contacto[] listContactosAsociados;
	private int numContactosAsociado = 0;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.listContactosAsociados= new Contacto[10];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void crearContacto(Contacto c) {
		listContactosAsociados[numContactosAsociado++] = c;
	}
	
	public void mostrarContactos() {
		for (int i = 0; i < listContactosAsociados.length; i++) {
			if (listContactosAsociados[i]!=null) {
				System.out.println(listContactosAsociados[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", listGruposAsociados=" + Arrays.toString(listContactosAsociados)
				+ "]";
	}
	
//	public boolean GruposDeContactoConVocal() {
//		
//		boolean valor = false;
//		
//		if (Contacto.ContactoConVocal()==true) {
//			
//			valor = true;
//			
//			return valor;
//		}
//		
//		return true;
//	}

	public boolean verificarContactoIniciaVocal() {
		
		Contacto contacto= null;

		for (int i = 0; i < listContactosAsociados.length; i++) {
			contacto = listContactosAsociados[i];
			
			if (contacto != null) {
				
				if (contacto.ContactoConVocal()) {
					
					return true;
				}
			}
		}
		
		return false;
	}
}
