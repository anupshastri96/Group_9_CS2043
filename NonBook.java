import java.util.HashMap;
//import com.mysql.jdbc.Statement;
import java.sql.*;
/*
 * setenv CLASSPATH .:/usr/share/java/mysql-connector-java.jar
 */
public class NonBook 
{
	//getters
	public static void getRating(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT rating from non_books where nonBookID = "+ID);
         	
         	System.out.print("Rating: ");
         while(rs.next())
         {
            float rat = rs.getFloat("rating");
            System.out.println(rat);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getType(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT itemType from non_books where nonBookID = "+ID);
         	
         	System.out.print("ItemType: ");
         while(rs.next())
         {
            String IT = rs.getString("itemType");
            System.out.println(IT);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getCreator(int ID)
	{
		try {
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			Statement stmt = connector.createStatement();
		 	ResultSet rs = stmt.executeQuery("SELECT creator from non_books where nonBookID = "+ID);
		 	
		 	System.out.print("Creator: ");
		 while(rs.next())
		 {
		    String cre = rs.getString("creator");
		    System.out.println(cre);
		    }
			connector.close();
	      		}
	      catch(SQLException e)
			{
				System.out.println("Database Error: "+e.getMessage());
			}
	}
	public static void getGenre(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT genre from non_books where nonBookID = "+ID);
         	
         	System.out.print("Genre: ");
         while(rs.next())
         {
            String gen = rs.getString("genre");
            System.out.println(gen);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getQuant(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT quantity from non_books where nonBookID = "+ID);
         	
         	System.out.print("Quantity: ");
         while(rs.next())
         {
            int quan = rs.getInt("quantity");
            System.out.println(quan);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getQual(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT quality from non_books where nonBookID = "+ID);
         	
         	System.out.print("Quality: ");
         while(rs.next())
         {
            String qual = rs.getString("quality");
            System.out.println(qual);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getTitle(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT title from non_books where nonBookID = "+ID);
         	
         	System.out.print("Title: ");
         while(rs.next())
         {
            String title = rs.getString("title");
            System.out.println(title);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getRelYr(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT releaseYear from non_books where nonBookID = "+ID);
         	
         	System.out.print("Release Year: ");
         while(rs.next())
         {
            int relYr = rs.getInt("releaseYear");
            System.out.println(relYr);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getPubStud(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT publisherStudio from non_books where nonBookID = "+ID);
         	
         	System.out.print("Publisher/Studio: ");
         while(rs.next())
         {
            String PS = rs.getString("publisherStudio");
            System.out.println(PS);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getIll(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT illustrator from non_books where nonBookID = "+ID);
         	
         	System.out.print("Illustrator: ");
         while(rs.next())
         {
            String ill = rs.getString("illustrator");
            System.out.println(ill);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getNonBook(int ID)
	{
		try {
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * from non_books where nonBookID = "+ID);
         	
         	System.out.println("ID  Title  ItemType  Creator  Genre  Quantity  Quality  Rating  ReleaseYear  Publisher/Studio  Illustrator");
         while(rs.next())
         {
         	int id = rs.getInt("nonBookID");
            String title = rs.getString("title");
            String IT = rs.getString("itemType");
            String cre = rs.getString("creator");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.println(id+",  "+title+",  "+IT+",  "+cre+",  "+gen+",  "+quan+",  "+qual+",  "+rat+",  "+relY+",  "+pubS+",  "+ill);
            }
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void getAll()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM non_books");
         System.out.println("ID  Title  ItemType  Creator  Genre  Quantity  Quality  Rating  ReleaseYear  Publisher/Studio  Illustrator");
         
         while (rs.next()) {
            int id = rs.getInt("nonBookID");
            String title = rs.getString("title");
            String IT = rs.getString("itemType");
            String cre = rs.getString("creator");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.println(id+",  "+title+",  "+IT+",  "+cre+",  "+gen+",  "+quan+",  "+qual+",  "+rat+",  "+relY+",  "+pubS+",  "+ill);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	//setters
	public static void setType(String newType, int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set itemType = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setString(1, newType);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setCreator(String newCreator, int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set creator = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setString(1, newCreator);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setGenre(String newGenre, int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set genre = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setString(1, newGenre);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setQuant(int newQuant,  int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set quantity = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setInt(1, newQuant);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setQual(int newQual,  int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set quality = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setInt(1, newQual);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setTitle(String newTitle,  int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set title = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setString(1, newTitle);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setRelYr(int newRelYr,  int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set releaseYear = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setInt(1, newRelYr);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setPubStud(String newPubStud,  int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set publisherStudio = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setString(1, newPubStud);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void setIllust(String newIllust,  int ID)
	{
		try
		{
			String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			String query = "update non_books set  illustrator = ? where nonBookID = ?";
			PreparedStatement prepSt = connector.prepareStatement(query);
        		prepSt.setString(1, newIllust);
			prepSt.setInt(2, ID);
			prepSt.executeUpdate();
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
}

