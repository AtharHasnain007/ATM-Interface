import java.awt.Color;

import javax.swing.*;
public class deposit {
	public deposit() {
   
	   JFrame f=new JFrame(); 
		  f.setVisible(true);
		  f.setBounds(100,200,350,300);
		  f.setLayout(null);
		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   JLabel label=new JLabel("ENTER AMOUNT TO DEPOSIT:");
		   label.setBorder(null);
		   label.setBounds(400,200,300,150);
		   JTextField text=new JTextField();
		   text.setBounds(600,250,200,40);
		   text.setBackground(Color.WHITE);
		   f.add(text);
		   f.add(label);
		   JButton b=new JButton("DEPOSIT");
		   b.setBounds(750,300,100,40);
		   f.add(b);
		   f.getContentPane().setBackground(Color.pink);
		   
		   
		   
	         
   }
}
