java.util.Arrays
public class Library{
    Book[] bStock;
    NonBook[] nbStock;
    Member[] member;
    int LibID;
    RoomBookings[] AvailableBookings;
    RoomBookings[] Booked;
    int bookCounter;
    int nonBookCounter;
    int memberCounter;
    public Library(){
        bStock = new Book[1000];
        bookCounter =0;
        nbStock = new NonBook[250];
        nonBookCounter = 0;
        member = new Member[100];
        memberCounter =0;
        LibID = 100;
        AvailableBookings = new RoomBookings[15];
        Booked = new RoomBookings[15];
    }
    
    public boolean removeBook(Book book1){
        boolean success = false;
        for(int i=0; i< bookCounter && !success; i++){
            if(bStock[i]== book1){
                bookCounter--;
                //bStock[i] = bStock[bookCounter];
                bStock[bookCounter] = null;
                success = true;
            } 
                
        }
    }
    
    public boolean addBook(Book book1){
        boolean success = false;
        if(bookCounter < bStock.length){
            bStock[bookCounter] = book1;
            bookCounter++;
            success = true;
        }
    }
    
    public boolean addNonBook(NonBook nbook1){
        boolean success = false;
        if(nonBookCounter < nbStock.length){
            nbStock[nonBookCounter] = nbook1;
            nonBookCounter++;
            success = true;
        }
    }
    public boolean removeNonBook(NonBook nbook1){
        boolean success = false;
        for(int i=0; i< nonBookCounter && !success; i++){
            if(nbStock[i]== nbook1){
                nonBookCounter--;
                //bStock[i] = bStock[bookCounter];
                nbStock[nonBookCounter] = null;
                success = true;
            } 
                
        }
    }
    
    public void firstNameSort(SomeType[] array)
	{	SomeType temp;
		
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++)
		{	// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++)
				if (array[i].getAuthorFName() > array[i+1].getAuthorFName())
				{	// Swap array[i] with array[i+1]
					temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
				} // end if
		} // end outer for loop
  	} // end bubbleSort()
  	
  	public void lastNameSort(SomeType[] array)
	{	SomeType temp;
		
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++)
		{	// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++)
				if (array[i].getAuthorLName().compareTo(array[i+1].getAuthorLName()) > 0)
				{	// Swap array[i] with array[i+1]
					temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
				} // end if
		} // end outer for loop
  	} // end bubbleSort()
  	
  	public void titleSort(SomeType[] array)
	{	SomeType temp;
		
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++)
		{	// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++)
				if (array[i].getTitle().compareTo(array[i+1].getTitle()) > 0)
				{	// Swap array[i] with array[i+1]
					temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
				} // end if
		} // end outer for loop
  	} // end bubbleSort()
  	
    public void genreSort(SomeType[] array)
	{	SomeType temp;
		
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++)
		{	// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++)
				if (array[i].getGenre().compareTo(array[i+1].getGenre()) > 0)
				{	// Swap array[i] with array[i+1]
					temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
				} // end if
		} // end outer for loop
  	} // end bubbleSort()
  	
}
