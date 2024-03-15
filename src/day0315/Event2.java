package day0315;

import java.awt.*;
import java.awt.event.*;

///////////////////////////////////////////////////////////////////
class Textfieldadapter extends KeyAdapter {
	private TextField textfield;
	private TextArea textarea;

	public Textfieldadapter(TextField textfield, TextArea textarea) {
		this.textfield = textfield;
		this.textarea = textarea;
	}

	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			textarea.append(textfield.getText()+ "\n");
			textfield.setText("");
		}
	}

}
///////////////////////////////////////////////////////////////////

class Out extends WindowAdapter{
	 public void windowClosing(WindowEvent e) 
	 {System.exit(0);}
}
///////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
public class Event2 extends Frame implements ActionListener {
	Panel p1,p2,p3;
	Button clear, exit;
	TextArea ta;
	TextField tf;

	public Event2() {
		super("Adapter Eaxm");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		clear = new Button("Clear");
		exit = new Button("Exit");
		ta = new TextArea(10,35); // 여러줄
		tf = new TextField(35); // 한줄

		clear.addActionListener(this);
		exit.addActionListener(this);
		addWindowListener(new Out());
		tf.addKeyListener(new Textfieldadapter(tf, ta));
		
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
				Thread.sleep(20);
				System.exit(0);
			} catch (Exception ee) {
			}

		}

	}

	public static void main(String[] args) {
		new Event2();
	}

}
