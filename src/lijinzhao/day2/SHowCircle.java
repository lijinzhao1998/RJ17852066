package lijinzhao.day2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SHowCircle extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.BLUE);
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("show Circle");
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    Application.launch(args);
	}

}
