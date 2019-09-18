package practise.Dao;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class LoginDao {
	String url="jdbc:mysql://localhost:3306/admin";
     String user="root";
     String password1="";
     String sql="select * from admin where username=? and password=?";
   public boolean check(String Uname,String pass) {
	   try {
		  
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con=DriverManager.getConnection(url,user,password1);
	      PreparedStatement stmt=con.prepareStatement(sql);
	      stmt.setString(1,Uname);
	      stmt.setString(2,pass);
	      ResultSet rs=stmt.executeQuery();
	      if(rs.next()) {
	    	  return true;
	      }
	   }catch(Exception e) {
		   e.printStackTrace();
		   
	   } 
	  
	   return false;
	   
   }
}
