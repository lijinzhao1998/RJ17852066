package lijinzhao.day5;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitonDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle(0,0,25,50);
		rectangle.setFill(Color.ORANGE);
		Circle circle = new Circle(125,100,50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();
        circle.setOnMousePressed(e->pt.pause());
        circle.setOnMouseReleased(e -> pt.play());
        Scene scene = new Scene(pane,250,200);
        primaryStage.setTitle("PathTransittionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Application.launch(args);
	}

}
