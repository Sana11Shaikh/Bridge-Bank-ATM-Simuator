package bankMgmtSystem;
import java.sql.*;

public class Connec {
	Connection c;
	Statement s;
	public Connec() {
		try {
			//Class.forName(com.mysql.cj.jdbc.Driver); //optional with JDBC 4+
			
			//Connection c=new DriverManager.getConnection(url | username | password);
			Connection c=DriverManager.getConnection("jdbc:mysql:///bankmgmtsystem","root", "Shaikh@123");
			
			s = c.createStatement();
			
            //System.out.println(" Database connected successfully!");
        
		}
		catch(SQLException e) {
			e.printStackTrace();			
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	/*// Main method to test
    public static void main(String[] args) {
        new Connec();  // Just creating object will test the connection
    }*/
	
	
}
