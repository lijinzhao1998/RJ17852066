package lijinzhao.day1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MyJavaFx extends Application {
public void start(Stage arg0) throws Exception {


//TODO Auto©\generated method stub
//Create a scene and place a button in the scene
Button btOK = new Button("OK");
Scene scene = new Scene(btOK, 200, 250);
arg0.setTitle("MyJavaFX");
arg0.setScene(scene);
arg0.show();
}
public static void main(String[] args) {
// TODO Auto©\generated method stub
Application.launch(args);

}
}
