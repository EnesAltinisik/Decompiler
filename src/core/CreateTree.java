package core;

import java.io.File;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import deneme.Deneme;

public class CreateTree {
	public static DefaultMutableTreeNode getNode(File file) {
		String name=FindAndDecomplier.file.getName();
		name=name.substring(0, name.length() - 4);
		return createNodes(new File(Deneme.getPath()+"forAllProje/"+name+"/"+file.getName()));
	}
	public static DefaultMutableTreeNode getNode(String name) {
		String subName=name+".apk";
		return createNodes(new File(Deneme.getPath()+"forAllProje/"+name+"/"+subName));
	}

	private static DefaultMutableTreeNode createNodes(File file) {
		DefaultMutableTreeNode top = new DefaultMutableTreeNode(file.getName());
		if (file.isDirectory()) {
			for (final File fileEntry : file.listFiles()) {
		        if (fileEntry.isDirectory()) {
		        	top.add(createNodes(fileEntry));
		        } else {
		            top.add(new DefaultMutableTreeNode(fileEntry.getName()));
		        }
		    }
		}
		return top;
	}
}
