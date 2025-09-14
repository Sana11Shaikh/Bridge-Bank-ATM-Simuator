package bankMgmtSystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;


public class Transaction extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton deposit,withdrawl,ministt,balanceenquiry,pinchange,exit;
	String pinnumber;
	public Transaction(String pinnumber){
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
        
        
        JLabel text= new JLabel("Please select your Transaction.");
        text.setBounds(160,290,600,40);
        image.add(text);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,18));
        
        
        
        deposit=new JButton("Deposit");
        deposit.setBounds(150,360,130,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl=new JButton("Withdraw");
        withdrawl.setBounds(300,360,150,28);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        ministt=new JButton("Mini Statement");
        ministt.setBounds(150,395,130,28);
        ministt.addActionListener(this);
        image.add(ministt);
        
        balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(300,395,150,28);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(150,430,130,28);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        exit=new JButton("Exit");
        exit.setBounds(300,430,150,28);
        exit.addActionListener(this);
        image.add(exit);
        
         
        setUndecorated(true);
		setVisible(true);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			System.exit(0);
		}
		else if(e.getSource()==deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}
		else if(e.getSource()==withdrawl) {
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
		}
		else if(e.getSource()==balanceenquiry) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}
		else if(e.getSource()==ministt) {
			new MiniStatement(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Transaction("");
	}



	
}
