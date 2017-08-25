package sk.racek;

import java.awt.event.ActionEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ExitMenu extends JMenuBar {
	JMenu exitMenu = new JMenu("Exit Bar");
	JMenuItem exit = new JMenuItem("Exit to windows");

	public ExitMenu() {
		exitMenu.add(exit);
		add(exitMenu);
		exit.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
	}

}
