package lijinzhao.zuoye;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class MainClass extends Application {
 
	@Override
	public void start(Stage stage) throws Exception {
          GamePanel mPanel = new GamePanel();
          final Scene scene = new Scene(mPanel,805, 600);
          
        
          mPanel.load();
          scene.setFill(Color.BLACK);
          stage.setScene(scene);
          stage.setTitle("1-2");
          stage.show();
          stage.setResizable(false);
	}
 
	/**
	 * @param args
	 */
	
 
}
