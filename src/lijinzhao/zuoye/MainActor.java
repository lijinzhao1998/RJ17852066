package lijinzhao.zuoye;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MainActor extends Pane {
	
   int hp = 100;
   int sp = 100;
   String name = "����";
   String[] stages = {"����","����","����","����","����","����","����","����","����"};
   String[] Number = {"һ","��","��","��","��","��","��","��","ʮ"};
   
   int x =1300;
   int y = 500;
   int attack = 100;
   Image re = new Image("/image/Ů��ʿ.png");
   ImageView res = new ImageView(re);
   
   
  public MainActor() {
	  res.setLayoutX(x);
	  res.setLayoutY(y);
  }

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
  
}
