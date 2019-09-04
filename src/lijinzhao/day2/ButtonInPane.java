package lijinzhao.day2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO 自动生成的方法存根
		StackPane Pane = new StackPane();
		Pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(Pane,200,50);
		arg0.setTitle("Button in a Pane");
		arg0.setScene(scene);
		arg0.show();

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     Application.launch(args);
     
     

	}

}
