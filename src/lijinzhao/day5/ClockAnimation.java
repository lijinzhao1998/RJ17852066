package lijinzhao.day5;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import lijinzhao.day3.ClockPane;

public class ClockAnimation extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
       ClockPane clock = new ClockPane();
       EventHandler<ActionEvent> eventHandler = e->{
    	   clock.setCurrentTime();
       };
       Timeline animation = new Timeline(
    		   new KeyFrame(Duration.millis(1000),eventHandler));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
       Scene scene = new Scene(clock,250,250);
       primaryStage.setTitle("ColckAnimation");
       primaryStage.setScene(scene);
       primaryStage.show();
       
    		   
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Application.launch(args);
	}

}
