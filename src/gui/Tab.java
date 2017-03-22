package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Tab {

	private JPanel panel;
	JTextPane txtrDeneme;
	JTextArea txtrPath;
	JScrollPane scrollPane ;

	/**
	 * Launch the application.
	 */

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	/**
	 * Create the application.
	 */
	public Tab() {
		initialize();
	}

	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		panel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gridBagLayout);
	
		txtrDeneme = new JTextPane();
		GridBagConstraints gbc_txtrDeneme = new GridBagConstraints();
		gbc_txtrDeneme.fill = GridBagConstraints.BOTH;
		gbc_txtrDeneme.gridx = 0;
		gbc_txtrDeneme.gridy = 1;
		//panel.add(txtrDeneme, gbc_txtrDeneme);
		
		txtrPath = new JTextArea();
		txtrPath.setVisible(false);
		GridBagConstraints gbc_txtrPath = new GridBagConstraints();
		gbc_txtrPath.fill = GridBagConstraints.BOTH;
		gbc_txtrPath.gridx = 0;
		gbc_txtrPath.gridy = 2;
		panel.add(txtrPath, gbc_txtrPath);
		
        scrollPane = new JScrollPane(txtrDeneme);
        panel.add(scrollPane,gbc_txtrDeneme);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextArea getTxtrPath() {
		return txtrPath;
	}

	public void setTxtrPath(JTextArea txtrPath) {
		this.txtrPath = txtrPath;
	}

	public JTextPane getTxtrDeneme() {
		return txtrDeneme;
	}

	public void setTxtrDeneme(JTextPane txtrDeneme) {
		this.txtrDeneme = txtrDeneme;
	}

}
