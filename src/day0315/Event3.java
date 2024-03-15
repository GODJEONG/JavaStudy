package day0315;

import java.awt.*;
import java.awt.event.*;

public class Event3 extends Frame implements ActionListener {

	Panel p1, p2, p3;
	Button clear, exit;
	TextArea ta;
	TextField tf;

//	class Textfieldadapter extends KeyAdapter {
//		public void keyTyped(KeyEvent e) {
//			if (e.getKeyChar() == KeyEvent.VK_ENTER) {
//				ta.append(tf.getText() + "\n");
//				tf.setText("");
//			}
//		}
//	}

	public Event3() {
		super("Adapter Eaxm");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		clear = new Button("Clear");
		exit = new Button("Exit");
		ta = new TextArea(10, 35); // 여러줄
		tf = new TextField(35); // 한줄

		clear.addActionListener(this);
		exit.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			}
		}

		);

		p1.add(tf);
		p2.add(ta);
		p3.add(clear);
		p3.add(exit);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);

		setBounds(300, 300, 300, 200);
		setVisible(true);
	}

///////////////////////////////////////////////////////////////////
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();

		if (name.equals("Clear")) {
			tf.setText("");
			ta.setText("");
			tf.requestFocus();
		} else {
			try {
				Thread.sleep(200);
				System.exit(0);
			} catch (Exception ee) {
			}

		}

	}

///////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		new Event3();
	}

}
