package lijinzhao.day5;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButto extends CheckBoxDemo {

	protected BorderPane getPane() {
		BorderPane pane = super.getPane();
		VBox paneForRadiousButton = new VBox(20);
		paneForRadiousButton.setPadding(new Insets(5,5,5,5));
		paneForRadiousButton.setStyle("-fx-border-color:green");
		paneForRadiousButton.setStyle("-fx-border-width:2px; -fx-border-color:green");
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");
		paneForRadiousButton.getChildren().addAll(rbRed,rbGreen,rbBlue);
		pane.setLeft(paneForRadiousButton);
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbBlue.setToggleGroup(group);
		rbRed.setOnAction(e ->{
			if(rbRed.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		rbGreen.setOnAction(e->{
			if(rbGreen.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});
		rbBlue.setOnAction(e->{
			if(rbBlue.isSelected()) {
				text.setFill(Color.BLUE);
			}
		});
		
		return pane;
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      Application.launch(args);
	}

}
