import java.sql.*;
public class tester {

	public static void main(String[] args) {
	
	//NonBook Test
    try
		{
		//'sql5664279@gc127m13.cs.unb.ca'
			//"sql5664279.cs.unb.ca"
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set quantity = quantity +1 where nonBookID = ?;";
		    PreparedStatement prepSt = connector.prepareStatement(query);
            prepSt.setInt(1, 1);
            int affectedRows = prepSt.executeUpdate();
            if (affectedRows == 0)
                System.out.println("Check in failed");
            else
                System.out.println("Check in succeeded");

            
            connector.close();
		}
		catch(SQLException e)
        {   System.out.println("Database error" + e.getMessage());
        }
		
	}

}
