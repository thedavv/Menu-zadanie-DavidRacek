package sk.racek;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MenuDemo {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new MenuFrame("Exit Demo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
