package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import core.Helper;

import java.awt.Color;
import javax.swing.JProgressBar;

public class Dialog extends JDialog {

	/**
	 * Create the dialog.
	 */
	JProgressBar progressBar;
	public JProgressBar getProgressBar() {
		return progressBar;
	}
	public void setProgressBar(JProgressBar progressBar) {
		this.progressBar = progressBar;
	}
	public Dialog() {
		setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		setBounds(300, 300, 170, 25);
		getContentPane().setLayout(new BorderLayout());
		
		 progressBar = new JProgressBar();
		getContentPane().add(progressBar, BorderLayout.CENTER);
		progressBar.setIndeterminate(true);
	}


}
