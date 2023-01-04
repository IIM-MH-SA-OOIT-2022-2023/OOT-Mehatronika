package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmIgrac extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private DefaultListModel<String> dlm = new DefaultListModel<>();
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmIgrac frame = new FrmIgrac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmIgrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Igraci");
		setBounds(100, 100, 580, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.YELLOW);
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Forma za unos igraca");
		lblNaslov.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelNorth.add(lblNaslov);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(Color.PINK);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnDodaj = new JButton("Dijalog igrac");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgIgrac dlg = new DlgIgrac();
				dlg.setVisible(true);
				if(dlg.isCheck()) {
					dlm.add(0, dlg.getIme() + " " + dlg.getPrezime());
				}
			}
		});
		btnDodaj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSouth.add(btnDodaj);
		
		JButton btnModifikuj = new JButton("Modifikacija");
		btnModifikuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DlgIgrac dlg = new DlgIgrac();
					String igrac = dlm.get(list.getSelectedIndex());
					String[] razdvajanje = igrac.split(" ");
					if(razdvajanje.length>1) {
						dlg.setIme(razdvajanje[0]);
						dlg.setPrezime(razdvajanje[1]);
					}else {
						dlg.setPrezime(razdvajanje[0]);
					}
					dlg.setVisible(true);
					if(dlg.isCheck()) {
						int index = list.getSelectedIndex();
						dlm.remove(index);
						dlm.add(index, dlg.getIme() + " " + dlg.getPrezime());
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,
							"Prvo morate selektovati igraca za izmenu", 
							"Neodradjena selekcija", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnModifikuj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSouth.add(btnModifikuj);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.PINK);
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{15, 0, 5, 0, 5, 0, 0, 0, 0, 0, 15, 0};
		gbl_panelCenter.rowHeights = new int[]{20, 23, 30, 0, 30, 0, 30, 0, 30, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblTadic = new JLabel("Dusan Tadic");
		lblTadic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblTadic = new GridBagConstraints();
		gbc_lblTadic.insets = new Insets(0, 0, 5, 5);
		gbc_lblTadic.gridx = 3;
		gbc_lblTadic.gridy = 1;
		panelCenter.add(lblTadic, gbc_lblTadic);
		
		JButton btnTadic = new JButton("Tadic");
		btnTadic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblTadic.getText());
			}
		});
		btnTadic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnTadic = new GridBagConstraints();
		gbc_btnTadic.insets = new Insets(0, 0, 5, 5);
		gbc_btnTadic.gridx = 1;
		gbc_btnTadic.gridy = 1;
		panelCenter.add(btnTadic, gbc_btnTadic);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 1;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		list.setModel(dlm);
		scrollPane.setViewportView(list);
		
		JLabel lblVlahovic = new JLabel("Dusan Vlahovic");
		lblVlahovic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblVlahovic = new GridBagConstraints();
		gbc_lblVlahovic.insets = new Insets(0, 0, 5, 5);
		gbc_lblVlahovic.gridx = 3;
		gbc_lblVlahovic.gridy = 3;
		panelCenter.add(lblVlahovic, gbc_lblVlahovic);
		
		JButton btnVlahovic = new JButton("Vlahovic");
		btnVlahovic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblVlahovic.getText());
			}
		});
		btnVlahovic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnVlahovic = new GridBagConstraints();
		gbc_btnVlahovic.insets = new Insets(0, 0, 5, 5);
		gbc_btnVlahovic.gridx = 1;
		gbc_btnVlahovic.gridy = 3;
		panelCenter.add(btnVlahovic, gbc_btnVlahovic);
		
		JLabel lblMitrovic = new JLabel("Aleksandar Mitrovic");
		lblMitrovic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMitrovic = new GridBagConstraints();
		gbc_lblMitrovic.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitrovic.gridx = 3;
		gbc_lblMitrovic.gridy = 5;
		panelCenter.add(lblMitrovic, gbc_lblMitrovic);
		
		JButton btnMitrovic = new JButton("Mitrovic");
		btnMitrovic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblMitrovic.getText());
			}
		});
		btnMitrovic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnMitrovic = new GridBagConstraints();
		gbc_btnMitrovic.insets = new Insets(0, 0, 5, 5);
		gbc_btnMitrovic.gridx = 1;
		gbc_btnMitrovic.gridy = 5;
		panelCenter.add(btnMitrovic, gbc_btnMitrovic);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Unesi igraca");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					textField.setEditable(true);
				}else {
					textField.setEditable(false);
					textField.setText("");
				}
			}
		});
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 7;
		panelCenter.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!((c>='A' && c<='Z') || (c>='a' && c<='z'))) {
					e.consume();
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()  == KeyEvent.VK_ENTER) {
					dlm.add(0, textField.getText());
					textField.setText("");
				}
			}
		});
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 7;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblIgraci = new JLabel("Igraci");
		lblIgraci.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIgraci = new GridBagConstraints();
		gbc_lblIgraci.insets = new Insets(0, 0, 0, 5);
		gbc_lblIgraci.gridx = 1;
		gbc_lblIgraci.gridy = 9;
		panelCenter.add(lblIgraci, gbc_lblIgraci);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gudelj", "Jovic", "Milinkovic Savic"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 9;
		panelCenter.add(comboBox, gbc_comboBox);
	}

}
