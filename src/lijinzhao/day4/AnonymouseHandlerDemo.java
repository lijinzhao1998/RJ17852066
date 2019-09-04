package lijinzhao.day4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymouseHandlerDemo extends Application {

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
      btNew.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			// TODO 自动生成的方法存根
			System.out.println("Process New");
		}
    	  
      });
      
      btOpen.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			// TODO 自动生成的方法存根
			System.out.println("Process Open");
		}
    	  
      });
      
      
      btSave.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			// TODO 自动生成的方法存根
			System.out.println("Process Save");
		}
    	  
      });
      btPrint.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			// TODO 自动生成的方法存根
			System.out.println("Process Print");
		}
    	  
      });
      Scene scene = new Scene(hbox,300,50);
      primaryStage.setTitle("AnonymouseHadlerDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Application.launch(args);
	}

}
