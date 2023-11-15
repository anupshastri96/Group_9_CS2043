/**	This class represents a book that is borrowed
	@author Ben Mozgovoi 3742139
*/
public class OutBook extends Book{

    int daysOut;

    public OutBook(String authorFNameIn, String authorLNameIn, String genreIn, int quantityIn, String qualityIn, float ratingIn, int releaseYearIn, String publisherOrStudioIn, String illustartorIn, String titleIn, int daysOutIn){
        super(authorFNameIn, authorLNameIn, genreIn, quantityIn, qualityIn, ratingIn, releaseYearIn, publisherOrStudioIn, illustartorIn, titleIn);
        daysOut = daysOutIn;
    }
}
