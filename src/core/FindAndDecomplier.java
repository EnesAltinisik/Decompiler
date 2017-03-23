package core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.crypto.dsig.keyinfo.PGPData;

import org.zeroturnaround.zip.ZipUtil;

public class FindAndDecomplier {
	static DefaultMutableTreeNode node;
	static File file;
	static String error;

	public static void openFileApk() throws Exception {
		JPanel panel = new JPanel();
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setAcceptAllFileFilterUsed(true);
		String[] exts = { "apk", "dex", "jar", "class", "zip", "aar" };
		String description = "supported files: " + Arrays.toString(exts).replace('[', '(').replace(']', ')');
		fileChooser.setFileFilter(new FileNameExtensionFilter(description, exts));
		fileChooser.setToolTipText("file.open");
		int ret = fileChooser.showDialog(panel, "open");
		if (ret == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
		}
	}

	public static String openOpenedApk() {
		JPanel panel = new JPanel();
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setAcceptAllFileFilterUsed(true);
		fileChooser.setCurrentDirectory(new File("forAllZip"));
		String[] exts = { "asd" };
		String description = "supported files: " + Arrays.toString(exts).replace('[', '(').replace(']', ')');
		fileChooser.setFileFilter(new FileNameExtensionFilter(description, exts));
		fileChooser.setToolTipText("file.open");
		int ret = fileChooser.showDialog(panel, "file.open");
		if (ret == JFileChooser.APPROVE_OPTION) {
			File file1 = fileChooser.getSelectedFile();
			String projeName = file1.getName().substring(0, file1.getName().length() - 4);
			File Unzip = new File("forAllProje/" + projeName);
			ZipUtil.unpack(file1, Unzip);
			file = new File("forAllProje/" + projeName + ".apk");
			return projeName;
		}
		return null;
	}

	public static void apktool(String dORb) throws Exception {
		String name = FindAndDecomplier.file.getName();
		name = name.substring(0, name.length() - 4);
		String[] a;
		if (dORb.equals("d"))
			a = new String[] { "./apktool", "d", file.getAbsolutePath(), "-o",
					"forAllProje/" + name + "/" + file.getName().substring(0, file.getName().length() - 4) };
		else
			a = new String[] { "./apktool", "b", "forAllProje/" + name + "/" + name, "-o", "outApk/" + name + ".apk" };
		exec(a);
	}

	public static void exec(String[] a) {

		try {
			Process p = Runtime.getRuntime().exec(a);
			error = "";
			new Thread(new Runnable() {
				public void run() {
					BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
					String line = null;
					try {
						while ((line = input.readLine()) != null) {
							System.out.println(line);
							if (line.contains("    [javac]") && line.contains(" error"))
								error += line + "\n";
							if (line.equals("Failure [INSTALL_FAILED_ALREADY_EXISTS]")) {
								error = line;
								return;
							}
						}
					} catch (IOException e) {
						System.out.println("bura");
						e.printStackTrace();
					}
				}
			}).start();

			p.waitFor();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void execSign(String[] a) {

		try {
			Process p = Runtime.getRuntime().exec(a);
			error = "";
			new Thread(new Runnable() {
				public void run() {
					try {
						p.getOutputStream().write("Havelsan\n".getBytes());
						p.getOutputStream().flush();
						BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line = null;

						while ((line = input.readLine()) != null) {
							p.getOutputStream().write("Havelsan\n".getBytes());
							p.getOutputStream().flush();
							System.out.println(line);
							if (line.contains("    [javac]") && line.contains(" error"))
								error += line + "\n";
						}
					} catch (IOException e) {
						System.out.println("bura");
						e.printStackTrace();
					}
				}
			}).start();

			p.waitFor();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void findNode() {
		node = CreateTree.getNode(file);
	}

	public static void findNode(String name) {
		node = CreateTree.getNode(name);
	}

	public static void isle() throws Exception {
		String name = FindAndDecomplier.file.getName();
		name = name.substring(0, name.length() - 4);
		String[] a = new String[] { "jadx-master/build/jadx/bin/jadx", file.getAbsolutePath(), "-d",
				"forAllProje/" + name + "/" + file.getName() };
		exec(a);
	}

	public static DefaultMutableTreeNode getNode() {
		return node;
	}

	public static void setNode(DefaultMutableTreeNode node) {
		FindAndDecomplier.node = node;
	}

	public static File getFile() {
		return file;
	}

	public static void setFile(File file) {
		FindAndDecomplier.file = file;
	}
}
