public class Member {
    private String name;
    private OutBook[] booksout;
    private NonBook[] otherRental;
    private String email;
    private double amtOwed;

    public Member(String name, OutBook[] booksout, NonBook[] otherRental, String email, double amtOwed) {
        this.name = name;
        this.booksout = booksout;
        this.otherRental = otherRental;
        this.email = email;
        this.amtOwed = amtOwed;
    }

    // Getters and Setters
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
        public void getDetails()
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
	}
}
