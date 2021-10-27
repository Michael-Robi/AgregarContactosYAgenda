package co.uniquindio.programacion2.agenda.utilidades;

import javax.swing.JOptionPane;

public class Utilidades {
	
	/**
	 * MÃ©todo para mostrar el menÃº principal
	 * @return seleccion
	 */
	public static String mostrarMenu() {
		
		String[] opciones = {
				"Agregar contacto",
				"Existe contacto",
				"Buscar contacto",
				"Eliminar contacto",
				"Consultar disponibilidad de cupo",
				"Consultar espacios disponibles",
				"Salir"
		};
		
		String seleccion = (String) JOptionPane.showInputDialog(null, 
				"Selecciona una opción",
				"Agenda",
				JOptionPane.PLAIN_MESSAGE,
				null,
				opciones,
				opciones[0]);
		
		return seleccion;
		
	}
	
	/**
	 * Metodo para mostrar un mensaje en pantalla
	 * @param mensaje
	 */
	public static void imprimirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	private static void imprimirError(String mensaje) {
//		JOptionPane.showInputDialog(null, "Por favor ingresar datos validos", "Error!", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Por favor ingresar datos validos", "Error!", JOptionPane.ERROR_MESSAGE);
		
	}
	
	private static boolean validarNull(String campo) {
		
		boolean validar = true;
		
		if (campo.equalsIgnoreCase("")) {
			validar = false;
		}
		return validar;
	}
	
	/**
	 * Permite leer un numero entero mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario
	 */
	public static int leerEnteroVentana (String mensaje)
	{
		int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Permite leer un numero double mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario
	 */	

	public static double leerDouble (String mensaje)
	{
		double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

	public static String  leerStringVentana(String mensaje) {
		String respuesta = "";
		respuesta  = JOptionPane.showInputDialog(mensaje);
		return respuesta;

	}
}
