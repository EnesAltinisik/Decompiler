package core;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.SwingWorker;
import javax.swing.SwingWorker.StateValue;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.AttributeSet;
import javax.swing.text.JTextComponent;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import org.zeroturnaround.zip.ZipUtil;

import deneme.Deneme;
import gui.Gui;
import gui.SmaliWindow;

public class Helper {
	static SmaliWindow sm;
	static boolean findShow;
	static String find = "";
	static int high = 0;

	public static void findInProje() {
		Gui gui = Deneme.getWindow();
		String aranacak = (String) JOptionPane.showInputDialog(gui.getFrame(), "What is your string?", "Find",
				JOptionPane.QUESTION_MESSAGE);
		if (aranacak == null)
			return;
		find = aranacak;
		findAllProje(aranacak);
		findShow = false;
		findButton();

		Component[] cp = gui.getPanelFind().getComponents();
		JSplitPane jsp = (JSplitPane) cp[0];
		cp = jsp.getComponents();
		JScrollPane scrol = (JScrollPane) cp[1];
		cp = scrol.getComponents();
		for (int i = 0; i < cp.length; i++) {
			if (cp[i] instanceof JViewport) {
				JViewport jvp = (JViewport) cp[i];
				jvp.remove(0);
				jvp.add(gui.getTreeFind());
				gui.getTreeFind().addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							Helper.openFindTree(gui.getTreeFind().getSelectionPath());
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				break;
			}
		}

		gui.getBtnFind().setVisible(findShow);

	}

	private static void findAllProje(String s) {
		Gui gui = Deneme.getWindow();
		String name = FindAndDecomplier.file.getName();
		name = name.substring(0, name.length() - 4);
		DefaultMutableTreeNode top = new DefaultMutableTreeNode(name);
		name = "forAllProje/" + name + "/" + name + ".apk";
		File file = new File(name);

		DefaultMutableTreeNode add = findFolder(s, file);
		if (add != null)
			top.add(add);

		name = name.replaceAll(".apk", "/smali");
		file = new File(name);
		add = findFolder(s, file);
		if (add != null)
			top.add(add);
		gui.setTreeFind(new JTree(top));
	}

	public static void openFindTree(TreePath path) {
		String s = "forAllProje/";
		if (path != null)
			for (int i = 0; i < path.getPathCount(); i++) {
				if (i == 1) {
					if (path.getPathComponent(i).toString().equals("smali"))
						s += path.getPathComponent(0) + "/";
				}
				s += path.getPathComponent(i) + "/";
			}
		File file = new File(s);
		if (file.isFile()) {
			JTextPane jtp = Deneme.getWindow().getTextPane();
			jtp.setText("");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				int i = -1;
				while ((line = br.readLine()) != null) {
					if (line.contains(find)) {
						i = line.indexOf(find);
						colorWrite(line.substring(0, i), jtp);
						appendToPane(jtp, line.substring(i, i + find.length()), Color.green);
						if (i + find.length() < line.length())
							colorWrite(line.substring(i + find.length()) + "\n", jtp);
					}
				}
			} catch (IOException e) {
				System.out.println("helper isFileHas path" + file.getAbsolutePath());
			}

		}
	}

	private static DefaultMutableTreeNode findFolder(String s, File file) {
		DefaultMutableTreeNode top = null;
		DefaultMutableTreeNode topAdd = null;
		boolean has = false;
		if (file.isDirectory()) {
			for (final File fileEntry : file.listFiles()) {
				if (fileEntry.isDirectory()) {
					topAdd = findFolder(s, fileEntry);
					if (top == null && topAdd != null)
						top = new DefaultMutableTreeNode(file.getName());
					if (topAdd != null)
						top.add(topAdd);
					topAdd = null;
				} else {
					has = isFileHas(s, fileEntry);
					if (top == null && has)
						top = new DefaultMutableTreeNode(file.getName());
					if (has)
						top.add(new DefaultMutableTreeNode(fileEntry.getName()));
					has = false;
				}
			}
		}
		return top;
	}

	private static boolean isFileHas(String s, File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains(s))
					return true;
			}
		} catch (IOException e) {
			System.out.println("helper isFileHas path" + file.getAbsolutePath());
		}
		return false;
	}

	public static void findButton() {
		Gui gui = Deneme.getWindow();
		if (findShow)
			high = gui.getSplitPane2().getDividerLocation();
		findShow = !findShow;
		gui.getScrollPaneFind().setVisible(findShow);
		gui.getPanelFind().setVisible(findShow);
		((JSplitPane) gui.getPanelFind().getComponents()[0]).setDividerLocation(gui.getFrame().getWidth() / 3);
		if (high != 0 && high < gui.getFrame().getHeight())
			gui.getSplitPane2().setDividerLocation(high);
		else
			gui.getSplitPane2().setDividerLocation(gui.getFrame().getHeight() - 110);
	}

	public static void colorWrite(String s, JTextPane jp) {
		String[] keywords = { "import", "class", "while", "if", "for", "void", "abstract", "byte", "static", "break",
				"try", "catch", "case", "const", "continue", "default", "new ", "else", "enum", "extends ", "finally",
				"final", "goto", "implements", "instanceof", "interface", "native", "package", "private", "public",
				"protected", "return", "super", "strictfp", "switch", "synchronized", "this", "throw", "throws",
				"transient", "volatile", "assert", "method", ".method", "int", "boolean", "String", "char", "double",
				"float", "short", "long", "Object", ".end", "android" };
		boolean word;
		while (true) {
			int max = s.length(), ind = -1, leng = 0;
			boolean mavi = false;
			for (int i = 0; i < keywords.length; i++) {
				ind = s.indexOf(keywords[i]);
				if (ind >= 0 && ind < max) {
					word = true;
					try {
						if (Character.isLetter(s.charAt(ind - 1))
								|| Character.isLetter(s.charAt(ind + keywords[i].length())))
							word = false;
					} catch (Exception e) {
						word = true;
					}
					if (word) {
						mavi = false;
						if (i > 43)
							mavi = true;
						max = ind;
						leng = keywords[i].length();
					}
				}
			}
			if (max == s.length()) {
				appendToPane(jp, s, Color.DARK_GRAY);
				break;
			}

			appendToPane(jp, s.substring(0, max), Color.DARK_GRAY);
			if (mavi)
				appendToPane(jp, s.substring(max, max + leng), Color.BLUE);
			else
				appendToPane(jp, s.substring(max, max + leng), Color.RED);
			if ((max + leng) < s.length())
				s = s.substring(max + leng);
			else
				break;
		}
	}

	public static void findInFile() {
		String aranacak = (String) JOptionPane.showInputDialog(Deneme.getWindow().getFrame(), "What is your string?",
				"Find", JOptionPane.QUESTION_MESSAGE);
		if (aranacak == null)
			return;

		JTabbedPane tabbed = Deneme.getWindow().getTabbedPane();
		Component[] com = tabbed.getComponents();
		for (int m = 0; m < com.length; m++) {
			if (com[m] instanceof JPanel) {
				JTextPane jtp = (JTextPane) getTabData((JPanel) com[m], 0);
				int i = -1;
				String text;
				if (jtp != null) {
					text = jtp.getText();
					jtp.setText("");
					while ((i = text.indexOf(aranacak)) > -1) {
						colorWrite(text.substring(0, i), jtp);
						appendToPane(jtp, text.substring(i, i + aranacak.length()), Color.green);
						text = text.substring(i + aranacak.length());
					}
					colorWrite(text, jtp);
				}
			}
		}

		tabbed = Deneme.getWindow().getTabbedPane_1();
		com = tabbed.getComponents();
		for (int m = 0; m < com.length; m++) {
			if (com[m] instanceof JPanel) {
				JTextPane jtp = (JTextPane) getTabData((JPanel) com[m], 0);
				int i = -1;
				String text;
				if (jtp != null) {
					text = jtp.getText();
					jtp.setText("");
					while ((i = text.indexOf(aranacak)) > -1) {
						colorWrite(text.substring(0, i), jtp);
						appendToPane(jtp, text.substring(i, i + aranacak.length()), Color.BLUE);
						text = text.substring(i + aranacak.length());
					}
					colorWrite(text, jtp);
				}
			}
		}
	}

	public static void openApk(Gui gui) {
		JProgressBar searchProgressBar = gui.getJp();
		NewTab.openTab.removeAll(NewTab.openTab);
		searchProgressBar.setValue(0);
		gui.getJt().setText("");
		searchProgressBar.setVisible(true);
		gui.getJt().setVisible(true);
		SwingWorker searchWorker = new Worker("open", gui.getJt(), gui);
		searchWorker.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent event) {
				switch (event.getPropertyName()) {
				case "progress":
					searchProgressBar.setIndeterminate(false);
					searchProgressBar.setValue((Integer) event.getNewValue());
					break;
				case "state":
					switch ((StateValue) event.getNewValue()) {
					case DONE:
						gui.getJt().setVisible(false);
						searchProgressBar.setVisible(false);
						break;
					case STARTED:
					case PENDING:
						searchProgressBar.setVisible(true);
						searchProgressBar.setIndeterminate(true);
						break;
					}
					break;
				}
			}
		});
		searchWorker.execute();
	}

	public static void save() {
		saveAllTab();
		String name = FindAndDecomplier.file.getName();
		name = name.substring(0, name.length() - 4);
		ZipUtil.pack(new File("forAllProje/" + name), new File("forAllZip/" + name + ".asd"));

	}

	public static void tabClose(String tabLabel, boolean javaMi) {
		if (javaMi) {
			int index = Deneme.getWindow().getTabbedPane().indexOfTab(tabLabel);
			Deneme.getWindow().getTabbedPane().remove(index);
			NewTab.openTab.remove(tabLabel);
		} else {
			int index = Deneme.getWindow().getTabbedPane_1().indexOfTab(tabLabel);
			Deneme.getWindow().getTabbedPane_1().remove(index);
			NewTab.openTab.remove(tabLabel.replaceAll(".java", ".smali") + "forSmali");
		}
	}

	public static void writeFile(String path, String str) {
		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"));
			writer.write(str);
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("hata" + path);
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
				/* ignore */}
		}
	}

	public static void openExistApk() throws Exception {

		Gui gui = Deneme.getWindow();
		NewTab.openTab.removeAll(NewTab.openTab);
		gui.getFrame().setVisible(true);
		Component[] cp = gui.getPanel().getComponents();
		for (int i = 0; i < cp.length; i++) {
			if (cp[i].getClass().toString().equals("class javax.swing.JTree")) {
				gui.getPanel().remove(i);
				break;
			}
		}

		FindAndDecomplier.findNode(FindAndDecomplier.openOpenedApk());
		gui.jtree = new JTree(FindAndDecomplier.getNode());
		gui.getPanel().add(gui.jtree, gui.getGbc_tree());
		gui.jtree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					gui.treeClickAction(gui.jtree);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		gui.getFrame().revalidate();

	}

	public static void exportApk() throws Exception {
		if (Deneme.getWindow().jtree == null)
			return;
		saveAllTab();
		FindAndDecomplier.apktool("");
		String[] a = new String[] { "jarsigner", "-verbose", "-sigalg", "SHA1withRSA", "-digestalg", "SHA1",
				"-keystore", "mykey.keystore", "outApk/" + FindAndDecomplier.file.getName(), "alNAme" };
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s += a[i] + " ";
		}
		System.out.println(s);
		FindAndDecomplier.execSign(a);
	}

	public static void exportDeployApk() throws Exception {
		exportApk();
		String[] a = new String[] { "adb", "install", "outApk/" + FindAndDecomplier.file.getName() };
		FindAndDecomplier.exec(a);
	}

	/**
	 * 
	 * @param tb
	 *            islem yapılcak panel
	 * @param index
	 *            0 ise textarea 1 ise pane döner islemi NewTab sınıfına göredir
	 *            NEwTab degisirse incelenmeli
	 * @return
	 */
	private static Component getTabData(JPanel tb, int index) {
		Component[] comPanel;
		Component[] comScrol;
		JViewport jvp;
		JScrollPane jsp;
		comPanel = tb.getComponents();
		if (comPanel.length == 2) {
			if (index == 1 && comPanel[0] instanceof JTextArea) {
				return (JTextArea) comPanel[0];
			} else if (index == 0 && comPanel[1] instanceof JScrollPane) {
				jsp = (JScrollPane) comPanel[1];
				comScrol = jsp.getComponents();
				if (comScrol[0] instanceof JViewport) {
					jvp = (JViewport) comScrol[0];
					return jvp.getView();
				}
			}
		}

		return null;
	}

	private static void saveAllTab() {
		JTabbedPane tabbed = Deneme.getWindow().getTabbedPane();
		Component[] com = tabbed.getComponents();

		for (int m = 0; m < com.length; m++) {
			if (com[m] instanceof JPanel) {
				if (((JPanel) com[m]).getComponentCount() == 2)
					try{
					writeFile(((JTextComponent) getTabData((JPanel) com[m], 1)).getText(),
							((JTextComponent) getTabData((JPanel) com[m], 0)).getText());
					}catch (Exception e) {
						System.out.println(m);
					}
			}
		}
		tabbed = Deneme.getWindow().getTabbedPane_1();
		com = tabbed.getComponents();
		for (int m = 0; m < com.length; m++) {
			if (com[m] instanceof JPanel) {
				if (((JPanel) com[m]).getComponentCount() == 2)try{
					writeFile(((JTextComponent) getTabData((JPanel) com[m], 1)).getText(),
							((JTextComponent) getTabData((JPanel) com[m], 0)).getText());
					}catch (Exception e) {
						System.out.println(m);
					}
			}
		}

	}

	public static void createSmali() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sm = new SmaliWindow();
					sm.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public static void btnCreateJavaToSmali() throws Exception {
		sm.getShowDiolag().setText("");
		sm.getLblSmaliCode().setText("");
		SwingWorker searchWorker = new Worker("create smali", sm.getShowDiolag(), null);
		searchWorker.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent event) {
				switch (event.getPropertyName()) {
				case "progress":
					break;
				case "state":
					switch ((StateValue) event.getNewValue()) {
					case DONE:
						break;
					case STARTED:
					case PENDING:
						break;
					}
					break;
				}
			}
		});
		searchWorker.execute();
	}

	public static void btnShowSmali() {
		sm.getBtnCopy().setVisible(true);
		sm.getLblSmaliCode().setVisible(true);
	}

	static void writeJavaCode(String sta, String ret, String name, String parameter, String ic) {
		String bas = "package com.yourdomain.yourproject;\n import android.app.Activity;"
				+ "\n import android.os.Bundle;" + "\n public class MyActivity extends Activity {";
		String son = "}";
		String code = bas + "  \npublic " + sta + " " + ret + " " + name + "(" + parameter + "){\n " + ic + " \n}\n"
				+ son;
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("projeForSmali/src/com/yourdomain/yourproject/MyActivity.java"));
			bw.write(code);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void btnCopySmali() {
		String myString = sm.getLblSmaliCode().getText();
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);
	}

	public static void exit() {
		try {
			File directory = new File("forAllProje");
			if (directory.exists()) {
				File[] files = directory.listFiles();
				if (null != files) {
					for (int i = 0; i < files.length; i++) {
						if (files[i].isDirectory()) {
							deleteDirectory(files[i]);
						} else {
							files[i].delete();
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}

	public static boolean deleteDirectory(File directory) {
		if (directory.exists()) {
			File[] files = directory.listFiles();
			if (null != files) {
				for (int i = 0; i < files.length; i++) {
					if (files[i].isDirectory()) {
						deleteDirectory(files[i]);
					} else {
						files[i].delete();
					}
				}
			}
		}
		return (directory.delete());
	}

	static String fileToString(String path) throws Exception {
		String s = "";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		boolean kont = false;
		while ((line = br.readLine()) != null) {
			if (kont)
				s += line + "\n";
			else if (line.contains(".end method"))
				kont = true;
		}
		return s;
	}

	public static void appendToPane(JTextPane tp, String msg, Color c) {
		StyleContext sc = StyleContext.getDefaultStyleContext();
		AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

		aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
		aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

		int len = tp.getDocument().getLength();
		tp.setCaretPosition(len);
		tp.setCharacterAttributes(aset, false);
		tp.replaceSelection(msg);
	}
}
