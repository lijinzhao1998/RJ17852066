package lijinzhao.day3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO �Զ����ɵķ������
         Pane pane = new HBox(10);
         pane.setPadding(new Insets(5,5,5,5));
         Image image = new Image("/image/test.jpg");
         pane.getChildren().add(new ImageView(image));
         ImageView imageView2 = new ImageView(image);
         imageView2.setFitHeight(100);
         imageView2.setFitWidth(100);
         pane.getChildren().add(imageView2);
         ImageView imageView3 = new ImageView(image);
         imageView3.setRotate(90);
         pane.getChildren().add(imageView3);
         Scene scene = new Scene(pane);
         primaryStage.setTitle("ShowImage");
         primaryStage.setScene(scene);
         primaryStage.show();
         
         
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Application.launch(args);
	}

}
