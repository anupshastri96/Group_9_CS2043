/**	This class represents a Book
	@author Ben Mozgovoi 3742139
*/
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