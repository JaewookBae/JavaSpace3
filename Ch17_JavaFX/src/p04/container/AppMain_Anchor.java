package p04.container;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain_Anchor extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("root_anchor.fxml"));
		
		Scene scene = new Scene(root); 	

		primaryStage.setTitle("AppMain_Anchor");
		primaryStage.setScene(scene);
		primaryStage.show();

		
	}

}
