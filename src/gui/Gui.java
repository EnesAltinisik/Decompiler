package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

import core.FindAndDecomplier;
import core.Helper;
import core.NewTab;
import deneme.Deneme;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.print.attribute.standard.OrientationRequested;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class Gui {

	private JFrame frame;
	JLabel lblJava;
	JLabel lblSmali;
	JPanel panel;
	public JTree jtree;
	JTextArea jt;
	GridBagConstraints gbc_tree;
	public GridBagConstraints getGbc_tree() {
		return gbc_tree;
	}

	public void setGbc_tree(GridBagConstraints gbc_tree) {
		this.gbc_tree = gbc_tree;
	}
	JProgressBar jp;

	public JProgressBar getJp() {
		return jp;
	}

	public void setJp(JProgressBar jp) {
		this.jp = jp;
	}

	public JTextArea getJt() {
		return jt;
	}

	public void setJt(JTextArea jt) {
		this.jt = jt;
	}

	public JTree getJtree() {
		return jtree;
	}

	public void setJtree(JTree jtree) {
		this.jtree = jtree;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	JButton btnFind;
	public JButton getBtnFind() {
		return btnFind;
	}

	public void setBtnFind(JButton btnFind) {
		this.btnFind = btnFind;
	}
	JTabbedPane tabbedPane;
	JTabbedPane tabbedPane_1;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	JSplitPane splitPane2;

	public JSplitPane getSplitPane2() {
		return splitPane2;
	}

	public void setSplitPane2(JSplitPane splitPane2) {
		this.splitPane2 = splitPane2;
	}

	/**
	 * Launch the application.
	 */

	public JLabel getLblJava() {
		return lblJava;
	}

	public void setLblJava(JLabel lblJava) {
		this.lblJava = lblJava;
	}

	public JLabel getLblSmali() {
		return lblSmali;
	}

	public void setLblSmali(JLabel lblSmali) {
		this.lblSmali = lblSmali;
	}
	private JPanel panelFind;
	JTree treeFind;
	JTextPane textPane;
	JScrollPane scrollPaneFind;

	public JScrollPane getScrollPaneFind() {
		return scrollPaneFind;
	}

	public void setScrollPaneFind(JScrollPane scrollPaneFind) {
		this.scrollPaneFind = scrollPaneFind;
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JSplitPane splitPane = new JSplitPane();
		
		panelFind = new JPanel();
		panelFind.setVisible(false);
		
		GridBagLayout gridBagLayoutFind = new GridBagLayout();
		gridBagLayoutFind.columnWidths = new int[] { 0, 0 };
		gridBagLayoutFind.rowHeights = new int[] { 0, 0 };
		gridBagLayoutFind.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayoutFind.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelFind.setLayout(gridBagLayoutFind);

		JSplitPane splitPaneFind = new JSplitPane();
		GridBagConstraints gbc_splitPaneFind = new GridBagConstraints();
		gbc_splitPaneFind.fill = GridBagConstraints.BOTH;
		gbc_splitPaneFind.gridx = 0;
		gbc_splitPaneFind.gridy = 0;
		panelFind.add(splitPaneFind, gbc_splitPaneFind);

		treeFind = new JTree();
		scrollPaneFind = new JScrollPane(treeFind);
		scrollPaneFind.setVisible(false);
		
		splitPaneFind.setLeftComponent(scrollPaneFind);

		textPane = new JTextPane();
		JScrollPane scrolTextPane=new JScrollPane(textPane);
		splitPaneFind.setRightComponent(scrolTextPane);
		
		
		
		 splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				splitPane,panelFind);
		
		frame.getContentPane().add(splitPane2, BorderLayout.CENTER);

		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setDividerLocation(frame.getWidth()/3);
		splitPane.setRightComponent(splitPane_1);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		splitPane_1.setLeftComponent(tabbedPane);

		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		splitPane_1.setRightComponent(tabbedPane_1);
		


		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		JScrollPane scrollPane = new JScrollPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		jtree = new JTree();
		gbc_tree = new GridBagConstraints();
		gbc_tree.insets = new Insets(0, 0, 5, 0);
		gbc_tree.gridx = 0;
		gbc_tree.gridy = 0;
		gbc_tree.anchor=GridBagConstraints.NORTH;
		panel.add(jtree, gbc_tree);
		jtree.setVisible(false);
		
		
		jt = new JTextArea();
		jt.setBackground(Color.LIGHT_GRAY);
		jt.setEditable(false);
		jt.setColumns(5);
		jt.setRows(5);
		GridBagConstraints gbc_tree1 = new GridBagConstraints();
		gbc_tree1.insets = new Insets(0, 0, 5, 0);
		gbc_tree1.gridx = 0;
		gbc_tree1.gridy = 1;
		panel.add(jt, gbc_tree1);
		jt.setVisible(false);
		
		jp = new JProgressBar();
		jp.setEnabled(false);
		GridBagConstraints gbc_tree2 = new GridBagConstraints();
		gbc_tree2.insets = new Insets(0, 0, 5, 0);
		gbc_tree2.gridx = 0;
		gbc_tree2.gridy = 2;
		panel.add(jp, gbc_tree2);
		
		btnFind = new JButton("Find");
		GridBagConstraints gbc_btnFind = new GridBagConstraints();
		gbc_btnFind.gridx = 0;
		gbc_btnFind.gridy = 3;
		gbc_btnFind.anchor=GridBagConstraints.FIRST_LINE_START;
		btnFind.setVisible(false);
		panel.add(btnFind, gbc_btnFind);
		
		jp.setVisible(false);
		splitPane.add(scrollPane);

		createMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		getTreeFind().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Helper.openFindTree(getTreeFind().getSelectionPath());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		getBtnFind().addActionListener((ActionEvent event) -> {
            try {
				Helper.findButton();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });

	}

	public JPanel getPanelFind() {
		return panelFind;
	}

	public void setPanelFind(JPanel panelFind) {
		this.panelFind = panelFind;
	}

	public JTree getTreeFind() {
		return treeFind;
	}

	public void setTreeFind(JTree treeFind) {
		this.treeFind = treeFind;
	}

	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}

	private void createMenuBar() {
		menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");

		JMenu findMenu = new JMenu("Find");

		JMenu exitMenu = new JMenu("Exit");
		JMenu smaliMenu = new JMenu("Smali");

		JMenuItem exitMi = new JMenuItem("Exit");
		JMenuItem smali = new JMenuItem("Smali");

		JMenuItem openMi = new JMenuItem("Open apk");
		JMenuItem saveMi = new JMenuItem("Save proje");
		JMenuItem openExistMi = new JMenuItem("Open exist");
		JMenuItem exportMi = new JMenuItem("export proje");
		JMenuItem exportDeployMi = new JMenuItem("export and deploy");

		JMenuItem findProMi = new JMenuItem("find in proje");
		JMenuItem findFileMi = new JMenuItem("find in file");

		smaliMenu.add(smali);
		exitMenu.add(exitMi);

		exitMi.addActionListener((ActionEvent event) -> {
			Helper.exit();
		});

		findFileMi.addActionListener((ActionEvent event) -> {
			Helper.findInFile();
		});

		findProMi.addActionListener((ActionEvent event) -> {
			Helper.findInProje();
		});
		saveMi.addActionListener((ActionEvent event) -> {
			Helper.save();
		});

		openMi.addActionListener((ActionEvent event) -> {
			try {
				Helper.openApk(this);
				Deneme.getWindow().getTabbedPane().removeAll();
				Deneme.getWindow().getTabbedPane_1().removeAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		openExistMi.addActionListener((ActionEvent event) -> {
			try {
				Helper.openExistApk();
				Deneme.getWindow().getTabbedPane().removeAll();
				Deneme.getWindow().getTabbedPane_1().removeAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		exportMi.addActionListener((ActionEvent event) -> {
			try {
				Helper.exportApk();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		exportDeployMi.addActionListener((ActionEvent event) -> {
			try {
				Helper.exportDeployApk();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		smali.addActionListener((ActionEvent event) -> {
			Helper.createSmali();
		});

		fileMenu.add(openMi);
		fileMenu.add(openExistMi);
		fileMenu.add(saveMi);
		fileMenu.add(exportMi);
		fileMenu.add(exportDeployMi);

		findMenu.add(findProMi);
		findMenu.add(findFileMi);

		menuBar.add(fileMenu);
		menuBar.add(findMenu);
		menuBar.add(smaliMenu);
		menuBar.add(exitMenu);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JTabbedPane getTabbedPane_1() {
		return tabbedPane_1;
	}

	public void setTabbedPane_1(JTabbedPane tabbedPane_1) {
		this.tabbedPane_1 = tabbedPane_1;
	}


	public void treeClickAction(JTree jtree) throws Exception {
		NewTab.open(jtree.getSelectionPath());
	}

}
