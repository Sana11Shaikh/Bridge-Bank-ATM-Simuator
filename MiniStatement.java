package bankMgmtSystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame  {

	
	public MiniStatement(String pinnumber) {
		setTitle("Mini_Statement");
		setLayout(null);
		setSize(400,600);
	
	
		
		JLabel mini=new JLabel();
		mini.setBounds(20,140,400,200);
		add(mini);
		
		JLabel bank=new JLabel("Bank of Student");
		bank.setFont(new Font("Arial",Font.BOLD,18));
		bank.setBounds(110,20,150,20);;
		add(bank);
		
		JLabel card=new JLabel();
		card.setBounds(50,80,300,20);
		card.setFont(new Font("Arial",Font.BOLD,14));
		add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(30,400,300,20);
		balance.setFont(new Font("Arial",Font.BOLD,14));
		add(balance);
		//for login
		try {
			Connec c=new Connec();
			ResultSet rs= c.s.executeQuery("select * from login where PinNumber = '"+pinnumber+"'");
			while(rs.next()) {
				card.setText("Card Number : "+rs.getString("CardNumber").substring(0,4)+"********" + rs.getString("CardNumber").substring(12));
			}
			rs.close();
			c.c.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//for bank
		try {
			Connec c=new Connec();
			int bal=0;
			ResultSet rs=c.s.executeQuery("select * from bank where PIN = '"+pinnumber+"'");
        	while(rs.next()) {
				mini.setText(mini.getText() + "<html>" +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("Deposit_Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Amount") +"<br/>"+"<br/>");
				if(rs.getString("type").equals("Deposit")) 
        		{
        			bal += Integer.parseInt(rs.getString("amount"));
            		
        		}
        		else {
        			bal -= Integer.parseInt(rs.getString("amount"));
        		}
        	}
        	balance.setText("Your current account balance is Rs : "+ bal);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	
		setVisible(true);
	}
	public static void main(String[] args) {
		new MiniStatement("");
	}
	

}
