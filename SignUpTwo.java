package bankMgmtSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SignUpTwo extends JFrame implements ActionListener{

	JComboBox religion,category,income,education,occupation;
	JTextField panJTextField,aadharJTextField;
	JRadioButton syes,sno,eyes,eno;
	ButtonGroup seniorgroup,existaccgroup;
	JButton next;
	String formno;
	SignUpTwo(String formno)
	{
		this.formno=formno;
		
		setTitle("NEW ACCOUNT APPLICATION FORM PAGE-2");
		
		JLabel additionalDetails= new JLabel("Page 2 : Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,30));
		additionalDetails.setBounds(210,70,400,40);
		add(additionalDetails);
		 
		//religion
		JLabel rel= new JLabel("Religion : ");
		rel.setFont(new Font("Raleway",Font.BOLD,20));
		rel.setBounds(140,150,200,30);
		add(rel); 
		
		String valReligion[] = {"None","Muslim","Hindu","Sikh","Jain","Christian","Other"};
		religion=new JComboBox(valReligion);
		religion.setBounds(300,150,300,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		//category
		JLabel categ= new JLabel("Category : ");
		categ.setFont(new Font("Raleway",Font.BOLD,20));
		categ.setBounds(140,200,200,30);
		add(categ);
		
		String valCategory[] = {"None","General","OBC","SC","NT","ST","Other"};
		category=new JComboBox(valCategory);
		category.setBounds(300,200,300,30);
		category.setBackground(Color.WHITE);
		add(category);
		
		//income
		JLabel inc= new JLabel("Income: ");
		inc.setFont(new Font("Raleway",Font.BOLD,20));
		inc.setBounds(140,250,200,30);
		add(inc);

		String valIncome[] = {"None","<1,00,000","<2,00,000","<3,00,000","<5,00,000","<10,00,000"};
		income=new JComboBox(valIncome);
		income.setBounds(300,250,300,30);
        income.setBackground(Color.WHITE);
		add(income);
		
		
		
		
		//educational-qualification
		JLabel edu= new JLabel("Educational ");
		edu.setFont(new Font("Raleway",Font.BOLD,20));
		edu.setBounds(140,300,200,30);
		add(edu);
		
		JLabel qualify= new JLabel("Qualification : ");
		qualify.setFont(new Font("Raleway",Font.BOLD,20));
		qualify.setBounds(140,325,200,30);
		add(qualify);
		
		String valEducation[] = {"None","SSC","HSC","Graduate","PostGraduate","Doctrate","Other"};
		education=new JComboBox(valEducation);
		education.setBounds(300,325,300,30);
        education.setBackground(Color.WHITE);
		add(education);
		
		
		//occupation
		JLabel occup= new JLabel("Occupation : ");
		occup.setFont(new Font("Raleway",Font.BOLD,20));
		occup.setBounds(140,400,200,30);
		add(occup);
		
		String valOccupation[] = {"None","Student","Salaried","Self-employed","Bussiness","Retired","Other"};
		occupation=new JComboBox(valOccupation);
		occupation.setBounds(300,400,300,30);
        occupation.setBackground(Color.WHITE);
		add(occupation);
		
		
		
		//PAN
		JLabel pan= new JLabel("PAN Number : ");
		pan.setFont(new Font("Raleway",Font.BOLD,20));
		pan.setBounds(140,450,200,30);
		add(pan);
		
		panJTextField=new JTextField(); 
		panJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		panJTextField.setBounds(300,450,300,30);
		add(panJTextField);
		
		
		//aadhar
		JLabel addr= new JLabel("Aadhar Number : ");
		addr.setFont(new Font("Raleway",Font.BOLD,20));
		addr.setBounds(140,500,200,30);
		add(addr);
		
		aadharJTextField=new JTextField(); 
		aadharJTextField.setFont(new Font("Raleway",Font.BOLD,14));
		aadharJTextField.setBounds(300,500,300,30);
		add(aadharJTextField);
		
		
		//senior-citizon
		JLabel state= new JLabel("Senior citizon : ");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(140,550,200,30);
		add(state);
		
		syes=new JRadioButton("Yes");
		syes.setBounds(330,550,70,30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno=new JRadioButton("No");
		sno.setBounds(480,550,70,30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		
		seniorgroup=new ButtonGroup();
		seniorgroup.add(syes);
		seniorgroup.add(sno);
		
		
		
		//Exist-account/not
		JLabel pincode= new JLabel("Existing Account : ");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(140,600,200,30);
		add(pincode);
		
		eyes=new JRadioButton("Yes");
		eyes.setBounds(330,600,70,30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno=new JRadioButton("No");
		eno.setBounds(480,600,70,30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		
		existaccgroup=new ButtonGroup();
		existaccgroup.add(eyes);
		existaccgroup.add(eno);
		
		//Button for next page
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(600,650,100,40);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800,770);
		setLocation(300,5);
		setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		setVisible(true);
		
	}	
	
	public void actionPerformed(ActionEvent e) {
		String sreligion=(String) religion.getSelectedItem();//extract data from  drop-down list
		String scategory=(String) category.getSelectedItem();
		String sincome=(String)income.getSelectedItem();
		String seducation=(String)education.getSelectedItem();
		String soccupation=(String)occupation.getSelectedItem();
		
		String seniorCitizen=null;  //extract data from radioButton
		if(syes.isSelected()) {
			seniorCitizen = "Yes";
		}else if(sno.isSelected()) {
			seniorCitizen= "No";
		}
		
		String existingaccount=null;
		if(eyes.isSelected()) {
			existingaccount="Yes";
		}else if(eno.isSelected()) {
			existingaccount="No";
		}
		
		String span=panJTextField.getText();  //extract data from textfield
		String saadhar=aadharJTextField.getText();
		
		
		try {
			//validations
			
			if(span.equals("")) {
				JOptionPane.showMessageDialog(null, "PanNumber field is required !");
			}
			else if(saadhar.equals("")) {
				JOptionPane.showMessageDialog(null, "AadharNumber field is required !");
			}
			
			else {
				//Connec class object
				Connec c=new Connec();
				
				//"String'"+variable+"'String".......to concat var as a string
				String query="insert into signuptwo values( '"+formno+"' , '"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+seducation+"' , '"+soccupation+"' ,'"+span+"' ,  '"+saadhar+"' , '"+seniorCitizen+"' , '"+existingaccount+"')";
				c.s.executeUpdate(query);   //DML Query
				
				setVisible(false);
				new SignUpThree(formno).setVisible(true);
				
				}
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new SignUpTwo("");
	}

}
