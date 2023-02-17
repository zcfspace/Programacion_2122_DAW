package org.openjfx.hellofx;

import javafx.application.Application;
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

public class App extends Application {

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

		// Menu Archivo
		Menu menuArchivo = new Menu("Archivo");

		MenuItem MIAbrir = new MenuItem("Abrir");
		MenuItem MIGuardar = new MenuItem("Guardar");
		MenuItem MICerrar = new MenuItem("Cerrar");

		// Menu Herramienta
		Menu menuHerramienta = new Menu("Herramienta");

		MenuItem MIMostrar = new MenuItem("Mostrar");
		MenuItem MIEliminar = new MenuItem("Eliminar");
		MenuItem MIModificar = new MenuItem("Modificar");

		// Menu Acerca de
		Menu menuAcerca = new Menu("Acerca de");

		// Asociamos los menuitems al menu archivo
		menuArchivo.getItems().addAll(MIAbrir, MIGuardar, MICerrar);
		menuHerramienta.getItems().addAll(MIMostrar, MIEliminar, MIModificar);

		// Asociamos el menu a la barra de menu principal
		menuPrincipal.getMenus().addAll(menuArchivo, menuHerramienta, menuAcerca);

		// Ponemos el menubar en la parte superior del borderpane
		root.setTop(menuPrincipal);
		// Ponemos el ScrollPane en la parte central
		root.setCenter(scroll);

		// Creamos un panel de pestañas
		TabPane panelPestanas = new TabPane();

		scroll.setContent(panelPestanas);

		// Creamos 3 pestañas
		Tab pestana1 = new Tab("Insertar Datos");
		Tab pestana2 = new Tab("Modificar/Borrar");
		Tab pestana3 = new Tab("Listado");

		// Hacemos que no se puedan cerrar las pestañas
		pestana1.setClosable(false);
		pestana2.setClosable(false);
		pestana3.setClosable(false);

		// Creamos nuestro panel personalizado con el formulario del rueda
		FormularioRueda fRueda = new FormularioRueda();
		FormularioModRueda rSeleccionada = new FormularioModRueda();
		TabListaRueda listaRueda = new TabListaRueda();

		// En la pestaña1 añadimos el contenido
		pestana1.setContent(fRueda);
		pestana2.setContent(rSeleccionada);
		pestana3.setContent(listaRueda);

		panelPestanas.setPrefWidth(390);

		// Añadimos las pestañas al panel
		panelPestanas.getTabs().addAll(pestana1, pestana2, pestana3);

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
