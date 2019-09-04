package lijinzhao.day3;

import java.util.Vector;

import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowChess extends Application {

 
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		 GridPane pane = new GridPane();
	double	height  = pane.getHeight();
		 pane.setAlignment(Pos.CENTER);
		   Scene scne = new Scene(pane,400,400);
	int Border =(int) scne.getHeight()/8;
	System.out.println(height);
		
	   
      for(int j = 0; j <8;j++ )
    	  for(int i = 0; i < 8; i++ ) 
       {
    		
    		  if((i+j)%2==0)
    		  {
      Rectangle r2 = new Rectangle(0+i*Border,0+j*Border,Border,Border);
      r2.heightProperty().bind(pane.heightProperty().divide(8));
		 r2.widthProperty().bind(pane.widthProperty().divide(8));
       r2.setStroke(Color.WHITE);
       r2.setFill(Color.WHITE);
       pane.add(r2, i*Border, j*Border);
       }
 	  if((i+j)%2==1)
 	  {
 		 Rectangle r1 = new Rectangle(Border+i*Border,0+j*Border,Border,Border);
 		 r1.heightProperty().bind(pane.heightProperty().divide(8));
 		 r1.widthProperty().bind(pane.widthProperty().divide(8));
       r1.setStroke(Color.BLACK);
       r1.setFill(Color.BLACK);
       
       pane.add(r1, i*Border, j*Border);
 	  }	 
       }
      
    
		primaryStage.setTitle("ShowChess");
		primaryStage.setScene(scne);
		//primaryStage.setResizable(false);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    Application.launch(args);
	}

}

