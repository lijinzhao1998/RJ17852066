package lijinzhao.day5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
      BallPane ballPane = new BallPane();
      ballPane.setOnMousePressed(e ->ballPane.pause());
      ballPane.setOnMouseReleased(e -> ballPane.play());
      ballPane.setOnKeyPressed(e ->{
    	  if(e.getCode() == KeyCode.UP) {
    		  ballPane.increaseSpeed();
    	  }else if(e.getCode() == KeyCode.DOWN) {
    		  ballPane.decreaseSpeed();
    	  }
      });
      Scene scene = new Scene(ballPane,250,150);
      primaryStage.setTitle("BounceBallControl");
      primaryStage.setScene(scene);
      primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Application.launch(args);

	}

}
