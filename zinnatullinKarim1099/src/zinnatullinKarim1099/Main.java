package zinnatullinKarim1099;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		btn.setText("Importar el numero 43");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String rutaProyecto = System.getProperty("user.dir");
				File operando1 = new File(rutaProyecto, "\\operando1.txt");
				try {
					FileWriter writer = new FileWriter(operando1.getAbsolutePath());
					writer.write("43\n");
					writer.close();
				} catch (IOException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hola mundo.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}