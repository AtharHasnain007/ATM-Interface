import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;

public class buttons {
  public buttons() {
	  JFrame f=new JFrame(); 
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLayout(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    final JLabel label = new JLabel("Account Details");            
	     label.setBounds(20,150, 200,50);  
	     final JPasswordField value = new JPasswordField();   
	     value.setBounds(100,75,100,30);  
	  JButton b1=new JButton("WITHDRAW");
	  b1.addActionListener(new ActionListener() {
      	@Override
      	public void actionPerformed(ActionEvent e) {
      		EventQueue.invokeLater(new Runnable()
      		{
      	@Override
      	public void run() 
      	{
      		withdraw at =new withdraw();
      	}
      });
      	}
      });
	  b1.setBounds(300,100,60,20);  
  
	  JButton b2= new JButton("TRANSACTIONS");
	  b2.addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	      		EventQueue.invokeLater(new Runnable()
	      		{
	      	@Override
	      	public void run() 
	      	{
	      		transaction at =new transaction();
	      	}
	      });
	      	}
	      });
	  b2.setBounds(300,200,80,40);  
	 
	  JButton b3=new JButton("TRANSFER");
	  b3.addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	      		EventQueue.invokeLater(new Runnable()
	      		{
	      	@Override
	      	public void run() 
	      	{
	      		transfer at =new transfer();
	      	}
	      });
	      	}
	      });
	  b3.setBounds(300,300,100,60);  
	
	  JButton b4=new JButton("BALANCE");
	  b4.addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	      		EventQueue.invokeLater(new Runnable()
	      		{
	      	@Override
	      	public void run() 
	      	{
	      		balance at =new balance();
	      	}
	      });
	      	}
	      });
	  b4.setBounds(600,200,300,400);  
	
	  JButton b5=new JButton("DEPOSIT");
	  b5.addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	      		EventQueue.invokeLater(new Runnable()
	      		{
	      	@Override
	      	public void run() 
	      	{
	      		deposit at =new deposit();
	      	}
	      });
	      	}
	      });
	  b5.setBounds(600,300,400,500);  
	   
	  JButton b6=new JButton("QUIT");
	  b6.addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	      		EventQueue.invokeLater(new Runnable()
	      		{
	      	@Override
	      	public void run() 
	      	{
	      		user at =new user();
	      	}
	      });
	      	}
	      });
	  b6.setBounds(600,100,60,20);  
	  f.add(b1);
	  f.add(b2);
	  f.add(b3);
	  f.add(b4);
	  f.add(b5);
	  f.add(b6);
	 
	  b1.setSize(300,100);
	  b2.setSize(300,100);
	  b3.setSize(300,100);
	  b4.setSize(300,100);
	  b5.setSize(300,100);
	  b6.setSize(300,100);
	  f.getContentPane().setBackground(Color.black);
	  b1.setBackground(Color.pink);
	  b2.setBackground(Color.pink);
	  b3.setBackground(Color.pink);
	  b4.setBackground(Color.pink);
	  b5.setBackground(Color.pink);
	  b6.setBackground(Color.pink);
  }
}
