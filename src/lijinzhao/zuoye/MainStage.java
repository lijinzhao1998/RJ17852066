package lijinzhao.zuoye;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainStage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO �Զ����ɵķ������
		Group group = new Group();
	
		
		   Button button1 = new Button("ս��");
		   Button button2 = new Button("��ͼ");
		   Button button3 = new Button("����");
		   Button button4 = new Button("�˳���Ϸ");
		   button2.setPrefHeight(30);
		    button2.setPrefWidth(130);
		   button2.setLayoutX(450);
		   button2.setLayoutY(350);
		   DropShadow shadow = new DropShadow();
		   button2.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#f05b72;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black;"+
		           "-fx-border-radius:5px"
				);
		   button2.setOnAction((ActionEvent e)->{
			
		   try {
			new MainClass().start(new Stage());
		} catch (Exception e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		   primaryStage.close();
		   
				
			
		   });

		   
		 //�������밴ťʱ�����Ӱ��Ч
		 button2.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
		     button2.setEffect(shadow);
		 });
		  
		 //������뿪��ťʱ�Ƴ���ӰЧ��
		 button2.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
		     button2.setEffect(null);
		 });
		
		 
		    button1.setPrefHeight(30);
		    button1.setPrefWidth(130);
		   button1.setLayoutX(450);
		   button1.setLayoutY(300);
		   button1.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#f05b72;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black;"+
		           "-fx-border-radius:5px"
				);
		   button1.setOnAction((ActionEvent e)->{
			 try {
				new Scene1().start(new Stage());
			} catch (Exception e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			 primaryStage.close();
			   
		   });
	
		   
		 //�������밴ťʱ�����Ӱ��Ч
		 button1.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
		     button1.setEffect(shadow);
		 });
		  
		 //������뿪��ťʱ�Ƴ���ӰЧ��
		 button1.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
		     button1.setEffect(null);
		 });
		 
		 
		 
		  button3.setPrefHeight(30);
		    button3.setPrefWidth(130);
		   button3.setLayoutX(450);
		   button3.setLayoutY(400);
		   button3.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#f05b72;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black;"+
		           "-fx-border-radius:5px"
				);
		   button3.setOnAction((ActionEvent e)->{
			   System.out.println("you press me");
			   
		   });
	
		   
		 //�������밴ťʱ�����Ӱ��Ч
		 button3.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
		     button3.setEffect(shadow);
		 });
		  
		 //������뿪��ťʱ�Ƴ���ӰЧ��
		 button3.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
		     button3.setEffect(null);
		 });
		 
		 button4.setPrefHeight(30);
		    button4.setPrefWidth(130);
		   button4.setLayoutX(450);
		   button4.setLayoutY(450);
		   button4.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#f05b72;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black;"+
		           "-fx-border-radius:5px"
				);
		   button4.setOnAction((ActionEvent e)->{
			   primaryStage.close();
			 
			   
		   });
	
		   
		 //�������밴ťʱ�����Ӱ��Ч
		 button4.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
		     button4.setEffect(shadow);
		 });
		  
		 //������뿪��ťʱ�Ƴ���ӰЧ��
		 button4.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
		     button4.setEffect(null);
		 });
		 
		
		 Image image = new Image("/image/backgroud.jpg");
		
		 group.getChildren().add(new ImageView(image));
		 group.getChildren().add(button1);
		 group.getChildren().add(button2);
		 group.getChildren().add(button3);
		 group.getChildren().add(button4);
		 
	
		Scene scene = new Scene(group);
		primaryStage.setTitle("Game");
	    primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
      Application.launch(args);
	}

}
