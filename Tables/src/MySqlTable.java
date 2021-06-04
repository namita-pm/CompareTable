import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.testng.IDynamicGraph.Status;
import org.testng.asserts.SoftAssert;

public class MySqlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int studentMarks[][];
		//studentMarks = new int[3][3];
		
		//studentMarks[0][0] = 20;
		//studentMarks[0][1] = 30;
		//studentMarks[0][2] = 40;
		
				
		
		Connection con = null;
		try {

			// Load the MySQL JDBC driver

			String driverName = "com.mysql.cj.jdbc.Driver";

			Class.forName(driverName);

			// Create a connection to the database

			String serverName = "localhost";

			String schema = "namitadb";

			String url = "jdbc:mysql://" + serverName + "/" + schema;

			String username = "root";

			String password = "Neel#12345";

			con = DriverManager.getConnection(url, username, password);
			PreparedStatement preparedStatement = con.prepareStatement("select * from employee");
			// Creating Java ResultSet object
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet.toString());
			
			ArrayList TB1EmpName = new ArrayList();
			ArrayList TB1EmpAge = new ArrayList();
			
			while (resultSet.next()) {
				
				TB1EmpName.add(resultSet.getString("EmpName").trim());
				TB1EmpAge.add(resultSet.getString("EmpAge").trim());
				//String  = resultSet.getString("EmpID");
				//String EmpName = resultSet.getString("EmpName");
				//String EmpAge = resultSet.getString("EmpAge");
				// Printing Results
				System.out.println(TB1EmpName + " " + TB1EmpAge);
				// System.out.println(Arrays.deepToString(resultSet));
			}

			
			 Statement stmt = con.createStatement(); ResultSet
			 SecondresultSet=stmt.executeQuery("select *  from salary");
			 ArrayList TB2EmpName = new ArrayList();
			ArrayList TB2EmpAge = new ArrayList();
			 while(SecondresultSet.next()){ 
				 TB2EmpName.add(SecondresultSet.getString("EmpName").trim());
				TB2EmpAge.add(SecondresultSet.getString("EmpAge").trim());
				 
			 System.out.println(TB2EmpName+" "+TB2EmpAge); 
			 }
			 
			 List<String> sourceListEmpAge = new ArrayList<String>(TB1EmpAge);
			List<String> destinationListEmpAge = new ArrayList<String>(TB2EmpAge);
//			if (sourceListEmpAge.size() != 0) {
//				softAssertion.fail("Records Present in  Mongo DB but not in Noble: " + sourceListEmpAge.size()+"\n MongoDB Account No Values:"+ sourceListEmpAge);
//
//				softAssertion.assertEquals(TB2EmpAge, TB1EmpAge);
//				System.out.println("INSIDE IF");
//				
//				
//			} else {
				//System.out.println("INSIDE ELSE");
				for(int x=0;x<TB1EmpAge.size();x++) {

					if(!(TB1EmpAge.get(x)).equals(TB2EmpAge.get(x))) {

						//softAssertion.assertEquals(TB2EmpAge.get(x),TB1EmpAge.get(x),"For EmpAge Column "+String.format("EmpAge is %s :",TB1EmpAge.get(x)));
						System.out.println("INSIDE FOR"+" "+x+" "+TB2EmpAge.get(x)+" "+TB1EmpAge.get(x));
					}
				}
			//}
			 
			System.out.println("Successfully Connected to the database!");

		} catch (ClassNotFoundException e) {

			System.out.println("Could not find the database driver " + e.getMessage());
		} catch (SQLException e) {

			System.out.println("Could not connect to the database " + e.getMessage());
		}

	}
}
