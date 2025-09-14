package bankMgmtSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEnquiry extends JFrame implements ActionListener{
	
	JButton back;
	String pinnumber;
	private static final long serialVersionUID = 1L;

	public BalanceEnquiry(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		
		setSize(800,800);
		setLocation(300,0);
		

        //put logo image on screen use class
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("iconx/atm.jpg"));
        //
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        
        //convert image into icon to add it label
        ImageIcon i3=new ImageIcon(i2);
        
        //place image onto JLabel
        JLabel image = new JLabel(i3);
        
        image.setBounds(0,0,800,800);
        
        //place object  onto frame
        add(image);
        
        back=new JButton("Back");
        back.setBounds(340,440,120,30);
        back.addActionListener(this);
        image.add(back);
        
        Connec c=new Connec();
        int balance=0;
        try {
        	ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
        	while(rs.next()) {
        		if(rs.getString("type").equals("Deposit")) 
        		{
        			balance += Integer.parseInt(rs.getString("amount"));
            		
        		}
        		else {
        			balance -= Integer.parseInt(rs.getString("amount"));
        		}
        		
        	}
        	rs.close();
        	//c.c.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        JLabel text= new JLabel("Your current account balance is Rs :"+balance);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,17));
        text.setBounds(135,300,400,30);
        image.add(text);
       
        setUndecorated(true);
        setVisible(true);
	}

	public static void main(String[] args) {
		new BalanceEnquiry("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Transaction(pinnumber).setVisible(true);
		
	}
}
