package org.openjfx.hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExamenApp extends Application {

	public void start(Stage stage) {

		// Creamos panel de munu principal
		GridPane panelMenu = new GridPane();

		// Creamos un BorderPane
		BorderPane root = new BorderPane();

		// Creamos un ScrollPane para contener dentro
		// El grid pane
		ScrollPane scroll = new ScrollPane();
		// Metemos dentro del scrollpane el gridpane
		scroll.setContent(panelMenu);

		// Creamos el menu
		MenuBar menuPrincipal = new MenuBar();

		// Menu Gato
		Menu menuGato = new Menu("Gato");

		MenuItem MIGatoCargar = new MenuItem("Cargar");
		MenuItem MIGatoGuardar = new MenuItem("Guardar");
		MenuItem MISalir = new MenuItem("Salir");

		// Menu Perros
		Menu menuPerro = new Menu("Perro");

		MenuItem MIPerroCargar = new MenuItem("Cargar");
		MenuItem MIPerroGuardar = new MenuItem("Guardar");

		// Menu Ayuda
		Menu menuAyuda = new Menu("Ayuda");

		MenuItem MIAcerca = new MenuItem("Acerca de");

		// Asociamos los menuitems al menu archivo
		menuGato.getItems().addAll(MIGatoCargar, MIGatoGuardar, MISalir);
		menuPerro.getItems().addAll(MIPerroCargar, MIPerroGuardar);
		menuAyuda.getItems().addAll(MIAcerca);

		// Asociamos el menu a la barra de menu principal
		menuPrincipal.getMenus().addAll(menuGato, menuPerro, menuAyuda);

		// Ponemos el menubar en la parte superior del borderpane
		root.setTop(menuPrincipal);
		// Ponemos el ScrollPane en la parte central
		root.setCenter(scroll);

		// Creamos un panel de pestañas
		TabPane panelPestanas = new TabPane();

		scroll.setContent(panelPestanas);

		// Creamos 3 pestañas
		Tab pestana1 = new Tab("Gatos");
		Tab pestana2 = new Tab("Perros");
		Tab pestana3 = new Tab("New Tab");

		// Hacemos que no se puedan cerrar las pestañas
		pestana1.setClosable(false);
		pestana2.setClosable(false);
		pestana3.setClosable(false);

		// Creamos nuestro panel personalizado con el formulario del rueda
		FormGato fGato = new FormGato();
		FormPerro fPerro = new FormPerro();
		NewTab fNewTab = new NewTab();

		// En la pestaña1 añadimos el contenido
		pestana1.setContent(fGato);
		pestana2.setContent(fPerro);
		pestana3.setContent(fNewTab);

		panelPestanas.setPrefWidth(390);

		// Añadimos las pestañas al panel
		panelPestanas.getTabs().addAll(pestana1, pestana2, pestana3);

		// Datos de gato
		GatoVO gato1 = new GatoVO("1", "gato1", "pepe", 2, 10, "Grande", "Bien", "Americana");

		// Cargar gato
		MIGatoCargar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				// Selecionamos la primera pestaña del tabpane utilizando
				// el selectionmodel del panel de pestañas
				panelPestanas.getSelectionModel().select(0);

				fGato.txtId.setText(gato1.getId());
				fGato.txtNombre.setText(gato1.getNombre());
				fGato.txtDuenio.setText(gato1.getDuenio());
				fGato.txtEdad.setText(Integer.toString(gato1.getEdad()));
				fGato.txtTamano.setText(gato1.getTamano());

				if (gato1.getSalud().equalsIgnoreCase("Mal")) {
					fGato.radMal.setSelected(true);
				} else {
					if (gato1.getSalud().equalsIgnoreCase("Regular")) {
						fGato.radRegular.setSelected(true);
					} else {
						if (gato1.getSalud().equalsIgnoreCase("Bien")) {
							fGato.radBien.setSelected(true);
						}
					}
				}
				fGato.chPeso.getSelectionModel().select(Integer.toString(gato1.getPeso()));
				fGato.chRaza.getSelectionModel().select(gato1.getRaza());
			}
		});

		// Cualdo pulsamos sobre la opcion guardar, nos abre la pertana de gato
		MIGatoGuardar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				panelPestanas.getSelectionModel().select(0);
			}
		});

		// Cualdo pulsamos sobre la opcion cargar, rellena el formulario de gato
		MISalir.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				stage.close();
			}
		});

		// Guardar gato en una nueva pestana
		FormGato.btnGuardar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				// Selecionamos la primera pestaña del tabpane utilizando
				// el selectionmodel del panel de pestañas
				panelPestanas.getSelectionModel().select(2);

				fNewTab.txtId.setText(gato1.getId());
				fNewTab.txtNombre.setText(gato1.getNombre());
				fNewTab.txtDuenio.setText(gato1.getDuenio());
				fNewTab.txtEdad.setText(Integer.toString(gato1.getEdad()));
				fNewTab.txtTamano.setText(gato1.getTamano());

				if (gato1.getSalud().equalsIgnoreCase("Mal")) {
					fNewTab.radMal.setSelected(true);
				} else {
					if (gato1.getSalud().equalsIgnoreCase("Regular")) {
						fNewTab.radRegular.setSelected(true);
					} else {
						if (gato1.getSalud().equalsIgnoreCase("Bien")) {
							fNewTab.radBien.setSelected(true);
						}
					}
				}
				fNewTab.chPeso.getSelectionModel().select(Integer.toString(gato1.getPeso()));
				fNewTab.chRaza.getSelectionModel().select(gato1.getRaza());
			}
		});

		// Datos de perro
		PerroVO perro1 = new PerroVO("1", "perro1", "pepe", 2, 10, "Grande", "Bien", "Americana");

		// Cargar perro
		MIPerroCargar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				// Selecionamos la primera pestaña del tabpane utilizando
				// el selectionmodel del panel de pestañas
				panelPestanas.getSelectionModel().select(1);

				fPerro.txtId.setText(perro1.getId());
				fPerro.txtNombre.setText(perro1.getNombre());
				fPerro.txtDuenio.setText(perro1.getDuenio());
				fPerro.txtEdad.setText(Integer.toString(perro1.getEdad()));
				fPerro.txtTamano.setText(perro1.getTamano());

				if (perro1.getSalud().equalsIgnoreCase("Mal")) {
					fPerro.radMal.setSelected(true);
				} else {
					if (perro1.getSalud().equalsIgnoreCase("Regular")) {
						fPerro.radRegular.setSelected(true);
					} else {
						if (perro1.getSalud().equalsIgnoreCase("Bien")) {
							fPerro.radBien.setSelected(true);
						}
					}
				}
				fPerro.chPeso.getSelectionModel().select(Integer.toString(perro1.getPeso()));
				fPerro.chRaza.getSelectionModel().select(perro1.getRaza());
			}
		});

		// Cualdo pulsamos sobre la opcion guardar, nos abre la pertana de perro
		MIPerroGuardar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				panelPestanas.getSelectionModel().select(1);
			}
		});

		// Guardar perro en una nueva pestana
		FormPerro.btnGuardar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				// Selecionamos la primera pestaña del tabpane utilizando
				// el selectionmodel del panel de pestañas
				panelPestanas.getSelectionModel().select(2);

				fNewTab.txtId.setText(perro1.getId());
				fNewTab.txtNombre.setText(perro1.getNombre());
				fNewTab.txtDuenio.setText(perro1.getDuenio());
				fNewTab.txtEdad.setText(Integer.toString(perro1.getEdad()));
				fNewTab.txtTamano.setText(perro1.getTamano());

				if (perro1.getSalud().equalsIgnoreCase("Mal")) {
					fNewTab.radMal.setSelected(true);
				} else {
					if (perro1.getSalud().equalsIgnoreCase("Regular")) {
						fNewTab.radRegular.setSelected(true);
					} else {
						if (perro1.getSalud().equalsIgnoreCase("Bien")) {
							fNewTab.radBien.setSelected(true);
						}
					}
				}
				fNewTab.chPeso.getSelectionModel().select(Integer.toString(perro1.getPeso()));
				fNewTab.chRaza.getSelectionModel().select(perro1.getRaza());
			}
		});

		// La scene contiene los panel
		var scene = new Scene(root, 400, 450);

		// El stage es el contenido global de la ventana
		stage.setScene(scene);

		// Mostramos la aplicacion visual
		stage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
