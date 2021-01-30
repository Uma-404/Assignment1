package project.java.swing;
import java.awt.*;
import com.mysql.jdbc.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;



public  class RegistrartionForm extends JFrame implements ActionListener  {
	
	
	
	 JPanel panel;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;
	 JTextField textField_5;
	 JTextField textField_6;
	 JTextField textField_7;
	 JComboBox day,month,year;
	 JTextArea text_area_1;
	 JTextArea text_area_2;
	 JButton button;
	 public static void main(String[] args)
	 {
		 new RegistrartionForm().setVisible(true);
	 }
	  Connection db;
		 public RegistrartionForm() {
			 
			 db = Conn.dbConnect();
			 
			 setTitle("Registration Form");
			 setBounds(400,150,700,450);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 Container c = getContentPane();
			 c.setLayout(null);
		
		
		JLabel l1 = new JLabel("First Name:");
		l1.setForeground(Color.BLACK);
		l1.setBounds(50,39,95,24);
		c.add(l1);
		
		JLabel l2 = new JLabel("Last Name:");
		l2.setBounds(50,79,95,24);
		c.add(l2);
		
		JLabel l3 = new JLabel("Date of Birth:");
		l3.setBounds(50,119,95,24);
		c.add(l3);
		
		String[] days = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String[] months = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String [] years  = {"1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980","1979","1978","1977","1976","1975","1974","1973","1972","1971","1970","1969"};
		
		
		day = new JComboBox(days);
		month = new JComboBox(months);
		year = new JComboBox(years);
		day.setBounds(150,121,40,24);
		month.setBounds(200, 121,90, 24);
		year.setBounds(300, 121, 50, 24);
		c.add(day);
		c.add(month);
		c.add(year);
		
		JLabel l4 = new JLabel("Age:");
		l4.setBounds(50,159,95,24);
		c.add(l4);
		
		JLabel l5 = new JLabel("Address Line 1:");
		l5.setBounds(50,209,95,24);
		c.add(l5);
		
		JLabel l6 = new JLabel("Address Line 2:");
		l6.setBounds(50,259,95,24);
		c.add(l6);
		
		JLabel l7 = new JLabel("City:");
		l7.setBounds(400,39,95,24);
		c.add(l7);
		
		JLabel l8 = new JLabel("State:");
		l8.setBounds(400,79,95,24);
		c.add(l8);
		
		JLabel l9 = new JLabel("Country:");
		l9.setBounds(400,119,95,24);
		c.add(l9);
		
		JLabel l10 = new JLabel("Postel Code:");
		l10.setBounds(400,159,95,24);
		c.add(l10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150,41,157,20);
		c.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150,81,157,20);
		c.add(textField_2);
		
	
		
		textField_3 = new JTextField();
		textField_3.setBounds(150,161,157,20);
		c.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(500,41,157,20);
		c.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(500,81,157,20);
		c.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(500,121,157,20);
		c.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(500,161,157,20);
		c.add(textField_7);
		
		text_area_1 = new JTextArea();
		text_area_1.setBounds(150,203,150,35);
		c.add(text_area_1);
		
		text_area_2 = new JTextArea();
		text_area_2.setBounds(150,255,150,35);
		c.add(text_area_2);
		
		button = new JButton("Register");
		 button.setForeground(new Color(205,92,92));
		 button.setBackground(new Color(253,245,230));
		 button.setBounds(230,350,179,39);
		 c.add(button);
		
		button.addActionListener(this);
		 }
		 
		public  void actionPerformed(ActionEvent e) {
			String first_name = textField_1.getText();
			String last_name = textField_2.getText();
			String dob = year.getSelectedItem()+"/"+month.getSelectedItem()+"/"+day.getSelectedItem();
			String age = textField_3.getText();
			String address_line_1 = text_area_1.getText();
			String address_line_2 = text_area_2.getText();
			String city = textField_4.getText();
			String state = textField_5.getText();
			String  country = textField_6.getText();
			String postel_code =textField_4.getText();
			
try {
			PreparedStatement pst1 =   db.prepareStatement("insert into personal_info(first_name,last_name,dob,age) values(?,?,?,?)");

			PreparedStatement pst2 =  db.prepareStatement("insert into address_info(address_line_1,address_line_2,city,state,country,postel_code) values(?,?,?,?,?,?)");
			



			pst1.setString(1, first_name);
			pst1.setString(2, last_name);
			pst1.setString(3,dob );
			pst1.setString(4, age);
			pst1.executeUpdate();
			
			pst2.setString(1,address_line_1);
			pst2.setString(2,address_line_2);
			pst2.setString(3,city);
			pst2.setString(4,state);
			pst2.setString(5,postel_code);
			pst2.executeUpdate();
			JOptionPane.showMessageDialog(null, "Sucessfully Registerd");
			
		
}
catch(Exception e1)
{
	System.out.print(e1);
}

		}
		
		
		/** button.setForeground(new Color(205,92,92));
		 button.setBackground(new Color(253,245,230));
		 button.setBounds(230,350,179,39);
		 c.add(button); **/

		
		 }
