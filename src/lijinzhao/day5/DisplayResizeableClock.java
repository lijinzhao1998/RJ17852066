package lijinzhao.day5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lijinzhao.day3.ClockPane;


public class DisplayResizeableClock extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":"  +clock.getMinute()
		+ ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("DisplayClock");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.widthProperty().addListener(ov ->
	
		clock.setW(pane.getWidth()/2)
		);
		pane.heightProperty().addListener(ov ->
		clock.setH(pane.getWidth()/2)
		);

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Application.launch(args);
	}

}
