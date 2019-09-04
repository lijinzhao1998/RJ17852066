package lijinzhao.zuoye;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scene1 extends Application {
	int BossRun = 0;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Group group = new Group();
		 Image image = new Image("/image/timg.png");
		 MainActor mainActor = new MainActor();
		 Text Stages = new Text(1350,350,"等级："+mainActor.stages[0]+mainActor.Number[0]+"境");
		 Stages.setFill(Color.BLUE);
			Text text = new Text(mainActor.x+80,mainActor.y+190, mainActor.name);
			 Rectangle rectangle = new Rectangle(100,10,100,10);
			 Rectangle hp = new Rectangle(100,10,100,10);
			 Rectangle rectangle1 = new Rectangle(100,30,100,10);
			 Rectangle sps = new Rectangle(100,30,100,10);
		BOSS1class bwh = new BOSS1class();
		
		Button attack = new Button("攻击");
		Button Skill = new Button("龙卷雨击");
		Button line = new Button("防御");
		Button run = new Button("五雷轰顶");
		attack.setPrefHeight(30);
		attack.setPrefWidth(80);
		 attack.setLayoutX(1350);
		   attack.setLayoutY(400);
		
		attack.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#F5F5F5;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black"
		        
				);
		Text texts = new Text(600,300," ");
		Text texts1 = new Text(1300,300," ");
		attack.setOnAction((ActionEvent e)->{
			texts1.setText(mainActor.name+"发动了攻击");
			bwh.hps = bwh.hps-mainActor.attack;
			bwh.rectangle.setWidth(bwh.hps/10);
			BossRun = (int) (Math.random()*100+20-20);
		
		
			if(BossRun <= 50) {
				texts.setText(bwh.name+"发动了攻击");	
				 mainActor.hp -= 10;
				 rectangle.setWidth(mainActor.hp);
				 
			}else {
				texts.setText(bwh.name+"什么也没做");
			}
			if(bwh.hps <= 0)
			{
				texts.setText("恭喜你获得了胜利");
				mainActor.hp = 100;
				 rectangle.setWidth(mainActor.hp);
				 mainActor.sp = 100;
				 rectangle1.setWidth(mainActor.sp);
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				// primaryStage.close();
			}
		  });
		
		
		line.setPrefHeight(30);
		line.setPrefWidth(80);
		line.setLayoutX(1450);
		line.setLayoutY(500);
		
		line.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#F5F5F5;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black"
		        
				);

		line.setOnAction((ActionEvent e)->{
			texts1.setText(mainActor.name+"发动了防御");
			
	
			BossRun = (int) (Math.random()*100+20-20);
		
		
			if(BossRun <= 50) {
				texts.setText(bwh.name+"攻击无效");	
				 mainActor.hp -= 0;
				 rectangle.setWidth(mainActor.hp);
				 
			}else {
				texts.setText(bwh.name+"什么也没做");
			}
			if(bwh.hps <= 0)
			{
				texts.setText("恭喜你获得了胜利");
				mainActor.hp = 100;
				 rectangle.setWidth(mainActor.hp);
				 mainActor.sp = 100;
				 rectangle1.setWidth(mainActor.sp);
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				 primaryStage.close();
			}
		  });
		Skill.setPrefHeight(30);
		Skill.setPrefWidth(80);
		Skill.setLayoutX(1400);
		Skill.setLayoutY(450);
		Skill.setStyle(
				   "-fx-background-color:#80752c00;" +
		           "-fx-text-fill:#F5F5F5;" +
		           "-fx-border-width:1px;" +
		           "-fx-border-color:black"
		        
				);
		
		Skill.setOnAction((ActionEvent e)->{
			if(mainActor.sp>=30 )
			{
				texts1.setText(mainActor.name+"发动了龙卷雨击技能");
				
				ImageView View  = new ImageView(new Image("/image/1.gif"));
				View.setLayoutX(200);
				View.setLayoutY(200);
				group.getChildren().add(View);
				
			bwh.hps = bwh.hps-mainActor.attack*2;
			bwh.rectangle.setWidth(bwh.hps/10);
			if(mainActor.hp<=70)
			 {
				mainActor.hp += 30;
				}
			 else
				 mainActor.hp =100;
			 rectangle.setWidth(mainActor.hp);
			 mainActor.sp -= 30;
			 rectangle1.setWidth(mainActor.sp);
			
			BossRun = (int) (Math.random()*100+20-20);
		
		
			if(BossRun <= 50) {
				texts.setText(bwh.name+"发动了攻击");	
				 mainActor.hp -= 10;
				 rectangle.setWidth(mainActor.hp);
				 
			}else {
				texts.setText(bwh.name+"什么也没做");
			}
			}else
				texts.setText("蓝量不够无法发动技能");
			if(bwh.hps <= 0)
			{
				texts1.setText("恭喜你获得了胜利");
				mainActor.hp = 100;
				 rectangle.setWidth(mainActor.hp);
				 mainActor.sp = 100;
				 rectangle1.setWidth(mainActor.sp);
				
				// primaryStage.close();
			}
		});
			run.setPrefHeight(30);
			run.setPrefWidth(80);
			run.setLayoutX(1500);
			run.setLayoutY(550);
			run.setStyle(
					   "-fx-background-color:#80752c00;" +
			           "-fx-text-fill: #F5F5F5;" +
			           "-fx-border-width:1px;" +
			           "-fx-border-color:black"
			        
					);
			run.setOnAction((ActionEvent e1)->{
				if(mainActor.sp>=30 )
				{
					texts1.setText(mainActor.name+"发动了雷击的技能");
					
					ImageView View  = new ImageView(new Image("/image/2.gif"));
					View.setLayoutX(270);
					View.setLayoutY(250);
					group.getChildren().add(View);
					
				bwh.hps = bwh.hps-mainActor.attack*2;
				bwh.rectangle.setWidth(bwh.hps/10);
				if(mainActor.hp<=70)
				 {
					mainActor.hp += 30;
					}
				 else
					 mainActor.hp =100;
				 rectangle.setWidth(mainActor.hp);
				 mainActor.sp -= 10;
				 rectangle1.setWidth(mainActor.sp);
				
				BossRun = (int) (Math.random()*100+20-20);
			
			
				if(BossRun <= 50) {
					texts.setText(bwh.name+"发动了攻击");	
					 mainActor.hp -= 10;
					 rectangle.setWidth(mainActor.hp);
					 
				}else {
					texts.setText(bwh.name+"什么也没做");
				}
				}else
					texts.setText("蓝量不够无法发动技能");
				if(bwh.hps <= 0)
				{
					texts1.setText("恭喜你获得了胜利");
					mainActor.hp = 100;
					 rectangle.setWidth(mainActor.hp);
					 mainActor.sp = 100;
					 rectangle1.setWidth(mainActor.sp);
					
					// primaryStage.close();
				}
			});
			
		
	    sps.setStroke(Color.BLUE);
		 rectangle1.setFill(Color.BLUE);
		 sps.setFill(Color.WHITE);
		 hp.setStroke(Color.RED);
		 rectangle.setFill(Color.RED);
		 rectangle.setWidth(mainActor.hp);
		 hp.setWidth(mainActor.sp);
		 hp.setFill(Color.WHITE);
		
	
		
		 group.getChildren().addAll(new ImageView(image),hp,rectangle,sps,rectangle1,
				 mainActor.res,attack,texts, bwh.imageview,bwh.hp,bwh.rectangle,Skill,line,texts1, run,Stages,text );
		 
		 Scene scene = new Scene(group);
		 
		 primaryStage.setTitle("Game");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 primaryStage.setResizable(false);
		 
		 
	}

	
	

}
