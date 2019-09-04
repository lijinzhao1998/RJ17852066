package lijinzhao.day2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		BorderPane pane = new BorderPane();
		pane.setTop(new CustomePane("Top"));
		pane.setBottom(new CustomePane("Bottom"));
		pane.setRight(new CustomePane("Right"));
		pane.setLeft(new CustomePane("Left"));
		pane.setCenter(new CustomePane("Center"));
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowBorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
class CustomePane extends StackPane{
	public CustomePane(String title) {
	  getChildren().add(new Label(title));
	  setStyle("-fx-border-color:red");
	  setPadding(new Insets(11.5,12.5,13.5,14.5));
	}
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    Application.launch(args);
	}

}
