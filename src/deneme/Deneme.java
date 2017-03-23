package deneme;

import java.awt.EventQueue;

import core.FindAndDecomplier;
import core.Helper;
import gui.Gui;
import gui.SmaliWindow;
import gui.Tab;

public class Deneme {

	static Gui window;
public static Gui getWindow() {
		return window;
	}
	public static void setWindow(Gui window) {
		Deneme.window = window;
	}
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					window = new Gui();	
					window.getFrame().setVisible(true);
					window.getFrame().revalidate();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
