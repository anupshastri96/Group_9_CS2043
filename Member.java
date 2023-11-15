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
}
