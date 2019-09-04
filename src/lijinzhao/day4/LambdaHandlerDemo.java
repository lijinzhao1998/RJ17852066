package lijinzhao.day4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
      HBox hbox = new HBox();
      hbox.setSpacing(10);
      hbox.setAlignment(Pos.CENTER);
      Button btNew = new Button("New");
      Button btOpen = new Button("Open");
      Button btSave = new Button("Save");
      Button btPrint = new Button("Print");
      hbox.getChildren().addAll(btNew,btOpen,btSave,btPrint);
      btNew.setOnAction((ActionEvent e) ->{
    	  System.out.println("Process New");
      });
      btOpen.setOnAction((ActionEvent e) ->{
    	  System.out.println("Process Open");
      });
      btSave.setOnAction((ActionEvent e) ->{
    	  System.out.println("Process Save");
      });
      btPrint.setOnAction((ActionEvent e) ->{
    	  System.out.println("Process Print");
      });
      Scene scene = new Scene(hbox,300,50);
      primaryStage.setTitle("LambdaHandlerDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    Application.launch(args);
	}

}
