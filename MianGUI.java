package s_tDMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;

public class MianGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MianGUI frame = new MianGUI();
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
	public MianGUI() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("\u6B66\u6C49\u7406\u5DE5\u5927\u5B66\u8BFE\u7A0B\u7BA1\u7406\u7CFB\u7EDF\uFF08via \u845B\u5DDE\u6052&\u90D1\u7136\uFF09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 645);
		getContentPane().setLayout(null);
		
		Label label = new Label("\u5B66\u751F\u2014\u6559\u5E08\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		label.setBounds(0, -14, 920, 89);
		getContentPane().add(label);
		label.setFont(new Font("Adobe 黑体 Std R", Font.BOLD, 50));
		label.setAlignment(Label.CENTER);
		
		Label label_2 = new Label("\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("楷体_GB2312", Font.BOLD, 20));
		label_2.setBounds(313, 183, 68, 43);
		getContentPane().add(label_2);
		
		JLabel label_3=new JLabel(new ImageIcon(MianGUI.class.getResource("/s_tDMS/img/mian.jpg")));
		getContentPane().add(label_3);
		label_3.setBounds(10, 298, 900, 300);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.BOLD, 14));
		textField.setBackground(Color.WHITE);
		textField.setBounds(387, 140, 188, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "感谢您使用此系统","感谢使用！", JOptionPane.NO_OPTION);  
                System.exit(0);
			}
		});
		button_1.setFont(new Font("黑体", Font.BOLD, 20));
		button_1.setBounds(542, 246, 97, 33);
		getContentPane().add(button_1);
		
		Label label_4 = new Label("\u8EAB\u4EFD\uFF1A");
		label_4.setFont(new Font("楷体_GB2312", Font.BOLD, 20));
		label_4.setBounds(313, 87, 68, 43);
		getContentPane().add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("黑体", Font.BOLD, 20));
		comboBox.setBounds(387, 92, 188, 34);
		comboBox.addItem("教师");
		comboBox.addItem("学生");
		comboBox.setSelectedItem(null);
		getContentPane().add(comboBox);	
		
		JButton button = new JButton("\u6E05\u7A7A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
				comboBox.setSelectedItem(null);
			}
		});
		button.setFont(new Font("黑体", Font.BOLD, 20));
		button.setBounds(415, 246, 97, 33);
		getContentPane().add(button);
		
		
		Label label_1 = new Label("\u5B66\u53F7/\u6559\u5E08\u53F7\uFF1A");
		label_1.setFont(new Font("楷体_GB2312", Font.BOLD, 20));
		label_1.setBounds(245, 130, 128, 53);
		getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String role=new String(comboBox.getSelectedItem().toString());
				if(role.equals("学生"))
				{StuGUI stu1=new StuGUI();
				setVisible(false);
				stu1.setVisible(true);	
				}
				else if(role.equals("教师"))
				{TchGUI tch1=new TchGUI();
				setVisible(false);
				tch1.setVisible(true);	
				}
					
			}
		});
		btnNewButton.setFont(new Font("黑体", Font.BOLD, 20));
		btnNewButton.setBounds(285, 246, 97, 33);
		getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(387, 192, 188, 34);
		getContentPane().add(passwordField);
	}
}
