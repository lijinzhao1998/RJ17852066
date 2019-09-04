package lijinzhao.day2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
      FlowPane pane = new FlowPane();
      pane.setPadding(new Insets(11,12,13,14));
      pane.setHgap(5);
      pane.getVgap();
      pane.getChildren().addAll(new Label("First Name:"),new TextField(),
    		  new Label("MI"));
      TextField tfMi = new TextField();
      tfMi.setPrefColumnCount(1);
      pane.getChildren().addAll(tfMi,new Label("Last Name:"),new TextField());
      Scene scene =new Scene(pane,200,200);
      primaryStage.setTitle("ShowFlowPane");
      primaryStage.setScene(scene);
      primaryStage.show();
    		  
  
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Application.launch(args);
	}

}
