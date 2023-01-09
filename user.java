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


public class user{
  
    public static void main(String[] args) {    
    JFrame f=new JFrame();
     
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBounds(0,0,350,300);
    f.setVisible(true); 
    JLabel label = new JLabel(new ImageIcon("file:///C:/Users/DC/eclipse-workspace/ATM/src/ATM%20(1).jpg"));            
       label.setBounds(80,50,1800,10);
       f.add(label);
       
       JPasswordField value = new JPasswordField();   
       value.setBounds(450,300,200,40);   
       JLabel l1=new JLabel("ID:");    
       l1.setBounds(400,200,300,150);  
       l1.setFont(new Font("Times New Roman",Font.PLAIN,30));
        JLabel l2=new JLabel("PIN:");    
        l2.setBounds(400,250,300,150);   
        l2.setFont(new Font("Times New Roman",Font.PLAIN,27));
        f.getContentPane().setBackground(Color.cyan);
        JButton b = new JButton("ENTER");  
        b.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		EventQueue.invokeLater(new Runnable()
        		{
        	@Override
        	public void run() 
        	{
        		buttons but=new buttons();
        	}
        });
        	}
        });
        
        b.setBounds(600,380,200,40);    
        JTextField text = new JTextField();  
        text.setBounds(450,250,200,40);    
                f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  
                f.setSize(300,300);      
                Container c=f.getContentPane();
                JLabel m=new JLabel();
                m.setIcon(new ImageIcon("fats.jpg"));
                Dimension size=m.getPreferredSize();
                m.setBounds(50, 30, size.width, size.height);
                c.add(m); 
                JTextField fa=  new JTextField("UIT BANK");
                fa.setBounds(0,0, 1400,100);
                fa.setBackground(Color.pink);
                f.add(fa);
                fa.setFont(new Font("Times New Roman",Font.PLAIN,40));
                fa.setHorizontalAlignment(JLabel.CENTER);
                b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                	String data = "Username " + text.getText();  
                    data += ", Password: "   
                    + new String(value.getPassword());   
                    label.setText(data);  
                
                }
             });   
}  
}  
