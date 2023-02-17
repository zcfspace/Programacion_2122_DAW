package org.openjfx.hellofx;

import baseDatosCarrera.RuedaDAO;
import baseDatosCarrera.RuedaVO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

@SuppressWarnings("rawtypes")
public class TabListaRueda extends VBox {

	// Conversión de ArrayList a ObservableList
	ObservableList<RuedaVO> listaRueda = FXCollections.observableArrayList(RuedaDAO.listaRueda());
	// Creamos el tableView
	TableView<RuedaVO> tabla = new TableView<RuedaVO>();

	// Creamos las columnas
	TableColumn colId = new TableColumn("Id");
	TableColumn colMarca = new TableColumn("Marca");
	TableColumn colModelo = new TableColumn("Modelo");
	TableColumn colDimensiones = new TableColumn("Dimensiones");
	TableColumn colPeso = new TableColumn("Peso");
	TableColumn colComponente = new TableColumn("Componente");
	TableColumn colEstado = new TableColumn("Estado");
	TableColumn colIdCoche = new TableColumn("IdCoche");
	TableColumn colFecha = new TableColumn("Fecha");
	TableColumn colSesion = new TableColumn("Sesion");

	@SuppressWarnings({ "unchecked" })
	public TabListaRueda() {

		// Pones un titulo
		final Label label = new Label("Lista de ruedas");
		label.setFont(new Font("Arial", 20));

		// Anadimos tados a las columnas
		colId.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("idRuedas"));
		colMarca.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("marca"));
		colModelo.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("modelo"));
		colDimensiones.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("dimensiones"));
		colPeso.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("peso"));
		colComponente.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("componente"));
		colEstado.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("estado"));
		colIdCoche.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("cocheIdCoche"));
		colFecha.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("fecha"));
		colSesion.setCellValueFactory(new PropertyValueFactory<RuedaVO, String>("sesion"));

		tabla.setItems(listaRueda);

		tabla.getColumns().addAll(colId, colMarca, colModelo, colDimensiones, colPeso, colComponente, colEstado,
				colIdCoche, colFecha, colSesion);

		// Anadimos espaciados y pading
		this.setSpacing(5);
		this.setPadding(new Insets(10, 0, 0, 10));

		// Anadimos el tituto y la tableView
		this.getChildren().addAll(label, tabla);

	}
}
