package lijinzhao.day1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MultipleStageDemo extends Application {
public void start(Stage arg0) throws Exception {
Scene scene = new Scene(new Button("OK"), 200, 250);
arg0.setTitle("MyJavaFX");
arg0.setScene(scene);
arg0.show();
Stage stage = new Stage();
stage.setTitle("second stage");
stage.setScene(new Scene(new Button("New Stage"),100,100));
stage.show();
}
public static void main(String[] args) {
	// TODO Auto©\generated method stub
	Application.launch(args);

	}
}
