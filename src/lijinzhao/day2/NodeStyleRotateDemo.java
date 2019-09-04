package lijinzhao.day2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		StackPane Pane = new StackPane();
		Button btOK  = new Button("OK");
		btOK.setStyle("-fx-border-color:blue;");
	Pane.getChildren().add(btOK);
	Pane.setRotate(45);
	Pane.setStyle("-fx-border-color:red;-fx-background-color:lightgray;");
		Scene scene = new Scene(Pane,200,250);
		primaryStage.setTitle("NodeStyleRotateDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Application.launch(args);
	}

}
