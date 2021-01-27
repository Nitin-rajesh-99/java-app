 

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class dbconnect {
	Connection con=null;
	
	public static Connection java_db(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
			
			return con;
		}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;

		}
	}

}
