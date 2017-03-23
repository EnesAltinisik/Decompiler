package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import core.Helper;

import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Color;

public class SmaliWindow {

	public JFrame frame;
	private final JLabel lblNewLabel = new JLabel("public class forSmali{");
	private JTextField returnType;
	private JComboBox comboBox;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextArea Code;
	private JTextField Methodname;
	private JLabel lblNewLabel_5;
	private JTextField parameter;
	private JButton btnCreate;
	private JTextArea showDiolag;
	private JTextArea lblSmaliCode;
	public JPanel panel;
	private JButton btnCopy;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public SmaliWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel=new JPanel();
		panel.setLayout(gridBagLayout);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		gbc_lblNewLabel.gridwidth=6;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		comboBox.addItem("  ");
		comboBox.addItem("static");
		comboBox.setSelectedIndex(0);
		panel.add(comboBox, gbc_comboBox);
		
		returnType = new JTextField();
		returnType.setText("return type");
		GridBagConstraints gbc_returnType = new GridBagConstraints();
		gbc_returnType.insets = new Insets(0, 0, 5, 5);
		gbc_returnType.fill = GridBagConstraints.HORIZONTAL;
		gbc_returnType.gridx = 2;
		gbc_returnType.gridy = 1;
		panel.add(returnType, gbc_returnType);
		returnType.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("public");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_5 = new JLabel("(");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 1;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		Code = new JTextArea();
		Code.setText("code");
		GridBagConstraints gbc_Code = new GridBagConstraints();
		gbc_Code.insets = new Insets(0, 0, 5, 5);
		gbc_Code.fill = GridBagConstraints.BOTH;
		gbc_Code.gridx = 0;
		gbc_Code.gridy = 2;
		gbc_Code.gridwidth=6;
		panel.add(Code, gbc_Code);
		
		lblNewLabel_3 = new JLabel(") {");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 6;
		gbc_lblNewLabel_3.gridy = 1;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		Methodname = new JTextField();
		Methodname.setText("method name");
		GridBagConstraints gbc_Methodname = new GridBagConstraints();
		gbc_Methodname.insets = new Insets(0, 0, 5, 5);
		gbc_Methodname.fill = GridBagConstraints.HORIZONTAL;
		gbc_Methodname.gridx = 3;
		gbc_Methodname.gridy = 1;
		panel.add(Methodname, gbc_Methodname);
		Methodname.setColumns(10);
		
		btnCopy = new JButton("Copy");
		GridBagConstraints gbc_btnCopy = new GridBagConstraints();
		gbc_btnCopy.insets = new Insets(0, 0, 5, 5);
		gbc_btnCopy.gridx = 5;
		gbc_btnCopy.gridy = 8;
		btnCopy.setVisible(false);
		panel.add(btnCopy, gbc_btnCopy);
		
		showDiolag = new JTextArea();
		GridBagConstraints gbc_showDiolag = new GridBagConstraints();
		gbc_showDiolag.insets = new Insets(0, 0, 5, 5);
		gbc_showDiolag.gridx = 0;
		gbc_showDiolag.gridy = 6;
		gbc_showDiolag.gridwidth=6;
		gbc_showDiolag.fill = GridBagConstraints.BOTH;
		panel.add(showDiolag, gbc_showDiolag);
		
		lblSmaliCode = new JTextArea();
		lblSmaliCode.setBackground(new Color(0, 255, 255));
		GridBagConstraints gbc_lblSmaliCode = new GridBagConstraints();
		gbc_lblSmaliCode.insets = new Insets(0, 0, 0, 5);
		gbc_lblSmaliCode.fill = GridBagConstraints.BOTH;
		gbc_lblSmaliCode.gridx = 0;
		gbc_lblSmaliCode.gridy = 7;
		gbc_lblSmaliCode.gridwidth=6;
		panel.add(lblSmaliCode, gbc_lblSmaliCode);
		lblSmaliCode.setVisible(false);
		
		
		JLabel lblNewLabel_2 = new JLabel("}");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		parameter = new JTextField();
		parameter.setText("parameter");
		GridBagConstraints gbc_parameter = new GridBagConstraints();
		gbc_parameter.insets = new Insets(0, 0, 5, 5);
		gbc_parameter.fill = GridBagConstraints.HORIZONTAL;
		gbc_parameter.gridx = 5;
		gbc_parameter.gridy = 1;
		panel.add(parameter, gbc_parameter);
		parameter.setColumns(10);
		
		btnCreate = new JButton("create smali");
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreate.gridx = 5;
		gbc_btnCreate.gridy = 5;
		panel.add(btnCreate, gbc_btnCreate);
		
		lblNewLabel_4 = new JLabel("}");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JScrollPane jScrollPane = new JScrollPane(panel);
		frame.getContentPane().add(jScrollPane);
		
		btnAction();
	}
	public JTextArea getLblSmaliCode() {
		return lblSmaliCode;
	}

	public void setLblSmaliCode(JTextArea lblSmaliCode) {
		this.lblSmaliCode = lblSmaliCode;
	}

	private void btnAction() {
		getBtnCreate().addActionListener((ActionEvent event) -> {
            try {
				Helper.btnCreateJavaToSmali();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
		getBtnCopy().addActionListener((ActionEvent event) -> {
            try {
				Helper.btnCopySmali();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
		parameter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(parameter.getText().equals("parameter"))
						parameter.setText("");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Methodname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(Methodname.getText().equals("method name"))
						Methodname.setText("");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		returnType.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(returnType.getText().equals("return type"))
						returnType.setText("");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Code.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(Code.getText().equals("code"))
						Code.setText("");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getBtnCopy() {
		return btnCopy;
	}

	public void setBtnCopy(JButton btnCopy) {
		this.btnCopy = btnCopy;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getReturnType() {
		return returnType;
	}

	public void setReturnType(JTextField returnType) {
		this.returnType = returnType;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JTextArea getCode() {
		return Code;
	}

	public void setCode(JTextArea code) {
		Code = code;
	}

	public JTextField getMethodname() {
		return Methodname;
	}

	public void setMethodname(JTextField methodname) {
		Methodname = methodname;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public JTextField getParameter() {
		return parameter;
	}

	public void setParameter(JTextField parameter) {
		this.parameter = parameter;
	}

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}

	

	public JTextArea getShowDiolag() {
		return showDiolag;
	}

	public void setShowDiolag(JTextArea showDiolag) {
		this.showDiolag = showDiolag;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

}

