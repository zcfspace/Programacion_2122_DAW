package org.openjfx.hellofx;

import baseDatosCarrera.RuedaDAO;
import baseDatosCarrera.RuedaVO;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class FormularioRueda extends GridPane {

	// idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion
	Label lblId = new Label("Id:");
	Label lblMarca = new Label("Marca:");
	Label lblModelo = new Label("Modelo:");
	Label lblDimensiones = new Label("Dimensiones:");
	Label lblPeso = new Label("Peso");
	Label lblComponente = new Label("Componente");
	Label lblEstado = new Label("Estado");
	Label lblCocheId = new Label("Id coche");
	Label lblFecha = new Label("Fecha");
	Label lblSesion = new Label("Sesion");

	TextField txtId = new TextField();
	TextField txtMarca = new TextField();
	TextField txtModelo = new TextField();
	TextField txtDimensiones = new TextField();
	TextField txtCocheId = new TextField();
	TextField txtFecha = new TextField();
	TextField txtSesion = new TextField();
	ChoiceBox chPeso = new ChoiceBox();
	ChoiceBox chEstado = new ChoiceBox();

	// Creamos los radiobutton
	RadioButton radDuro = new RadioButton("Duro");
	RadioButton radMedio = new RadioButton("Medio");
	RadioButton radBlando = new RadioButton("Blando");

	ToggleGroup grpComponente = new ToggleGroup();

	// Creamos un boton
	Button btnInsertar = new Button("Insertar");

	public FormularioRueda() {
		// Asignamos los radiobutton al toggleGroup

		radDuro.setToggleGroup(grpComponente);
		radMedio.setToggleGroup(grpComponente);
		radBlando.setToggleGroup(grpComponente);

		// por defecto seleccionamos medio
		radMedio.setSelected(true);

		chPeso.setItems(FXCollections.observableArrayList("9", "10", "11"));
		chEstado.setItems(FXCollections.observableArrayList("Malo", "Regular", "Bueno", "Nuevo"));

		// Fila 1
		this.add(lblId, 0, 0);
		this.add(txtId, 1, 0, 3, 1);

		// Fila 2
		this.add(lblMarca, 0, 1);
		this.add(txtMarca, 1, 1, 3, 1);

		// Fila 3
		this.add(lblModelo, 0, 2);
		this.add(txtModelo, 1, 2, 3, 1);

		// Fila 4
		this.add(lblDimensiones, 0, 3);
		this.add(txtDimensiones, 1, 3, 3, 1);

		// Fila 5
		this.add(lblPeso, 0, 4);
		this.add(chPeso, 1, 4, 3, 1);

		// Fila 6
		this.add(lblComponente, 0, 5);
		this.add(radBlando, 1, 5);
		this.add(radMedio, 2, 5);
		this.add(radDuro, 3, 5);

		// Fila 7
		this.add(lblEstado, 0, 6);
		this.add(chEstado, 1, 6, 3, 1);

		// Fila 8
		this.add(lblCocheId, 0, 7);
		this.add(txtCocheId, 1, 7, 3, 1);

		// Fila 9
		this.add(lblFecha, 0, 8);
		this.add(txtFecha, 1, 8, 3, 1);

		// Fila 10
		this.add(lblSesion, 0, 9);
		this.add(txtSesion, 1, 9, 3, 1);

		// Fila 10
		this.add(btnInsertar, 0, 10);

		// Insertar una rueda
		btnInsertar.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				RuedaVO rueda = new RuedaVO();

				// Recogemos el id
				rueda.setIdRuedas(txtId.getText());
				rueda.setModelo(txtModelo.getText());
				rueda.setMarca(txtMarca.getText());
				rueda.setDimensiones(Integer.parseInt(txtDimensiones.getText()));
				rueda.setCocheIdCoche(txtCocheId.getText());
				rueda.setFecha(txtFecha.getText());
				rueda.setSesion(Integer.parseInt(txtSesion.getText()));
				RadioButton temp = (RadioButton) grpComponente.getSelectedToggle();

				if (temp.getText().equals("Duro")) {
					rueda.setComponente("Duro");
				} else {
					if (temp.getText().equals("Medio")) {
						rueda.setComponente("Duro");
					} else {
						rueda.setComponente("Blando");
					}
				}
				rueda.setPeso((int) chPeso.getSelectionModel().getSelectedItem());
				rueda.setEstado((String) chEstado.getSelectionModel().getSelectedItem());

				RuedaDAO.insertar(rueda);
			}

		});

		// Ponemos margen en todas las celdas
		setVgap(10);
		setHgap(10);

		// Alineamos al centro el formualrio
		setStyle("-fx-padding: 10;");

	}

}
