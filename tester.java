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
			String query = "update non_books set quantity = ? where nonBookID = ?";
			//System.out.println(query);
			PreparedStatement prepSt = connector.prepareStatement(query);
			prepSt.setInt(1, 1);
			prepSt.setInt(2, 5);
			connector.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database Error: "+e.getMessage());
		}
		/*NonBook nb1 = new NonBook("Movie", "George Lucas", "Sci-fi", 1, 5, "Star Wars", 5, 1977, "LucasFilm", null);
	nb1.getDetails();
	NonBook nb2 = new NonBook("Movie", "George Lucas", "Adventure", 1, 5, "Indiana Jones", 5, 1981, "LucasFilm", null);
	nb2.getDetails();
	nb1.setTitle("A New Hope");
	nb1.getDetails(); */
/*
	//Book Tests
	Book b1 = new Book("J.K", "Rowling", "fantasy", 5, "good", 5,1997, null, null, "Harry Potter");
	b1.getDetails();
	Book b2 = new Book("J.R.R", "Tolkin", "fantasy", 5, "great", 5,1957, null, null, "Fellowship of the Ring");
	b2.getDetails();
	b1.setTitle("The Philosophers Stone");
	b1.getDetails();
	
	//OutBook Tests
	OutBook ob1 = new OutBook("J.K", "Rowling", "fantasy", 5, "good", 5,1997, null, null, "Harry Potter", 10);
	//Member Tests
	OutBook[] m1BOutList = {ob1};
	NonBook[] m1NBOutList = {nb1};
	Member m1 = new Member("Bob", m1BOutList, m1NBOutList, "bob123@gmail.com", 5.99);
	m1.getDetails();
	
	//RoomBooking Test
	RoomBookings rb1 = new RoomBookings(1001, 200, true, false, 404, 60);
	rb1.getDetails();
	
	System.out.println("");
	
	//library Test
	Library lb1 = new Library();
	lb1.addBook(b1);
	lb1.addBook(b2);
	for(int i = 0; i < 2; i++)
	{
		System.out.println(lb1.bStock[i].getTitle());
	}
	//lb1.titleSort(lb1.bStock);
	//for(int i = 0; i < 2; i++)
	//{
	//System.out.println('H');
	//	System.out.println(lb1.bStock[i].getTitle());
	//}
	lb1.addNonBook(nb1);
	lb1.addNonBook(nb2);
	*/
	}

}
