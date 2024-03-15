package day0315;

import java.awt.Frame;
import java.awt.Panel;  
import java.awt.TextField;

public class Frametest4 {
	public static void main(String[] args) {
		Frame f = new Frame("ButtonTest");
		//Panel p = new Panel();
		Panel pp = new Panel();
		
		TextField tf1=new TextField("name input:", 12);
		TextField tf2=new TextField("password input:", 10);
		
		tf1.selectAll();
		tf2.selectAll();  
		
		tf2.setEchoChar('*');

		pp.add(tf1);
		pp.add(tf2);
		
		f.add(pp);

		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);
}
}