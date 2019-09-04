package lijinzhao.day3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowElipse extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
     Pane pane = new Pane();
     for(int i = 0;i < 16; i++) {
    	 Ellipse e1 = new Ellipse(150,100,100,50);
    	 e1.setStroke(Color.color(Math.random(),Math.random(), Math.random()));
    	 e1.setFill(Color.WHITE);
    	 e1.setRotate(i*180/16);
    	 pane.getChildren().add(e1);
     }
     Scene scene = new Scene(pane,300,200);
     primaryStage.setTitle("ShowElipse");
     primaryStage.setScene(scene);
     primaryStage.show();
     
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
  Application.launch(args);
	}

}
