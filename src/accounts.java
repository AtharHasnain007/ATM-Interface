import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Container; 
import java.awt.event.ActionListener;


public class accounts {
  public accounts() {
	  JFrame f=new JFrame(); 
	  f.setVisible(true);
	  f.setBounds(100,200,350,300);
	  f.setLayout(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    final JLabel label = new JLabel("Account Details");            
	     label.setBounds(20,150, 200,50);  
	     final JPasswordField value = new JPasswordField();   
	     value.setBounds(100,75,100,30);  
	  JButton b1=new JButton("CURRENT ACCOUNT");
	  b1.addActionListener(new ActionListener() {
      	@Override
      	public void actionPerformed(ActionEvent e) {
      		EventQueue.invokeLater(new Runnable()
      		{
      	@Override
      	public void run() 
      	{
      		buttons at =new buttons();
      	}
      });
      	}
      });
	  b1.setBounds(300,100,60,20);  
  
	  JButton b2= new JButton("SAVINGS ACCOUNT");
	  b2.addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	      		EventQueue.invokeLater(new Runnable()
	      		{
	      	@Override
	      	public void run() 
	      	{
	      		buttons at =new buttons();
	      	}
	      });
	      	}
	      });
	  b2.setBounds(300,200,80,40);  
	 
	 
	   
	  f.add(b1);
	  f.add(b2);
	 
	 
	  b1.setSize(300,100);
	  b2.setSize(300,100);
	 
	  f.getContentPane().setBackground(Color.black);
	  b1.setBackground(Color.pink);
	  b2.setBackground(Color.pink);
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
