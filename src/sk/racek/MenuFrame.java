package sk.racek;

import javax.swing.JFrame;

public class MenuFrame extends JFrame {
	public MenuFrame(String str) {
		super(str);
		setJMenuBar(new ExitMenu());
		add(new Component());
		pack();
	}
}
