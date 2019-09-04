package lijinzhao.day4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO �Զ����ɵķ������
      Pane pane = new Pane();
      Text text = new Text(20,20,"Programming is fun");
      pane.getChildren().addAll(text);
      text.setOnMouseDragged(e -> {
    	  text.setX(e.getX());
    	  text.setY(e.getY());
      });
      Scene scene = new Scene(pane,300,100);
      primaryStage.setTitle("MouseEventDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
      
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
   Application.launch(args);
	}

}
