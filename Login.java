package bankMgmtSystem;
import javax.swing.*;  //for JFrame

import java.awt.*;//for Image
import java.awt.event.*; //for ActionListener
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    /**
     * Java has a feature called serialization — 
     * it lets you take an object in memory and turn it into a byte stream (like saving it to a file or sending over a network).
     * Later, that byte stream can be deserialized back into an object.

	 * Your class Login extends JFrame
	 *JFrame implements Serializable
	 *Therefore, your class is also serializable (whether you want it or not).
	 *The compiler warns you: “Hey, you should define serialVersionUID so future changes don’t break serialization compatibility.”
	 */
	private static final long serialVersionUID = 1L;
	
	JButton login,clear,signup;  //globally declare
	JTextField cardTextField;
	JPasswordField pinTextField;
	Login() {
		setLayout(null);//to set our custom layout
        setTitle("Sana's Automatic Teller Machine");
        setSize(750, 500);
        setLocation(400,180);
        
        //put logo image on screen use class
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("iconx/atm.jpg"));
        //
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        
        //convert image into icon to add it label
        ImageIcon i3=new ImageIcon(i2);
        
        //place image onto JLabel
        JLabel label = new JLabel(i3);
        
        label.setBounds(105,30,90,60);
        
        //place object  onto frame
        add(label);
        
        JLabel text = new JLabel("Welcome to Sana's ATM");
        text.setFont(new Font("Osward",Font.BOLD,35));
        text.setBounds(200,40,400,40);
        add(text);
        
        //cardno
        JLabel cardno = new JLabel("Enter Card No: ");
        cardno.setFont(new Font("Raleway",Font.BOLD,20));
        cardno.setBounds(170,140,150,40);
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(330,150,250,30);
        add(cardTextField);
        
        //PIN
        JLabel pin = new JLabel("Enter Your PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(170,210,300,40);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(330,220,250,30);
        add(pinTextField);
        
        //button
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        clear = new JButton("CLEAR");
        clear.setBounds(440,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(320,350,200,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.GRAY);
        
        setVisible(true);
    }
	
	//method of ActionListener Interface
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			Connec c=new Connec();
			String cardnumber=cardTextField.getText();
			String pinnumber = new String(pinTextField.getPassword());
			String query="select * from login where cardnumber= '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
			try {
				ResultSet rset=c.s.executeQuery(query);  //ddl command
				if(rset.next()) {
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN! ");
				}
				
				rset.close();
                c.c.close();
            
			}
			catch(Exception ae) {
				ae.printStackTrace();
			}
		}
		else if(e.getSource()==clear) {
			cardTextField.setText("");  //to set text manually
			pinTextField.setText("");
			
			
		}
		else if(e.getSource()==signup) {
			setVisible(false);    			//make current page to not visible
			new SignUpOne().setVisible(true); 		 //make visible to signuptwo page after click next
			
		}
		
		
	}

    public static void main(String[] args) {
        new Login();
    }
}