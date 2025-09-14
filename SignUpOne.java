package bankMgmtSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;  //for Random class
import com.toedter.calendar.JDateChooser;  //for calender

public class SignUpOne extends JFrame implements ActionListener{
	JTextField fnameJTextField,pinJTextField,mnameJTextField,lnameJTextField;
	JTextField emailJTextField,stateJTextField,addrJTextField;
	JRadioButton unmarried,married,other,male,female;
	ButtonGroup gendergroup,maritalgroup;
	JButton next;
	long random;
	JDateChooser datechooser;
	SignUpOne()
	{
		Random r = new Random();
		random = Math.abs((r.nextLong()%9000L)+1000L);
		//heading
		JLabel formno= new JLabel("APPLICATION FORM NO : "+ random);
		formno.setFont(new Font("Raleway",Font.BOLD,35));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		
		JLabel personDetails= new JLabel("Page 1 : Personal Details");
		personDetails.setFont(new Font("Raleway",Font.BOLD,30));
		personDetails.setBounds(210,70,400,40);
		add(personDetails);
		 
		//Name
		JLabel fname= new JLabel("Your Name : ");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(140,150,200,30);
		add(fname);
		
		fnameJTextField=new JTextField(); 
		fnameJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		fnameJTextField.setBounds(300,150,300,30);
		add(fnameJTextField);
		
		//father name
		JLabel mname= new JLabel("Father's Name : ");
		mname.setFont(new Font("Raleway",Font.BOLD,20));
		mname.setBounds(140,200,200,30);
		add(mname);
		
		mnameJTextField=new JTextField(); 
		mnameJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		mnameJTextField.setBounds(300,200,300,30);
		add(mnameJTextField);
		
		//last name
		JLabel lname= new JLabel("Last Name : ");
		lname.setFont(new Font("Raleway",Font.BOLD,20));
		lname.setBounds(140,250,200,30);
		add(lname);
		
		lnameJTextField=new JTextField(); 
		lnameJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		lnameJTextField.setBounds(300,250,300,30);
		add(lnameJTextField);
		
		//DOB
		JLabel dob= new JLabel("Date of Birth : ");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(140,300,200,30);
		add(dob);
		
		datechooser = new JDateChooser();
		datechooser.setBounds(300,300,300,30);
		datechooser.setForeground(Color.BLACK);
		add(datechooser);
		
		//gender
		JLabel gender= new JLabel("Gender : ");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(140,350,200,30);
		add(gender);
		
		male=new JRadioButton("Male");
		male.setBounds(300,350,100,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		
		female=new JRadioButton("Female");
		female.setBounds(400,350,100,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		other=new JRadioButton("Other");
		other.setBounds(500,350,100,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(other);
		
		
		
		//email
		JLabel email= new JLabel("Email : ");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(140,400,200,30);
		add(email);
		
		emailJTextField=new JTextField(); 
		emailJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		emailJTextField.setBounds(300,400,300,30);
		add(emailJTextField);
		
		//marital status
		JLabel marital= new JLabel("Marital Status : ");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(140,450,200,30);
		add(marital);
		
		married=new JRadioButton("Married");
		married.setBounds(300,450,100,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(400,450,100,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		other=new JRadioButton("Other");
		other.setBounds(500,450,100,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		maritalgroup=new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		
		//address
		JLabel addr= new JLabel("Address : ");
		addr.setFont(new Font("Raleway",Font.BOLD,20));
		addr.setBounds(140,500,200,30);
		add(addr);
		
		addrJTextField=new JTextField(); 
		addrJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		addrJTextField.setBounds(300,500,300,30);
		add(addrJTextField);
		
		
		//state
		JLabel state= new JLabel("State : ");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(140,550,200,30);
		add(state);
		
		stateJTextField=new JTextField(); 
		stateJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		stateJTextField.setBounds(300,550,300,30);
		add(stateJTextField);
		
		//pincode
		JLabel pincode= new JLabel("PINcode : ");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(140,600,200,30);
		add(pincode);
		
		pinJTextField=new JTextField(); 
		pinJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		pinJTextField.setBounds(300,600,300,30);
		add(pinJTextField);
		
		//Button for next page
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(600,650,100,40);
		next.addActionListener(this);
		add(next);
		
		
		setSize(800,770);
		setLocation(300,5);
		setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		setVisible(true);
		
	}	
	
	public void actionPerformed(ActionEvent e) {
		String formno= ""+ random;    //concat with "" to convert num to string
		String fname=fnameJTextField.getText();  //to extract text
		String mname=mnameJTextField.getText();
		String lname=lnameJTextField.getText();
		String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
		
		String gender=null;
		if(male.isSelected()) {
			gender = "Male";
		}else if(female.isSelected()) {
			gender = "Female";
		}else if(other.isSelected()){
			gender="Other";
		}
		
		String email = emailJTextField.getText();
		String marital=null;
		if(married.isSelected()) {
			marital="Married";
		}else if(unmarried.isSelected()) {
			marital="Unmarried";
		}else if(other.isSelected()) {
			marital="Other";
		}
		
		String addr=addrJTextField.getText();
		String state=stateJTextField.getText();
		String pin=pinJTextField.getText();
		
		
		try {
			//validations
			if(fname.equals("")) {
				JOptionPane.showMessageDialog(null, "First name is required !");
			}
			//if(gender.equals("")) {
			//	JOptionPane.showMessageDialog(null, "Select your gender !");
			//}
			else if(lname.equals("")) {
				JOptionPane.showMessageDialog(null, "Surname is required !");
			}
			else if(dob.equals("")) {
				JOptionPane.showMessageDialog(null, "DOB is required !");
			}
			else if(email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is required !");
			}
			else if(pin.equals("")) {
				JOptionPane.showMessageDialog(null, "pincode is required !");
			}
			else {
				
				Connec c=new Connec();		//Connec class instantianization
				
				//"String'"+variable+"'String".......to concat var as a string
				String query="insert into signup values('"+formno+"' , '"+fname+"' , '"+mname+"' , '"+lname+"' , '"+dob+"' , '"+gender+"' , '"+marital+"' ,'"+email+"' ,  '"+addr+"' , '"+pin+"' , '"+state+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignUpTwo(formno).setVisible(true);  //make visible to signuptwo page after click next
			
				
			}
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

	
	public static void main(String[] args) {
		new SignUpOne();
	}

}
