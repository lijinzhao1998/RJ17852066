package lijinzhao.zuoye;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 * @author wing
 * @date 2012/7/17
 */
public class GamePanel extends Parent {
    private Sprite sprite;
	public GamePanel() {
	}
 
	public void load(){
        sprite = new Sprite(50, 50, 33, 33, "actor.png");
        Image image = new Image("/image/timg.jpg");
        Button FriutMoutons = new Button("花果山");
        FriutMoutons.setPrefHeight(30);
        FriutMoutons.setPrefWidth(100);
        FriutMoutons.setLayoutX(450);
        FriutMoutons.setLayoutY(350);
        FriutMoutons.setStyle(
			   "-fx-background-color:#80752c00;" +
					   "-fx-text-fill:#98F5FF;" 
			         
	           
	           
			);
        FriutMoutons.setOnKeyPressed(e ->{
      	  switch(e.getCode()) {
      	  case X: if(sprite.getX()>= FriutMoutons.getLayoutX()-50&&sprite.getX()<= FriutMoutons.getLayoutX()+50&&
      			sprite.getY()>= FriutMoutons.getLayoutY()-100&&sprite.getY()<= FriutMoutons.getLayoutY()+100) {
      		  
      	  
      		   try {
      	 			new Scene1().start(new Stage());
      	 		} catch (Exception e1) {
      	 			// TODO 自动生成的 catch 块
      	 			e1.printStackTrace();
      	 		} 
      	  }
      	
      	
      	  }
        });
   
        FriutMoutons.setOnAction((ActionEvent e)->{
			
 		   try {
 			new Scene1().start(new Stage());
 		} catch (Exception e1) {
 			// TODO 自动生成的 catch 块
 			e1.printStackTrace();
 		}
 		  
 		   
 				
 			
 		   });
 		   DropShadow shadow = new DropShadow();
 		   
 		 //当鼠标进入按钮时添加阴影特效
 		  FriutMoutons.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
 			 FriutMoutons.setEffect(shadow);
 		 });
 		  
 		 //当鼠标离开按钮时移除阴影效果
 		 FriutMoutons.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
 			 FriutMoutons.setEffect(null);
 		 });
 		 
  
        
        getChildren().add(new ImageView(image));
        getChildren().add(sprite);
        getChildren().add(FriutMoutons);
        getScene().setOnKeyPressed(new EventHandler<KeyEvent>() {
 			@Override
 			public void handle(KeyEvent event) {
 				onKeyPressed(event);
 			}
 		});
	}
	
	
	public void onKeyPressed(KeyEvent event){
		if(event.getCode() == KeyCode.LEFT){
		  sprite.moveLeft();
	   }else if(event.getCode() == KeyCode.RIGHT){
		  sprite.moveRight();
	   }else if(event.getCode() == KeyCode.UP){
		  sprite.moveUp();
	   }else if(event.getCode() == KeyCode.DOWN){
		  sprite.moveDown();
	   }
	}
	
	
	public void update(long now){
		
	}
 
}
