package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JPanel;


public class q1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ArrayList<String> underGradList = new ArrayList<String>();
	DefaultListModel<String> allunderGrad = new DefaultListModel<String>(); 
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	DefaultListModel<String> allGrad = new DefaultListModel<String>(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					q1 window = new q1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public q1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Grades For Students ");
		frame.setBounds(100, 100, 682, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UnderGraduate");
		lblNewLabel.setBounds(10, 11, 163, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(20, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mid1");
		lblNewLabel_2.setBounds(20, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mid2");
		lblNewLabel_2_1.setBounds(20, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Final");
		lblNewLabel_2_2.setBounds(20, 187, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		
		
		textField = new JTextField();
		textField.setBounds(71, 43, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 111, 129, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(71, 147, 129, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(71, 184, 129, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("StudNu");
		lblNewLabel_3.setBounds(20, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(71, 74, 129, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(19, 277, 181, 140);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JList<String> list = new JList<String>(allunderGrad);
		list.setBounds(10, 11, 161, 118);
		panel.add(list);
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int mid1 = Integer.parseInt(textField_1.getText()); 
				int mid2 = Integer.parseInt(textField_2.getText()); 
				int finalGrade = Integer.parseInt(textField_3.getText());
				int studNu = Integer.parseInt(textField_4.getText());
				
				underGrad s1 = new underGrad(textField.getText(),studNu, mid1,mid2,finalGrade );
				underGradList.add(s1.getName() + "=" + s1.computeGrade());
				
				allunderGrad.addElement( s1.getName() + "=" + s1.computeGrade());
				
				textField.setText(null); 
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				
			}
		});
		btnNewButton.setBounds(10, 221, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.setToolTipText("Insert into first position");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int mid1 = Integer.parseInt(textField_1.getText()); 
				int mid2 = Integer.parseInt(textField_2.getText()); 
				int finalGrade = Integer.parseInt(textField_3.getText());
				int studNu = Integer.parseInt(textField_4.getText());
				
				underGrad s1 = new underGrad(textField.getText(),studNu, mid1,mid2,finalGrade );
				underGradList.add(s1.getName() + "=" + s1.computeGrade());
				
				allunderGrad.add(0, s1.getName() + "=" + s1.computeGrade());
				
				textField.setText(null); 
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
			}
		});
		btnNewButton_1.setBounds(111, 221, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setBounds(249, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Mid1");
		lblNewLabel_2_3.setBounds(249, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mid2");
		lblNewLabel_2_1_1.setBounds(249, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Final");
		lblNewLabel_2_2_1.setBounds(249, 187, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 43, 129, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(300, 111, 129, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(300, 147, 129, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(300, 184, 129, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_3_1 = new JLabel("StudNu");
		lblNewLabel_3_1.setBounds(249, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(300, 74, 129, 20);
		frame.getContentPane().add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(248, 277, 181, 140);
		frame.getContentPane().add(panel_1);
		
		JList<String> list_1 = new JList<String>(allGrad);
		list_1.setBounds(10, 11, 161, 118);
		panel_1.add(list_1);
		
		JButton btnNewButton_2 = new JButton("Add");
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_5.getText(); 
				int studNu = Integer.parseInt(textField_9.getText()); 
				int mid1 = Integer.parseInt(textField_6.getText()); 
				int mid2 = Integer.parseInt(textField_7.getText()); 
				int finalGrade = Integer.parseInt(textField_8.getText()); 
				
				graduate g1 = new graduate(name,studNu,mid1,mid2,finalGrade ); 
				
				allGrad.addElement( g1.getName() + "=" + g1.computeGrade());
				
				textField_5.setText(null); 
				textField_9.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				
			}
		});
		btnNewButton_2.setBounds(239, 221, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Insert");
		btnNewButton_1_1.setToolTipText("Insert into first position");
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_5.getText(); 
				int studNu = Integer.parseInt(textField_9.getText()); 
				int mid1 = Integer.parseInt(textField_6.getText()); 
				int mid2 = Integer.parseInt(textField_7.getText()); 
				int finalGrade = Integer.parseInt(textField_8.getText()); 
				
				graduate g1 = new graduate(name,studNu,mid1,mid2,finalGrade ); 
				
				allGrad.add(0, g1.getName() + "=" + g1.computeGrade());
				
				textField_5.setText(null); 
				textField_9.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
			}
		});
		btnNewButton_1_1.setBounds(340, 221, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Graduate ");
		lblNewLabel_4.setBounds(249, 14, 152, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		
		
		
	}
}
