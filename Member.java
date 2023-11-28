import java.util.HashMap;
import java.sql.*;
public class Member {
    private static int ID =100;
    private final int memberID;
    private String name;
    private OutBook[] booksout;
    private NonBook[] otherRental;
    private String email;
    private double amtOwed;
	
	public static void getAll()
	{
	try
		{
		String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
		Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
		Statement stmt = connector.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT * FROM members");	
         	System.out.printf("%-4s | %-30s | %-11s | %-11s | %-30s | %-8s\n","ID","Name","Books Out","Other Rentals","Email","Ammount Due");
         
         while (rs.next()) {
            int id = rs.getInt("memberID");
            String n = rs.getString("name");
            int bOut = rs.getInt("booksOut");
            int oRen = rs.getInt("otherRental");
            String em = rs.getString("email");
            double quan = rs.getDouble("amountOwed");
            System.out.printf("%-4s | %-30s | %-11s | %-13s | %-30s | %-8s\n",id, n, bOut, oRen, em, quan);
            	}
	        connector.close();
      		}
      catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
	}
    public Member(String name, OutBook[] booksout, NonBook[] otherRental, String email, double amtOwed) {
        memberID = ID;
        ID++;
        this.name = name;
        this.booksout = booksout;
        this.otherRental = otherRental;
        this.email = email;
        this.amtOwed = amtOwed;
    }

    // Getters and Setters
    public int getID(){
        return ID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OutBook[] getBooksout() {
        return booksout;
    }

    public void setBooksout(OutBook[] booksout) {
        this.booksout = booksout;
    }

    public NonBook[] getOtherRental() {
        return otherRental;
    }

    public void setOtherRental(NonBook[] otherRental) {
        this.otherRental = otherRental;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmtOwed() {
        return amtOwed;
    }

    public void setAmtOwed(double amtOwed) {
        this.amtOwed = amtOwed;
    }
       /* public void getDetails()
	{
		System.out.println("Name: "+name+"\nEmail: "+email+"\nAmount Owed: $"+amtOwed);
		if(booksout.length > 0)
		{
			for(int i = 0; i < booksout.length; i++)
			{
				System.out.println("Book "+(i+1)+": "+booksout[i].getTitle());
			}
		}
		if(otherRental.length > 0)
		{
			for(int i = 0; i < otherRental.length; i++)
			{
				System.out.println("Item "+(i+1)+": "+otherRental[i].getTitle());
			}
		}
	} */
}
