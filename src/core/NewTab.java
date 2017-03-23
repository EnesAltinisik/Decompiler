package core;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.tree.TreePath;

import deneme.Deneme;
import gui.Gui;
import gui.Tab;

public class NewTab {
	static ArrayList<String> openTab = new ArrayList<String>();
	static String last = "";
	static int tabCount = 0;

	public static void open(TreePath path) throws Exception {
		if (tabCount > 9)
			return;
		String name = FindAndDecomplier.file.getName();
		name = name.substring(0, name.length() - 4);
		String s = "forAllProje/" + name + "/";
		if (path != null)
			for (int i = 0; i < path.getPathCount(); i++) {
				s += path.getPathComponent(i) + "/";
			}

		if (last != s) {
			last = s;
			if (!openTab.contains(s)) {
				openLast(last);
				openLastSmali(last);
			}
		}
	}

	private static void openLast(String str) throws Exception {
		File file = new File(str);
		if (!file.isDirectory()) {
			String tabLabel = file.getName();
			if (openTab.contains(tabLabel))
				return;
			else
				openTab.add(tabLabel);

			String ic = fileToString(file);
			Gui window = Deneme.getWindow();
			Tab tab = new Tab();
			Helper.colorWrite(ic, tab.getTxtrDeneme());
			tab.getTxtrPath().setText(file.getAbsolutePath());
			
			
			window.getTabbedPane().addTab(tabLabel, null, tab.getPanel(), null);
			int index = window.getTabbedPane().indexOfTab(tabLabel);
			window.getTabbedPane().setSelectedIndex(index);

			JPanel pnlTab = new JPanel(new GridBagLayout());
			pnlTab.setOpaque(false);
			JLabel lblTitle = new JLabel(tabLabel);
			JButton btnClose = new JButton("x");

			GridBagConstraints gbc = new GridBagConstraints();

			gbc.gridx = 0;
			gbc.gridy = 0;

			pnlTab.add(lblTitle, gbc);

			gbc.gridx++;
			gbc.weightx = 0;
			pnlTab.add(btnClose, gbc);

			window.getTabbedPane().setTabComponentAt(index, pnlTab);

			btnClose.addActionListener((ActionEvent event) -> {
				try {
					Helper.tabClose(tabLabel, true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

		}

	}

	private static void openLastSmali(String str) throws Exception {
		File file = new File(str);
		if (!file.isDirectory()) {
			String tabLabel = file.getName();
			String tabLabelSmali = tabLabel.replaceAll(".java", ".smali");
			if (openTab.contains(tabLabelSmali+"forSmali"))
				return;
			else
				openTab.add(tabLabelSmali+"forSmali");

			String smali, smaliPath;
			String ic = fileToString(file);
			if (!file.getName().substring(file.getName().length() - 4).equals(".xml")) {
				smali = fileToStringSmali(file);
				smaliPath = createSmaliPath(file);
			} else {
				smaliPath = file.getAbsolutePath().replaceAll(".apk/", "/");
				smali = fileToStringSmali(new File(smaliPath));
			}
			Gui window = Deneme.getWindow();

			Tab tab1 = new Tab();
			Helper.colorWrite(smali, tab1.getTxtrDeneme());
			tab1.getTxtrPath().setText(smaliPath);
			
			window.getTabbedPane_1().addTab(tabLabelSmali, null, tab1.getPanel(), null);
			int index = window.getTabbedPane_1().indexOfTab(tabLabelSmali);
			window.getTabbedPane_1().setSelectedIndex(index);

			JPanel pnlTab1 = new JPanel(new GridBagLayout());
			pnlTab1.setOpaque(false);

			GridBagConstraints gbc1 = new GridBagConstraints();

			JLabel lblTitle1 = new JLabel(tabLabelSmali);
			JButton btnClose1 = new JButton("x");

			gbc1.gridx = 0;
			gbc1.gridy = 0;
			gbc1.weightx = 1;

			pnlTab1.add(lblTitle1, gbc1);

			gbc1.gridx++;
			gbc1.weightx = 0;
			pnlTab1.add(btnClose1, gbc1);

			window.getTabbedPane_1().setTabComponentAt(index, pnlTab1);

			btnClose1.addActionListener((ActionEvent event) -> {
				try {
					Helper.tabClose(tabLabelSmali, false);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
	}

	private static String fileToString(File file) throws Exception {
		String s = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			s += line + "\n";
		}
		return s;
	}

	private static String createSmaliPath(File file) {
		String path = file.getAbsolutePath();
		path = path.replaceAll(".apk/", "/smali/");
		int son = -1;
		if ((son = path.lastIndexOf(".java")) > 0) {
			path = path.substring(0, son) + ".smali";
		}
		return path;
	}

	private static String fileToStringSmali(File file) {
		String s = "";
		String path = createSmaliPath(file);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				s += line + "\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			s = "file smalisi yok";
		}

		return s;
	}
}
