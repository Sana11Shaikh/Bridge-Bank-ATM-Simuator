package bankMgmtSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextField amount;
	JButton deposit,back;
	String pinnumber;
	public Deposit(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);//to set our custom layout
        setSize(800, 800);
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
        
        JLabel text = new JLabel("Enter the amount you want to deposit.");
        text.setForeground(Color.WHITE);  
        text.setFont(new Font("Osward",Font.BOLD,16));
        text.setBounds(150,280,400,40);
        image.add(text);
        
        amount=new JTextField();
        amount.setBounds(150,340,300,30);
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(amount);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(325,410,130,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back=new JButton("Back");
        back.setBounds(325,450,130,30);
        back.addActionListener(this);
        image.add(back);
        
        setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==deposit) {
			String number=amount.getText();
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String formattedDate=sdf.format(date);
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter amount here. ");	
			}
			else 
			{
				try 
				{
					Connec c=new Connec();
					String query="insert into bank values('"+pinnumber+"','"+formattedDate+"','Deposit','"+number+"')";
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs. "+number+" Deposited Successfully!");	
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
					
				}
				catch(Exception ae) {
					ae.printStackTrace();
				}
			}
		}
		else if(e.getSource()==back) {
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
		
		}
	}

	public static void main(String[] args) {
		new Deposit("");
	}
	
}
