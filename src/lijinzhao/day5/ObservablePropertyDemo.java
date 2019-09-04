package lijinzhao.day5;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DoubleProperty balance = new SimpleDoubleProperty();
		balance.addListener(new InvalidationListener() {
			public void invalidated(Observable ov) {
				System.out.println("The new value is "+
			balance.doubleValue());
			}
		});
		
		balance.set(4.5);

	}
}
