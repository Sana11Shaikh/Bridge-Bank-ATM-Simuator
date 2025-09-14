package bankMgmtSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3,r4;
	ButtonGroup groupaccount;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancle;
	String formno;
	
	public SignUpThree(String formno) {
		setLayout(null);
		
		this.formno=formno;
		
		setSize(800,700);
		setLocation(350,10);
		
		
		
		setTitle("ACCOUNT  DETAILS  PAGE - 3");
		
		
		JLabel l1=new JLabel("Page 3 : Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,30));
		l1.setBounds(250, 20, 400, 40);
		add(l1);
		
		//account type
		JLabel type=new JLabel("Account Type : ");
		type.setFont(new Font("Raleway",Font.BOLD,24));
		type.setBounds(80, 70, 400, 40);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.PLAIN,18));
		r1.setBounds(200, 110, 190, 20);
		r1.setBackground(Color.WHITE);
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.PLAIN,18));
		r2.setBounds(430, 110, 260, 20);
		r2.setBackground(Color.WHITE);
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.PLAIN,18));
		r3.setBounds(200, 140, 190, 20);
		r3.setBackground(Color.WHITE);
		add(r3);
		
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.PLAIN,18));
		r4.setBounds(430, 140, 290, 20);
		r4.setBackground(Color.WHITE);
		add(r4);
		
		groupaccount = new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		//cardNumber
		JLabel card=new JLabel("Card Number : ");
		card.setFont(new Font("Raleway",Font.BOLD,24));
		card.setBounds(80, 200, 400, 40);
		add(card);
		
		JLabel detailscard=new JLabel("This is your 16 digit-Card Number ");
		detailscard.setFont(new Font("Raleway",Font.PLAIN,12));
		detailscard.setBounds(80, 230, 400, 20);
		add(detailscard);
		
		JLabel number=new JLabel("xxxx-xxxx-xxxx-7855");
		number.setFont(new Font("Raleway",Font.BOLD,24));
		number.setBounds(300, 200, 400, 40);
		add(number);
		
		//pinNumber
		JLabel pin=new JLabel("PIN Number : ");
		pin.setFont(new Font("Raleway",Font.BOLD,24));
		pin.setBounds(80, 270, 400, 40);
		add(pin);
		
		JLabel detailspin=new JLabel("This is your 4 digit - Password ");
		detailspin.setFont(new Font("Raleway",Font.PLAIN,12));
		detailspin.setBounds(80, 300, 400, 20);
		add(detailspin);
				
		JLabel pnumber=new JLabel("xxxx");
		pnumber.setFont(new Font("Raleway",Font.BOLD,24));
		pnumber.setBounds(300, 270, 100, 40);
		add(pnumber);
		
		//services
		JLabel services=new JLabel("Services Required: ");
		services.setFont(new Font("Raleway",Font.BOLD,24));
		services.setBounds(80, 350, 400, 40);
		add(services);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(200,390,170,25);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(430,390,200,25);
		add(c2);
		
		c3 = new JCheckBox("Cheque Book");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(200,430,180,25);
		add(c3);
		
		c4 = new JCheckBox("Mobile Banking");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(430,430,200,25);
		add(c4);
		
		c5 = new JCheckBox("E-Statement ");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(200,470,180,25);
		add(c5);
		
		c6 = new JCheckBox("EMAIL & SMS Alerts");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(430,470,200,25);
		add(c6);
		
		c7 = new JCheckBox("I hearby declares that above entered details are correct to the best of my knowledge.");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway",Font.PLAIN,15));
		c7.setBounds(80,560,590,20);
		add(c7);
		
		
		//submit button
		submit = new JButton(" SUBMIT ");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway",Font.BOLD,16));
		submit.setBounds(440,600,120,30);
		submit.addActionListener(this);
		add(submit);
		
		//cancle button
		cancle = new JButton("CANCLE");
		cancle.setBackground(Color.BLACK);
		cancle.setForeground(Color.WHITE);
		cancle.setFont(new Font("Raleway",Font.BOLD,16));
		cancle.setBounds(220,600,120,30);
		cancle.addActionListener(this);
		add(cancle);
				
		getContentPane().setBackground(Color.GRAY);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			String accountType = null;
			
			if(r1.isSelected()) {
				accountType="Saving Account";
			}
			else if(r2.isSelected()) {
				accountType="Fixed Deposit Account";
			}
			else if(r3.isSelected()) {
				accountType="Current Account";
			}
			else if(r4.isSelected()) {
				accountType="Reccuring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber=""+Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
			
			String pinnumber=""+Math.abs((random.nextLong() % 9000L)+ 1000L);
			
			String facility = "";
			if(c1.isSelected()) {
				facility += "  ATM Card";
			}
			if(c2.isSelected()) {
				facility += "  Internet Banking";
			}
			if(c3.isSelected()) {
				facility += "  Cheque Book";
			}
			if(c4.isSelected()) {
				facility += "  Mobile Banking";
			}
			if(c5.isSelected()) {
				facility += "  E-Statement";
			}
			if(c6.isSelected()) {
				facility += "  EMAIL & SMS Alerts";
			}
			
			//database connection
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null,"Account Type is required ! ");
				}
				else {
					Connec c=new Connec();
					String query1= "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2= "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					
					c.s.executeUpdate(query1);  //DML QUERY CMD
					c.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber+"\n Pin: "+pinnumber);
				}
			}
			catch(Exception sqle) {
				sqle.printStackTrace();
			}
			
		}else if(e.getSource()==cancle) {
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new SignUpThree("");
	}

	

}
