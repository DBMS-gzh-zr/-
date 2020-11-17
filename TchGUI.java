package s_tDMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class TchGUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	public TchGUI() {
		setTitle("教师管理信息界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1051, 710);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("查询学生名单与录入成绩", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 1026, 570);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 14));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(35); 
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\u8BFE\u7A0B\u540D", "\u8BFE\u7A0B\u53F7", "\u5B66\u751F\u5B66\u53F7", "\u5B66\u751F\u59D3\u540D", "\u6210\u7EE9", "\u5B66\u751F\u6240\u5728\u5B66\u9662", "\u5B66\u751F\u5E74\u7EA7"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(250);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(300);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u4F60\u6240\u4EFB\u6559\u7684\u8BFE\u7A0B\uFF1A");
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 10, 279, 35);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.BOLD, 20));
		comboBox.setSelectedItem(null);
		comboBox.setBounds(299, 10, 463, 35);
		panel.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("\u786E\u8BA4\u6210\u7EE9\u4FEE\u6539");
		btnNewButton_1.setFont(new Font("黑体", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 635, 164, 36);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u9009\u62E9\u8BFE\u7A0B\u540E\u70B9\u51FB\u201C\u786E\u5B9A\u9009\u62E9\u201D\uFF0C\u5728\u6210\u7EE9\u5C5E\u6027\u680F\u4E2D\u53CC\u51FB\u8F93\u5165\u6210\u7EE9\uFF0C\u70B9\u51FB\u201C\u786E\u8BA4\u6210\u7EE9\u4FEE\u6539\u201D\u5373\u53EF");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(184, 635, 852, 36);
		panel.add(lblNewLabel_1);
		
		JButton button_1 = new JButton("\u786E\u5B9A\u9009\u62E9");
		button_1.setFont(new Font("黑体", Font.BOLD, 20));
		button_1.setBounds(824, 9, 164, 36);
		panel.add(button_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("查询修改个人信息", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label_12 = new JLabel("\u6559\u5E08\u53F7\uFF1A");
		label_12.setFont(new Font("楷体", Font.BOLD, 25));
		label_12.setBounds(32, 103, 122, 64);
		panel_2.add(label_12);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("宋体", Font.BOLD, 15));
		textField.setBounds(154, 117, 323, 45);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.BOLD, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(154, 230, 323, 45);
		panel_2.add(textField_1);
		
		JLabel label_13 = new JLabel("\u59D3\u540D\uFF1A");
		label_13.setFont(new Font("楷体", Font.BOLD, 25));
		label_13.setBounds(55, 216, 99, 64);
		panel_2.add(label_13);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.BOLD, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(154, 344, 323, 45);
		panel_2.add(textField_2);
		
		JLabel label_14 = new JLabel("\u6240\u5728\u5B66\u9662\uFF1A");
		label_14.setFont(new Font("楷体", Font.BOLD, 25));
		label_14.setBounds(10, 330, 144, 64);
		panel_2.add(label_14);
		
		JLabel label_17 = new JLabel("\u4FEE\u6539\u4E2A\u4EBA\u5BC6\u7801");
		label_17.setFont(new Font("楷体", Font.BOLD, 25));
		label_17.setBounds(733, 10, 154, 64);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("\u65E7\u5BC6\u7801\uFF1A");
		label_18.setFont(new Font("楷体", Font.BOLD, 25));
		label_18.setBounds(584, 103, 122, 64);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("\u65B0\u5BC6\u7801\uFF1A");
		label_19.setFont(new Font("楷体", Font.BOLD, 25));
		label_19.setBounds(584, 216, 122, 64);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801\uFF1A");
		label_20.setFont(new Font("楷体", Font.BOLD, 25));
		label_20.setBounds(530, 316, 176, 64);
		panel_2.add(label_20);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(707, 117, 323, 45);
		panel_2.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("宋体", Font.PLAIN, 15));
		passwordField_1.setBounds(707, 222, 323, 45);
		panel_2.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("宋体", Font.PLAIN, 15));
		passwordField_2.setBounds(707, 330, 323, 45);
		panel_2.add(passwordField_2);
		
		JButton btnNewButton = new JButton("确认");
		btnNewButton.setFont(new Font("幼圆", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(682, 452, 131, 39);
		panel_2.add(btnNewButton);
		
		JButton button = new JButton("\u6E05\u7A7A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField_1.setText(null);
				passwordField_2.setText(null);
			}
		});
		button.setFont(new Font("幼圆", Font.BOLD, 20));
		button.setBounds(865, 452, 131, 39);
		panel_2.add(button);
	}
}
