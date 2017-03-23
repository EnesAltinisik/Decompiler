package deneme;

import gui.Gui;
import java.io.File;

import core.FindAndDecomplier;

public class Deneme {

	static Gui window;

	public static Gui getWindow() {
		return window;
	}

	public static void setWindow(Gui window) {
		Deneme.window = window;
	}

	public static void main(String[] args) {
		window = new Gui();
		window.getFrame().setVisible(true);
		
		File file = new File("jadx-master/build");
		if (!file.exists()) {
			String[] a = { "/bin/sh", "-c", "cd jadx-master; ./gradlew dist" };
			FindAndDecomplier.exec(a);
		}
	}
}
