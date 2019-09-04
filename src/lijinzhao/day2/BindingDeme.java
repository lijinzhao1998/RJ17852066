package lijinzhao.day2;

import javafx.beans.property.DoublePropertyBase;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDeme {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    DoublePropertyBase d1 = new SimpleDoubleProperty(1);
    DoublePropertyBase d2 = new SimpleDoubleProperty(2);
    d1.bind(d2);
    //d1.bindBidirectional(d2);
    System.out.println(d1.getValue()+","+d2.getValue());
    d1.setValue(59.8);
    System.out.println(d1.getValue()+","+d2.getValue());
  
	}

}
