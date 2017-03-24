package deneme;

import gui.Gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

import core.FindAndDecomplier;

public class Deneme {

	static Gui window;
	static String path;

	public static Gui getWindow() {
		return window;
	}

	public static void setWindow(Gui window) {
		Deneme.window = window;
	}

	public static void main(String[] args) {
		window = new Gui();
		window.getFrame().setVisible(true);
		
		File filePAth = new File(ClassLoader.getSystemClassLoader().getResource(".").getPath());
		path=filePAth.getAbsolutePath()+"/resource/";
		path=path.replaceAll("Decompiler/bin/resource", "Decompiler/resource");
		
		File file = new File(path+"jadx-master/build");
		if (!file.exists()) {
			String[] a = { "/bin/sh", "-c", "cd "+path+"jadx-master; ./gradlew dist" };
			FindAndDecomplier.exec(a);
			
		}
		

	}

	public static String getPath() {
		return path;
	}

	public static void setPath(String path) {
		Deneme.path = path;
	}
}
