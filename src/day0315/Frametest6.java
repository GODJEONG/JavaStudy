package day0315;

import java.awt.*;
import java.awt.CardLayout;
import java.awt.Frame;

public class Frametest6 extends Frame {

	CardLayout card;
	Panel first, second, third;

	public Frametest6() {
		super("cardlayout");

		card = new CardLayout();

		setLayout(card);

		first = new Panel();
		first.add(new Button("1"));

		second = new Panel();
		second.add(new Button("2"));

		third = new Panel();
		third.add(new Button("3"));
		
		add("1",first);
		add("2",second);
		add("3",third);

	}

	public void rotate() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			card.next(this);
		}

	}

	public static void main(String[] args) {
		Frametest6 ff = new Frametest6();
		ff.setBounds(200, 200, 200, 100);
		ff.setVisible(true);
		ff.rotate();
	}
}
