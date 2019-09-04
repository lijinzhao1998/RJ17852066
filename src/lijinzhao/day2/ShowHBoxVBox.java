package lijinzhao.day2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		BorderPane pane = new BorderPane();
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBoxVBox");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		

	}
   private HBox getHBox() {
	   HBox hBox = new HBox(15);
	   hBox.setPadding(new Insets(15,15,15,15));
	   hBox.setStyle("-fx-background-color:gold");
	   hBox.getChildren().add(new Button("Computer Science"));
	   hBox.getChildren().add(new Button("Chemistry"));
	   hBox.getChildren().add(new Button("Geography"));
	   return hBox;
	
}
   private VBox getVBox() {
	   VBox vBox = new VBox(15);
	   vBox.setPadding(new Insets(15,5,5,5));
	   vBox.getChildren().add(new Label("Courses"));
	   Label[] courses = {
			   new Label("CS101"),
			   new Label("CS102"),
			   new Label("CS201"),
			   new Label("CS202")
	   };
	   for(Label course : courses) {
		   vBox.setMargin(course, new Insets(0,0,0,15));
		   vBox.getChildren().add(course);
	   }
	   return vBox;
	   
   }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   Application.launch(args);
	}

}
