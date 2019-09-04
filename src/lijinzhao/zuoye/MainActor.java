package lijinzhao.zuoye;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MainActor extends Pane {
	
   int hp = 100;
   int sp = 100;
   String name = "主角";
   String[] stages = {"初玄","入玄","真玄","灵玄","地玄","天玄","王玄","霸玄","君玄"};
   String[] Number = {"一","二","三","四","五","六","八","九","十"};
   
   int x =1300;
   int y = 500;
   int attack = 100;
   Image re = new Image("/image/女剑士.png");
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
