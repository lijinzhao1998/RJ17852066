package lijinzhao.day2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
    Pane pane = new Pane();
    Circle circle = new Circle();
    circle.centerXProperty().bind(pane.widthProperty().divide(2));
    circle.centerYProperty().bind(pane.heightProperty().divide(2));
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.GRAY);
    pane.getChildren().add(circle);
    Scene scene = new Scene(pane,200,200);
    primaryStage.setTitle("ShowCircleCentered");
    primaryStage.setScene(scene);
    primaryStage.show();
    
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   Application.launch(args);
	}

}
