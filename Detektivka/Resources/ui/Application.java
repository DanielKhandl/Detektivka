package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application {
	public static void main(String[] args) {
        launch(args);
}


private static void launch(String[] args) {
		// TODO Auto-generated method stub
		
	}


public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("title");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
}

}
