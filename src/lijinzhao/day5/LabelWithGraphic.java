package lijinzhao.day5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LabelWithGraphic extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存
		ImageView img = new ImageView(new Image("/image/test.jpg"));
		Label lb1 = new Label("Test image",img);
		lb1.setStyle("-fx-border-width:2");
		lb1.setContentDisplay(ContentDisplay.BOTTOM);
		lb1.setTextFill(Color.RED);
		Label lb2 = new Label("Circle", new Circle(50,50,25));
		lb2.setContentDisplay(ContentDisplay.TOP);
		lb2.setTextFill(Color.ORANGE);
		Label lb3 = new Label("Retangle", new Rectangle(10,10,50,25));
		lb3.setContentDisplay(ContentDisplay.RIGHT);
		Label lb4 = new Label("Ellipse", new Ellipse(50,50,50,25));
		lb4.setContentDisplay(ContentDisplay.LEFT);
		Ellipse ellipse = new Ellipse(50,50,50,25);
		ellipse.setStroke(Color.GREEN);
		ellipse.setFill(Color.WHITE);
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(ellipse,new Label("JavaFx"));
		Label lb5 = new Label("A pane inside a label", stackPane);
		lb5.setContentDisplay(ContentDisplay.BOTTOM);
		HBox pane = new HBox(20);
		pane.getChildren().addAll(lb1,lb2,lb3,lb4,lb5);
		Scene scene = new Scene(pane,450,150);
		primaryStage.setTitle("LabelWidthGraphic");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         Application.launch(args);
	}

}
