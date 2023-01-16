import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class transaction {
	public transaction() {
		  JFrame f=new JFrame();
		  f.setVisible(true);
		  f.setBounds(100,200,350,300);
		  f.setLayout(null);
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   JLabel l1=new JLabel("YOUR CURRENT BALANCE:");
		   l1.setBorder(null);
		   l1.setBounds(400,200,300,150);
		   f.add(l1);
		   JLabel l2=new JLabel("YOUR WITHDREW AMOUNT:");
		   l2.setBorder(null); 
		   l2.setBounds(400,250,300,150);
		   f.add(l2);
		   
		   
		   JButton b=new JButton("TRANSACTIONS");
		   b.setBounds(750,380,200,40);
		   f.add(b);
		   f.getContentPane().setBackground(Color.pink);
		   
		   
	}

}
