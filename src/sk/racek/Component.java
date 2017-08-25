package sk.racek;

import java.awt.Dimension;

import javax.swing.JComponent;

public class Component extends JComponent {

	public final static int DEFAULT_WIDTH = 600;
	public final static int DEFAULT_HEIGHT = 600;

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
