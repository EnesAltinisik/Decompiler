package core;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingWorker;

import deneme.Deneme;
import gui.Gui;
import gui.SmaliWindow;

public class Worker extends SwingWorker<Integer, String> {

	private static void failIfInterrupted() throws InterruptedException {
		if (Thread.currentThread().isInterrupted()) {
			throw new InterruptedException("Interrupted while searching files");
		}
	}

	private final String metod;

	private final JTextArea messagesTextArea;
	private final Gui gui;

	public Worker(String metodName, final JTextArea messagesTextArea, Gui g) {
		this.messagesTextArea = messagesTextArea;
		this.metod = metodName;
		this.gui = g;
	}

	@Override
	protected Integer doInBackground() throws Exception {
		// The number of instances the word is found
		if (metod.equals("open")) {
			Component[] cp = gui.getPanel().getComponents();
			for (int i = 0; i < cp.length; i++) {
				if (cp[i].getClass().toString().equals("class javax.swing.JTree")) {
					gui.getPanel().remove(i);
					break;
				}
			}
			publish("chose file");
			FindAndDecomplier.openFileApk();
			publish("opening file");
			FindAndDecomplier.isle();
			publish("opening with apktool");
			FindAndDecomplier.apktool("d");

			publish("reload frame");
			FindAndDecomplier.findNode();
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
			publish("finish");
		} else if (metod.equals("create smali")) {
			Helper.sm.getBtnCopy().setVisible(false);
			publish("creating start!!");
			String sta, ret, name, parameter, ic;
			sta = Helper.sm.getComboBox().getSelectedItem().toString();
			ret = Helper.sm.getReturnType().getText();
			name = Helper.sm.getMethodname().getText();
			parameter = Helper.sm.getParameter().getText();
			ic = Helper.sm.getCode().getText();
			publish("creating java code");
			Helper.writeJavaCode(sta, ret, name, parameter, ic);
			publish("creting apk");
			String[] a = new String[] { "ant", "debug", "-f", "projeForSmali" };
			FindAndDecomplier.exec(a);
			String hata = FindAndDecomplier.error;
			if (!hata.equals("")) {
				publish(hata);
				return -1;
			}
			publish("creating smali file");
			String[] b = new String[] { "rm", "projeForSmali/out", "-r" };
			FindAndDecomplier.exec(b);
			a = new String[] { "apktool", "d", "projeForSmali/bin/MyName-debug-unaligned.apk", "-o",
					"projeForSmali/out" };

			FindAndDecomplier.exec(a);
			String smali = Helper
					.fileToString("projeForSmali/out" + "/smali/com/yourdomain/yourproject/MyActivity.smali");
			Helper.sm.getLblSmaliCode().setText(smali);
			publish("finish");
			Helper.sm.getBtnCopy().setVisible(true);
			Helper.sm.getLblSmaliCode().setVisible(true);

		} else if (metod.equals("export")) {
			Helper.saveAllTab();
			FindAndDecomplier.apktool("");
			String[] a = new String[] { "jarsigner", "-verbose", "-sigalg", "SHA1withRSA", "-digestalg", "SHA1",
					"-keystore", "mykey.keystore", "outApk/" + FindAndDecomplier.file.getName(), "alNAme" };
			String s = "";
			for (int i = 0; i < a.length; i++) {
				s += a[i] + " ";
			}
			FindAndDecomplier.execSign(a);
		} else if (metod.equals("exportApk")) {
			Helper.saveAllTab();
			FindAndDecomplier.apktool("");
			String[] a = new String[] { "jarsigner", "-verbose", "-sigalg", "SHA1withRSA", "-digestalg", "SHA1",
					"-keystore", "mykey.keystore", "outApk/" + FindAndDecomplier.file.getName(), "alNAme" };
			String s = "";
			for (int i = 0; i < a.length; i++) {
				s += a[i] + " ";
			}
			FindAndDecomplier.execSign(a);
			a = new String[] { "adb", "install", "outApk/" + FindAndDecomplier.file.getName() };
			FindAndDecomplier.exec(a);
			if (FindAndDecomplier.error.equals("Failure [INSTALL_FAILED_ALREADY_EXISTS]")) {
				String packageName = Helper.findPackageName();
				String[] b = { "adb", "uninstall", packageName };
				FindAndDecomplier.exec(b);
				FindAndDecomplier.exec(a);
			}
		}
		return 1;

	}

	@Override
	protected void process(final List<String> chunks) {
		if (messagesTextArea == null)
			return;
		// Updates the messages text area
		for (final String string : chunks) {
			messagesTextArea.append(string);
			messagesTextArea.append("\n");
			if (string.contains("javac"))
				messagesTextArea.setText(string);
		}
	}
}
