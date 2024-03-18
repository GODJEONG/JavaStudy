package day0315;

import java.awt.*;

public class Frametest5 {
public static void main(String[] args) {
	Frame f = new Frame("ButtonTest");
	
	Checkbox ck1 = new Checkbox("one",true);
	Checkbox ck2 = new Checkbox("twotwo");
	Checkbox ck3 = new Checkbox("three");
	
	f.add(ck1);
	f.add(ck2);
	f.add(ck3);
	f.setSize(300,300);
	f.setVisible(true);
}	
}