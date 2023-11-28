/**	This class represents a Book
	@author Ben Mozgovoi 3742139
*/
import java.util.HashMap;
//import com.mysql.jdbc.Statement;
import java.sql.*;
public class Book{

    private static int ID = 100;

    private final int bookID;

    private String authorFName;

    private String authorLName;

    private String genre;

    private int quantity;

    private String quality;

    private float rating;

    private int releaseYear;

    private String publisherOrStudio;

    private String illustrator;

    private String title;

    public Book(String authorFNameIn, String authorLNameIn, String genreIn, int quantityIn, String qualityIn, float ratingIn, int releaseYearIn, String publisherOrStudioIn, String illustartorIn, String titleIn){
        bookID = ID;
        ID++;
        authorFName = authorFNameIn;
        authorLName = authorLNameIn;
        genre = genreIn;
        quantity = quantityIn;
        quality = qualityIn;
        rating = ratingIn;
        releaseYear = releaseYearIn;
        publisherOrStudio = publisherOrStudioIn;
        illustrator = illustartorIn;
        title = titleIn;

    }
	public static void getAll()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * FROM books");	
         	System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-11s | %-6s | %-12s | %-26s | %-25s\n","ID","Title","Last Name","First Name","Genre","Quantity","Quality","Rating","ReleaseYear","Publisher/Studio","Illustrator");
         
         while (rs.next()) {
            int id = rs.getInt("bookID");
            String title = rs.getString("title");
            String lName = rs.getString("authorLastName");
            String fName = rs.getString("authorFirstName");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-11s | %-6s | %-12s | %-26s | %-25s\n",id, title, lName, fName, gen, quan, qual, rat, relY, pubS, ill);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void genreSort()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * FROM books order by genre");	
         	System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n","ID","Title","Last Name","First Name","Genre","Quantity","Quality","Rating","ReleaseYear","Publisher/Studio","Illustrator");
         
         while (rs.next()) {
            int id = rs.getInt("bookID");
            String title = rs.getString("title");
            String lName = rs.getString("authorLastName");
            String fName = rs.getString("authorFirstName");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n",id, title, lName, fName, gen, quan, qual, rat, relY, pubS, ill);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void titleSort()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * FROM books order by title");	
         	System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n","ID","Title","Last Name","First Name","Genre","Quantity","Quality","Rating","ReleaseYear","Publisher/Studio","Illustrator");
         
         while (rs.next()) {
            int id = rs.getInt("bookID");
            String title = rs.getString("title");
            String lName = rs.getString("authorLastName");
            String fName = rs.getString("authorFirstName");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n",id, title, lName, fName, gen, quan, qual, rat, relY, pubS, ill);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void yearSort()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * FROM books order by releaseYear");
         	System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n","ID","Title","Last Name","First Name","Genre","Quantity","Quality","Rating","ReleaseYear","Publisher/Studio","Illustrator");
         
         while (rs.next()) {
            int id = rs.getInt("bookID");
            String title = rs.getString("title");
            String lName = rs.getString("authorLastName");
            String fName = rs.getString("authorFirstName");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n",id, title, lName, fName, gen, quan, qual, rat, relY, pubS, ill);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
	public static void rateSort()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * FROM books order by rating");	
         	System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n","ID","Title","Last Name","First Name","Genre","Quantity","Quality","Rating","ReleaseYear","Publisher/Studio","Illustrator");
         
         while (rs.next()) {
            int id = rs.getInt("bookID");
            String title = rs.getString("title");
            String lName = rs.getString("authorLastName");
            String fName = rs.getString("authorFirstName");
            String gen = rs.getString("genre");
            int quan = rs.getInt("quantity");
            String qual = rs.getString("quality");
            float rat = rs.getFloat("rating");
            int relY = rs.getInt("releaseYear");
            String pubS = rs.getString("publisherStudio");
            String ill = rs.getString("illustrator");
            System.out.printf("%-4s | %-35s | %-15s | %-15s | %-25s | %-8s | %-25s | %-6s | %-10s | %-26s | %-25s\n",id, title, lName, fName, gen, quan, qual, rat, relY, pubS, ill);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
    public int getID(){
        return ID;
    }

    public String getAuthorFName(){
        return authorFName;
    }

    public String getAuthorLName(){
        return authorLName;
    }

    public String getGenre(){
        return genre;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getQuality(){
        return quality;
    }

    public float getRating(){
        return rating;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public String getPublisherOrStudio(){
        return publisherOrStudio;
    }

    public String getIllustarator(){
        return illustrator;
    }

    public String getTitle(){
        return title;
    }
    public void getDetails()
	{
		System.out.println("Title: "+title+"\nCreator: "+authorFName+" "+authorLName+"\nGenre: "+genre+"\nYear of Release: "+releaseYear+"\nRating: "+rating+"\nPublisher/Studio: "+publisherOrStudio+"\nItem Quality: "+quality+"\nIllustrator: "+illustrator+"\nQuantity: "+quantity+"\nQuality: "+quality+"\nID: "+bookID+"\n");
	}

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPublisherOrStudio(String publisherOrStudio) {
        this.publisherOrStudio = publisherOrStudio;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
