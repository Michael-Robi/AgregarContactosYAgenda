package co.uniquindio.edu.parqueadero;
	
import java.io.IOException;
import java.util.ArrayList;

import co.uniquindio.edu.parqueadero.controller.ParqueaderoController;
import co.uniquindio.edu.parqueadero.model.Parqueadero;
import co.uniquindio.edu.parqueadero.model.Propietario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application {
	
	//Declarar Variables
	private Stage primaryStage;
	Parqueadero parqueadero = new Parqueadero("UqParking");
	
	@Override
	public void start(Stage primaryStage) {//metodo start
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Parqueadero"); //Definir titulo
		mostrarVentanaPrincipal();
	}
	
	private void mostrarVentanaPrincipal() {//Mostrar Vista Principal
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("view/ParqueaderoView.fxml"));//Cargar Vista del proyecto
			
			AnchorPane rootLayout = (AnchorPane)loader.load();
			
			ParqueaderoController parqueaderoController = loader.getController(); //Controlador de eventos
			parqueaderoController.setAplicacion(this);
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public ArrayList<Propietario> obtenerPropietarios() {
		return parqueadero.getListaPropietarios();
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
}
