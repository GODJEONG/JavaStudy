package day0315;

import java.awt.*;
import java.awt.event.*;

class Exit extends WindowAdapter{
	 public void windowClosing(WindowEvent e) 
	 {System.exit(0);}
}

public class Event1 extends Frame implements ActionListener, WindowListener {
	Panel p;
	Button input, exit;
	TextArea ta;

	public Event1() {
		super("actionevent test");
		p = new Panel();
		input = new Button("input");
		exit = new Button("exit");
		ta = new TextArea();

		input.addActionListener(this);
		exit.addActionListener(this);
		addWindowListener(new Exit());

		p.add(input);
		p.add(exit);

		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);

		setBounds(300, 300, 300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();

		if (name.equals("input")) {
			ta.append("button input \n");
		} else {
			ta.append("exit\n");

			try {
				Thread.sleep(2000);
			} catch (Exception ee) {
			}
			;
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Event1();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
