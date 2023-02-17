package org.openjfx.hellofx;

import java.util.ArrayList;
import java.util.Iterator;

import baseDatosCarrera.RuedaDAO;
import baseDatosCarrera.RuedaVO;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class FormularioModRueda extends VBox {

	ArrayList<RuedaVO> listaRueda = new ArrayList<RuedaVO>();

	BorderPane root = new BorderPane();

	Label lblId = new Label("Seleccione el id de la Rueda:");

	ChoiceBox chRuedaId = new ChoiceBox();

	Label lblMarca = new Label("Marca:");
	Label lblModelo = new Label("Modelo:");
	Label lblDimensiones = new Label("Dimensiones:");
	Label lblPeso = new Label("Peso");
	Label lblComponente = new Label("Componente");
	Label lblEstado = new Label("Estado");
	Label lblCocheId = new Label("Id coche");
	Label lblFecha = new Label("Fecha");
	Label lblSesion = new Label("Sesion");

	TextField txtMarca = new TextField();
	TextField txtModelo = new TextField();
	TextField txtDimensiones = new TextField();
	TextField txtCocheId = new TextField();
	TextField txtFecha = new TextField();
	TextField txtSesion = new TextField();
	TextField txtComponente = new TextField();
	ChoiceBox chPeso = new ChoiceBox();
	ChoiceBox chEstado = new ChoiceBox();
	Button btnActualizar = new Button("Actualizar");
	Button btnEliminar = new Button("Eliminar");

	@SuppressWarnings("unchecked")
	public FormularioModRueda() {

		chPeso.setItems(FXCollections.observableArrayList("9", "10", "11"));
		chEstado.setItems(FXCollections.observableArrayList("Malo", "Regular", "Bueno", "nuevo"));

		listaRueda = RuedaDAO.listaRueda();

		RuedaVO rueda = new RuedaVO();

		Iterator<RuedaVO> itr = listaRueda.iterator();
		// Cargo en rueda el primer rueda de la lista
		rueda = itr.next();

		// Vamos rellenando el desplegable con todos los elementos de la
		// arraylist de ruedas
		while (itr.hasNext()) {
			chRuedaId.getItems().add(rueda.getIdRuedas());

			// Cargo el siguiente rueda
			rueda = itr.next();

		}

		this.getChildren().add(lblId);
		this.getChildren().add(chRuedaId);
		this.getChildren().add(lblMarca);
		this.getChildren().add(txtMarca);
		this.getChildren().add(lblModelo);
		this.getChildren().add(txtModelo);
		this.getChildren().add(lblDimensiones);
		this.getChildren().add(txtDimensiones);
		this.getChildren().add(lblPeso);
		this.getChildren().add(chPeso);
		this.getChildren().add(lblComponente);
		this.getChildren().add(txtComponente);
		this.getChildren().add(lblEstado);
		this.getChildren().add(chEstado);
		this.getChildren().add(lblCocheId);
		this.getChildren().add(txtCocheId);
		this.getChildren().add(lblFecha);
		this.getChildren().add(txtFecha);
		this.getChildren().add(lblSesion);
		this.getChildren().add(txtSesion);
		this.getChildren().add(btnActualizar);
		this.getChildren().add(btnEliminar);

		// Anadimos espaciado entre los lados
		setStyle("-fx-padding: 10;");

		// Anadimos Margin a al boton de actualizar
		setMargin(btnActualizar, new Insets(10, 0, 10, 0));

		// spaciado a todos las celdas
		setSpacing(1);

		// Mostrar resultado
		chRuedaId.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ArrayList<RuedaVO> listaRueda = new ArrayList<RuedaVO>();
				listaRueda = RuedaDAO.listaRueda();

				// Recuperamos el indice del elementeo seleccionado en el
				// choicebox
				int posicion = chRuedaId.getSelectionModel().getSelectedIndex();

				// Cargamos el rueda desde el arraylist con la posicion
				// Selecionada del choicebox que coincide con la posicion
				// del rueda seleccionado
				RuedaVO rueda = listaRueda.get(posicion);

				// Asignamos lo datos del rueda a los diferentes controles/campos
				// del formulario de ruedas
				txtMarca.setText(rueda.getMarca());
				txtModelo.setText(rueda.getModelo());
				txtDimensiones.setText(Integer.toString(rueda.getDimensiones()));
				txtCocheId.setText(rueda.getCocheIdCoche());
				txtFecha.setText(rueda.getFecha());
				txtSesion.setText(Integer.toString(rueda.getSesion()));
				txtComponente.setText(rueda.getComponente());

				chPeso.getSelectionModel().select(Integer.toString(rueda.getPeso()));
				chEstado.getSelectionModel().select(rueda.getEstado());

			}
		});

		// Actualizar resultado
		btnActualizar.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				RuedaVO rueda = new RuedaVO();

				// Recogemos el id
				rueda.setIdRuedas((String) chRuedaId.getSelectionModel().getSelectedItem());
				rueda.setModelo(txtModelo.getText());
				rueda.setMarca(txtMarca.getText());
				rueda.setDimensiones(Integer.parseInt(txtDimensiones.getText()));
				rueda.setCocheIdCoche(txtCocheId.getText());
				rueda.setFecha(txtFecha.getText());
				rueda.setSesion(Integer.parseInt(txtSesion.getText()));
				rueda.setComponente(txtComponente.getText());
				rueda.setEstado((String) chEstado.getSelectionModel().getSelectedItem());

				RuedaDAO.actualizar(rueda);
			}

		});

		// Borrar resultado
		btnEliminar.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				RuedaDAO.eliminar((String) chRuedaId.getSelectionModel().getSelectedItem());
			}
		});

	}

}
