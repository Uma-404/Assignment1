package project.java.swing;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class LogIn extends JFrame{
	 JPanel panel;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;
	 JTextField textField_5;
	 JTextField textField_6;
	 JTextField textField_7;
	 JTextField textField_8;
	 JButton button;
	 public static void main(String[] args)
	 {
		 new RegistrartionForm().setVisible(true);
	 }
		 public LogIn() {
			 
			 setBounds(400,150,700,450);
		panel = new JPanel();
		//panel.setLayout(null);
		
		JLabel l1 = new JLabel("First Name:");
		l1.setForeground(Color.BLACK);
		l1.setBounds(124,89,95,24);
		panel.add(l1);
		
		JLabel l2 = new JLabel("Last Name:");
		l2.setBounds(124,124,95,24);
		panel.add(l2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210,93,157,20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(210,93,157,20);
		panel.add(textField_2);
		
		button = new JButton("Register");
		// button.addActionListener(this);
		 button.setForeground(new Color(205,92,92));
		 button.setBackground(new Color(253,245,230));
		 button.setBounds(199,231,179,39);
		 panel.add(button);
	 }


}
