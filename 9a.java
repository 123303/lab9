package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//creating connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", 
					"newuser-1" , "root1234");
			//creating statement
			Statement myStmt = myConn.createStatement();
			//execute query
		ResultSet myRs = myStmt.executeQuery("select * from Hotel.hotel");
	while (myRs.next()) {
		System.out.println(myRs.getString("HOTEL_NAME")+" : "+myRs.getString("PHONE_NO"));
	}
	myConn.close();
		}
	catch (Exception exc) {
		exc.printStackTrace();
	}
	}
}
