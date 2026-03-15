  package jdbc;
  
  import java.sql.*;

public class Main {
	
	private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
	
	private static final String username = "root";
	
	private static final String password = "TanyaGupta123!";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			  Statement statement = connection.createStatement();
			  
			  //String query = String.format("INSERT INTO students(name, age ,marks) VALUES('%s', %o, %f)", "Rahul", 23, 74.5 );
			  
			  //String query = String.format("UPDATE students SET marks =%f WHERE id = %d", 89.5, 2);
			  
			  String query = String.format("DELETE FROM students WHERE id = %d", 2);
			  int rowsAffected = statement.executeUpdate(query);
			   if (rowsAffected > 0) {
				   System.out.println("Datas  inserted successfully");	   
				   }
			   else {
				   System.out.println("Data not inserted");
			   }
			  /*String query = "select * from students";
			  ResultSet resultSet = statement.executeQuery(query);
			  while(resultSet.next()) {
				  int id = resultSet.getInt("id");
				  String name = resultSet.getString("name");
				  Double marks = resultSet.getDouble("marks");
				  System.out.println("id :"+id);
				  System.out.println("Name :"+name);
				  System.out.println("Marks: "+marks);*/
				  
			  
			   
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
