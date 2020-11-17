package s_tDMS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.TableModel;

public class StuGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	public StuGUI() {
		setTitle("\u5B66\u751F\u9009\u8BFE\u7CFB\u7EDF\u754C\u9762");
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
		tabbedPane.addTab("选择课程", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 1026, 606);
		panel.add(scrollPane);
		
		DefaultTableModel  tableModel = new DefaultTableModel(); 
		table_1 = new JTable(tableModel)
		{
            public boolean isCellEditable(int row, int column)
                      {
                                return false;
                      }
        };
		table_1.setFont(new Font("宋体", Font.PLAIN, 14));
		table_1.setRowSelectionAllowed(true);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setRowHeight(35); 
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u8BFE\u7A0B\u540D\u79F0", "\u8BFE\u7A0B\u7F16\u53F7", "\u5F00\u8BFE\u5B66\u9662", "\u6559\u5E08\u59D3\u540D", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0A\u8BFE\u5730\u70B9", "\u603B\u5BB9\u91CF", "\u5269\u4F59\u5BB9\u91CF", "\u5B66\u5206"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(250);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(200);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(300);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(70);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(70);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(70);
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton_1 = new JButton("\u6DFB\u52A0\u8BFE\u7A0B");
		btnNewButton_1.setFont(new Font("黑体", Font.BOLD, 25));
		btnNewButton_1.setBounds(10, 626, 155, 45);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("在上方表格中选择相应的课程，按“添加课程”即可；如果选课时间冲突，系统会自动提示");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(186, 626, 850, 45);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("退出课程", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 10, 1026, 606);
		panel_1.add(scrollPane1);
		
		DefaultTableModel  tableModel1 = new DefaultTableModel(); 
		table_2 = new JTable(tableModel1)
		{
            public boolean isCellEditable(int row, int column)
                      {
                                return false;
                      }
        };
		table_2.setFont(new Font("宋体", Font.PLAIN, 14));
		table_2.setRowSelectionAllowed(true);
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_2.setRowHeight(35); 
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u8BFE\u7A0B\u540D\u79F0", "\u8BFE\u7A0B\u7F16\u53F7", "\u5F00\u8BFE\u5B66\u9662", "\u6559\u5E08\u59D3\u540D", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0A\u8BFE\u5730\u70B9", "\u603B\u5BB9\u91CF", "\u5269\u4F59\u5BB9\u91CF", "\u5B66\u5206"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(200);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(300);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(5).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(6).setPreferredWidth(70);
		table_2.getColumnModel().getColumn(7).setPreferredWidth(70);
		table_2.getColumnModel().getColumn(8).setPreferredWidth(70);
		scrollPane1.setViewportView(table_2);
		
		JButton btnNewButton_2 = new JButton("退出课程");
		btnNewButton_2.setFont(new Font("黑体", Font.BOLD, 25));
		btnNewButton_2.setBounds(10, 625, 155, 45);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel2 = new JLabel("在上方表格中选择自己选择的相应的课程，按“退出课程”即可");
		lblNewLabel2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel2.setBounds(186, 626, 850, 45);
		panel_1.add(lblNewLabel2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("查询成绩", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 1026, 661);
		panel_2.add(scrollPane_1);
		
		DefaultTableModel  tableMode2 = new DefaultTableModel(); 
		table_3 = new JTable(tableMode2){
            public boolean isCellEditable(int row, int column)
            {
                      return false;
            }
};
		table_3.setFont(new Font("宋体", Font.PLAIN, 14));
		table_3.setEnabled(false);
        table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table_3.setRowHeight(35); 
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u8BFE\u7A0B\u540D\u79F0", "\u8BFE\u7A0B\u7F16\u53F7", "\u6559\u5E08\u59D3\u540D", "\u6210\u7EE9", "\u662F\u5426\u83B7\u5F97\u5B66\u5206\uFF08\u53CA\u683C\uFF09"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(300);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(250);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(150);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(150);
		table_3.getColumnModel().getColumn(4).setPreferredWidth(150);
		scrollPane_1.setViewportView(table_3);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("查询个人课表", null, panel_3, null);
		
		table = new JTable();
		table.setEnabled(false);
		table.setBounds(71, 48, 965, 623);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"1", "2", "3", "4", "5", "6", "7"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setPreferredWidth(130);
		table.getColumnModel().getColumn(3).setPreferredWidth(130);
		table.getColumnModel().getColumn(4).setPreferredWidth(130);
		table.getColumnModel().getColumn(5).setPreferredWidth(130);
		table.getColumnModel().getColumn(6).setPreferredWidth(130);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("\u5468\u4E00");
		label.setFont(new Font("黑体", Font.BOLD, 25));
		label.setBounds(111, 10, 62, 38);
		panel_3.add(label);
		table.setRowHeight(125); 
		panel_3.add(table);
		
		JLabel label_1 = new JLabel("\u5468\u4E8C");
		label_1.setFont(new Font("黑体", Font.BOLD, 25));
		label_1.setBounds(248, 10, 62, 38);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("\u5468\u4E09");
		label_2.setFont(new Font("黑体", Font.BOLD, 25));
		label_2.setBounds(386, 10, 62, 38);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("\u5468\u56DB");
		label_3.setFont(new Font("黑体", Font.BOLD, 25));
		label_3.setBounds(524, 10, 62, 38);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("\u5468\u4E94");
		label_4.setFont(new Font("黑体", Font.BOLD, 25));
		label_4.setBounds(662, 10, 62, 38);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("\u5468\u516D");
		label_5.setFont(new Font("黑体", Font.BOLD, 25));
		label_5.setBounds(797, 10, 62, 38);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("\u5468\u65E5");
		label_6.setFont(new Font("黑体", Font.BOLD, 25));
		label_6.setBounds(935, 10, 62, 38);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("\u5468\u4E00");
		label_7.setText("<html><body>第一<br />大节</body></html>");
		label_7.setFont(new Font("黑体", Font.BOLD, 25));
		label_7.setBounds(10, 71, 62, 66);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("<html><body>第二<br />\u5927\u8282</body></html>");
		label_8.setFont(new Font("黑体", Font.BOLD, 25));
		label_8.setBounds(10, 202, 62, 66);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("<html><body>第三<br />\u5927\u8282</body></html>");
		label_9.setFont(new Font("黑体", Font.BOLD, 25));
		label_9.setBounds(10, 325, 62, 66);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("<html><body>第四<br />\u5927\u8282</body></html>");
		label_10.setFont(new Font("黑体", Font.BOLD, 25));
		label_10.setBounds(10, 448, 62, 66);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("<html><body>第五<br />\u5927\u8282</body></html>");
		label_11.setFont(new Font("黑体", Font.BOLD, 25));
		label_11.setBounds(10, 572, 62, 66);
		panel_3.add(label_11);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("查询修改个人信息", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel label_12 = new JLabel("\u5B66\u53F7\uFF1A");
		label_12.setFont(new Font("楷体", Font.BOLD, 25));
		label_12.setBounds(55, 23, 99, 64);
		panel_4.add(label_12);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("宋体", Font.BOLD, 15));
		textField.setBounds(154, 37, 323, 45);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.BOLD, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(154, 131, 323, 45);
		panel_4.add(textField_1);
		
		JLabel label_13 = new JLabel("\u59D3\u540D\uFF1A");
		label_13.setFont(new Font("楷体", Font.BOLD, 25));
		label_13.setBounds(55, 117, 99, 64);
		panel_4.add(label_13);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.BOLD, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(154, 230, 323, 45);
		panel_4.add(textField_2);
		
		JLabel label_14 = new JLabel("\u6240\u5728\u5B66\u9662\uFF1A");
		label_14.setFont(new Font("楷体", Font.BOLD, 25));
		label_14.setBounds(10, 216, 144, 64);
		panel_4.add(label_14);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("宋体", Font.BOLD, 15));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(154, 330, 323, 45);
		panel_4.add(textField_3);
		
		JLabel label_15 = new JLabel("\u5E74\u7EA7\uFF1A");
		label_15.setFont(new Font("楷体", Font.BOLD, 25));
		label_15.setBounds(55, 316, 99, 64);
		panel_4.add(label_15);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("宋体", Font.BOLD, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(154, 435, 323, 45);
		panel_4.add(textField_4);
		
		JLabel label_16 = new JLabel("\u603B\u5B66\u5206\uFF1A");
		label_16.setFont(new Font("楷体", Font.BOLD, 25));
		label_16.setBounds(32, 427, 122, 64);
		panel_4.add(label_16);
		
		JLabel label_17 = new JLabel("\u4FEE\u6539\u4E2A\u4EBA\u5BC6\u7801");
		label_17.setFont(new Font("楷体", Font.BOLD, 25));
		label_17.setBounds(733, 10, 154, 64);
		panel_4.add(label_17);
		
		JLabel label_18 = new JLabel("\u65E7\u5BC6\u7801\uFF1A");
		label_18.setFont(new Font("楷体", Font.BOLD, 25));
		label_18.setBounds(584, 103, 122, 64);
		panel_4.add(label_18);
		
		JLabel label_19 = new JLabel("\u65B0\u5BC6\u7801\uFF1A");
		label_19.setFont(new Font("楷体", Font.BOLD, 25));
		label_19.setBounds(584, 216, 122, 64);
		panel_4.add(label_19);
		
		JLabel label_20 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801\uFF1A");
		label_20.setFont(new Font("楷体", Font.BOLD, 25));
		label_20.setBounds(530, 316, 176, 64);
		panel_4.add(label_20);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(707, 117, 323, 45);
		panel_4.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("宋体", Font.PLAIN, 15));
		passwordField_1.setBounds(707, 222, 323, 45);
		panel_4.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("宋体", Font.PLAIN, 15));
		passwordField_2.setBounds(707, 330, 323, 45);
		panel_4.add(passwordField_2);
		
		JButton btnNewButton = new JButton("确认");
		btnNewButton.setFont(new Font("幼圆", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(682, 452, 131, 39);
		panel_4.add(btnNewButton);
		
		JButton button = new JButton("\u6E05\u7A7A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField_1.setText(null);
				passwordField_2.setText(null);
			}
		});
		button.setFont(new Font("幼圆", Font.BOLD, 20));
		button.setBounds(865, 452, 131, 39);
		panel_4.add(button);
	}
}
