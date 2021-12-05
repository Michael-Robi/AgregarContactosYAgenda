package co.uniquindio.edu.parqueadero.controller;

import co.uniquindio.edu.parqueadero.Aplicacion;
import co.uniquindio.edu.parqueadero.model.Propietario;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ParqueaderoController {
	
	//Inicializar Clases
	Aplicacion aplicacion;
	ObservableList<Propietario> listaPropietarioData = FXCollections.observableArrayList();
	
	Propietario propietarioSeleccionado;
//	FilteredList<Cliente> filteredData;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    //Inicializar Objeto y tipo
    @FXML
    private TableColumn<Propietario, String> columnTelefono;

    @FXML
    private TextField textNombre;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnNuevo;

    //Inicializar Clase
    @FXML
    private TableView<Propietario> tablePropietarios;

    @FXML
    private TextField textTelefono;

    @FXML
    private TableColumn<Propietario, String> columnIdentificacion;

    @FXML
    private TextField textIdentificacion;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableColumn<Propietario, String> columnNombre;

    @FXML
    private Button btnActualizar;
    
    @FXML
    private TableColumn<Propietario, String> columnFechaDeNacimiento;
    
    @FXML
    private TableColumn<Propietario, String> columnGenero;
    
    //Calendario combobox
    @FXML
    private DatePicker jcalFechaNacimiento;
    
    @FXML
    private ComboBox<String> cboGenero;
    
    @FXML
    private Button btnLimpiar;

    @FXML
    void nuevoEvent(ActionEvent event) {

    }

    @FXML
    void agregarEvent(ActionEvent event) {

    }

    @FXML
    void actualizarEvent(ActionEvent event) {

    }

    @FXML
    void eliminarEvent(ActionEvent event) {

    }
    
    @FXML
    void eventCboGenero(ActionEvent event) {

    }

    @FXML
    void eventJcalFechaNacimiento(ActionEvent event) {

    }
    
    @FXML
    void eventLimpiar(ActionEvent event) {
    	
    	limpiarFormulario();
    }

    @FXML
    void initialize() {
    	//Inicializar Columna
    	this.columnIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
    	this.columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    	this.columnTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
    	this.columnGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
    	this.columnFechaDeNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
    	
    	//Evento Tabla
    	tablePropietarios.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection,
    	newSelection) -> {
    	propietarioSeleccionado = newSelection;
    	mostrarInformacionCliente(propietarioSeleccionado);
    	});
    	
    	//Combox
    	ArrayList<String> list = new ArrayList<String>();
    	Collections.addAll(list, new String[]{"Masculino","Femenino"});
    	
    	cboGenero.getItems().addAll(list);
    }
    
    public ParqueaderoController() {
    	
    }
	
	public void setAplicacion(Aplicacion aplicacion) {//Modificar Aplicación
		this.aplicacion = aplicacion;
		tablePropietarios.getItems().clear();
		tablePropietarios.setItems(getListaPropietariosData());
	}
	
	//Obtiene los Propietarios
	public ObservableList<Propietario> getListaPropietariosData() {
		listaPropietarioData.addAll(aplicacion.obtenerPropietarios());
		return listaPropietarioData;
	}
	
	//Mostrar Informacion en el Formulario
    private void mostrarInformacionCliente(Propietario propietarioSeleccionado){
    	if(propietarioSeleccionado != null){
	    	textIdentificacion.setText(propietarioSeleccionado.getIdentificacion());
	    	textNombre.setText(propietarioSeleccionado.getNombre());
	    	textTelefono.setText(propietarioSeleccionado.getTelefono());
	    	cboGenero.getSelectionModel().select(propietarioSeleccionado.getGenero());
	    	jcalFechaNacimiento.setValue(LocalDate.parse(propietarioSeleccionado.getFechaNacimiento())); 
    	}
    }
    
    //Limpiar Formuluario
    private void limpiarFormulario() {
    	textNombre.setText("");
    	textIdentificacion.setText("");
    	textTelefono.setText("");
    	cboGenero.getSelectionModel().clearSelection();
    	jcalFechaNacimiento.setValue(null);
    }
}
