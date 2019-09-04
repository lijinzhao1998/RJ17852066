package lijinzhao.zuoye;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BOSS1class {

	String name = "霸王花";
	
	int sp =3000;
	int x = 400;
	int y = 500;
	int hps =2000;
	Image image = new Image("/image/BOSS-霸王花.png");
	ImageView imageview = new ImageView(image);
	Rectangle rectangle = new Rectangle(x-50,y-50,100,10);
	 Rectangle hp = new Rectangle(x-50,y-50,100,10);
	 Rectangle rectangle1 = new Rectangle(x-100,y-100,100,10);
	 Rectangle sps = new Rectangle(x-100,y-100,100,10);
	public BOSS1class() {
		 
	    sps.setStroke(Color.BLUE);
		 rectangle1.setFill(Color.BLUE);
		 sps.setFill(Color.WHITE);
		 hp.setStroke(Color.RED);
		 rectangle.setFill(Color.RED);
		 rectangle.setWidth(hps/10);
		 hp.setWidth(hps/10);
		
		
		 hp.setFill(Color.WHITE);
		 imageview.setLayoutX(x);
		 imageview.setLayoutY(y);
	}
	public Rectangle getHp() {
		return hp;
	}
	public void setHp(Rectangle hp) {
		this.hp = hp;
	}
}
