import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class balance {
	public balance() {

	  JFrame f=new JFrame();
	  f.setVisible(true);
	  f.setBounds(100,200,350,300);
	  f.setLayout(null);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   JLabel l1=new JLabel("SHOW BALANCE:");
	   l1.setBorder(null);
	   l1.setBounds(400,200,300,150);
	   f.add(l1);
	   JButton b=new JButton("BALANCE"); 
	   b.setBounds(750,320,200,40);
	   f.add(b);
	   f.getContentPane().setBackground(Color.pink);
	   
}
}
