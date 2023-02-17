package org.openjfx.hellofx;

import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class FormPerro extends GridPane {

	Label lblId = new Label("Id:");
	Label lblNombre = new Label("Nombre:");
	Label lblDuenio = new Label("Dueño:");
	Label lblEdad = new Label("Edad:");
	Label lblPeso = new Label("Peso");
	Label lblTamano = new Label("Tamano");
	Label lblSalud = new Label("Salud");
	Label lblRaza = new Label("Raza");

	TextField txtId = new TextField();
	TextField txtNombre = new TextField();
	TextField txtDuenio = new TextField();
	TextField txtEdad = new TextField();
	TextField txtTamano = new TextField();

	ChoiceBox chPeso = new ChoiceBox();
	ChoiceBox chRaza = new ChoiceBox();

	// Creamos los radiobutton
	RadioButton radMal = new RadioButton("Mal");
	RadioButton radRegular = new RadioButton("Regular");
	RadioButton radBien = new RadioButton("Bien");

	ToggleGroup grpSalud = new ToggleGroup();

	// Creamos un boton
	static Button btnGuardar = new Button("Guardar");
	static Button btnBorrar = new Button("Borrar");

	public FormPerro() {

		Label lblId = new Label("Id:");
		Label lblNombre = new Label("Nombre:");
		Label lblDuenio = new Label("Dueño:");
		Label lblEdad = new Label("Edad:");
		Label lblPeso = new Label("Peso");
		Label lblTamano = new Label("Tamano");
		Label lblSalud = new Label("Salud");
		Label lblRaza = new Label("Raza");

		// por defecto seleccionamos bien
		radBien.setSelected(true);

		chPeso.setItems(FXCollections.observableArrayList("10", "15", "20"));
		chRaza.setItems(FXCollections.observableArrayList("Asiatica", "Europea", "Americana", "Africana"));

		// Fila 1
		this.add(lblId, 0, 0);
		this.add(txtId, 1, 0, 3, 1);

		// Fila 2
		this.add(lblNombre, 0, 1);
		this.add(txtNombre, 1, 1, 3, 1);

		// Fila 3
		this.add(lblDuenio, 0, 2);
		this.add(txtDuenio, 1, 2, 3, 1);

		// Fila 4
		this.add(lblEdad, 0, 3);
		this.add(txtEdad, 1, 3, 3, 1);

		// Fila 5
		this.add(lblPeso, 0, 4);
		this.add(chPeso, 1, 4, 3, 1);

		// Fila 6
		this.add(lblSalud, 0, 5);
		this.add(radBien, 1, 5);
		this.add(radRegular, 2, 5);
		this.add(radMal, 3, 5);

		// Fila 7
		this.add(lblRaza, 0, 6);
		this.add(chRaza, 1, 6, 3, 1);

		// Fila 9
		this.add(lblTamano, 0, 8);
		this.add(txtTamano, 1, 8, 3, 1);

		// Fila 10
		this.add(btnBorrar, 0, 9);

		// Fila 10
		this.add(btnGuardar, 0, 10);

		// Ponemos margen en todas las celdas
		setVgap(10);
		setHgap(10);

		// Alineamos al centro el formualrio
		setStyle("-fx-padding: 10;");

	}

}
