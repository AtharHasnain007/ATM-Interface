import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class transfer{
public transfer(){
 
	  JFrame f=new JFrame();
	  f.setVisible(true); 
	  f.setBounds(100,200,350,300);
	  f.setLayout(null);
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   JLabel l1=new JLabel("ENTER AMOUNT TO TRANSFER:");
	   l1.setBorder(null);
	   l1.setBounds(400,200,300,150);
	   f.add(l1);
	   JTextField t1=new JTextField();
	   t1.setBounds(600,250,200,40);
	   t1.setBackground(Color.WHITE);
	   f.add(t1);
	   JLabel l2=new JLabel("ENTER DESTINATION ACCOUNT:");
	   l2.setBorder(null);
	   l2.setBounds(400,270,300,150);
	   f.add(l2);
	   JTextField t2=new JTextField();
	   t2.setBounds(600,320,200,40);
	   t2.setBackground(Color.WHITE);
	   f.add(t2);
	   JButton b=new JButton("TRANSFER");
	   b.setBounds(750,380,100,40);
	   f.add(b);
	   f.getContentPane().setBackground(Color.pink);
	   
	   
	   
	   
	   
	   
  }
}
