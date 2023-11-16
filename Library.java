public class Library{
    public Book[] bStock;
    public NonBook[] nbStock;
    public Member[] member;
    public int LibID;
    public RoomBookings[] AvailableBookings;
    public RoomBookings[] Booked;
    public int bookCounter;
    public int nonBookCounter;
    public int memberCounter;
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
        return success;
    }
    
    public boolean addBook(Book book1){
        boolean success = false;
        if(bookCounter < bStock.length){
            bStock[bookCounter] = book1;
            bookCounter++;
            success = true;
        }
        return success;
    }
    
    public boolean addNonBook(NonBook nbook1){
        boolean success = false;
        if(nonBookCounter < nbStock.length){
            nbStock[nonBookCounter] = nbook1;
            nonBookCounter++;
            success = true;
        }
        return success;
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
        return success;
    }

    
    public void firstNameSort(Book[] array)
	{	Book temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getAuthorFName().charAt(0);
			    c2 = array[i+1].getAuthorFName().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getAuthorFName().charAt(j);
			            c2 = array[j+1].getAuthorFName().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	} // end bubbleSort()
  	
  	public void lastNameSort(Book[] array)
	{	Book temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getAuthorLName().charAt(0);
			    c2 = array[i+1].getAuthorLName().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getAuthorLName().charAt(j);
			            c2 = array[j+1].getAuthorLName().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	}
  	
  	public void titleSort(Book[] array)
	{	Book temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getTitle().charAt(0);
			    c2 = array[i+1].getTitle().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getTitle().charAt(j);
			            c2 = array[j+1].getTitle().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	}
  	
    public void genreSort(Book[] array)
	{	Book temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getGenre().charAt(0);
			    c2 = array[i+1].getGenre().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getGenre().charAt(j);
			            c2 = array[j+1].getGenre().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	}
  	public void creatorSort(NonBook[] array)
	{	NonBook temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getCreator().charAt(0);
			    c2 = array[i+1].getCreator().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getCreator().charAt(j);
			            c2 = array[j+1].getCreator().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	} // end bubbleSort()
  	
  	
  	
  	public void titleSort(NonBook[] array)
	{	NonBook temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getTitle().charAt(0);
			    c2 = array[i+1].getTitle().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getTitle().charAt(j);
			            c2 = array[j+1].getTitle().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	}
  	
    public void genreSort(NonBook[] array)
	{	NonBook temp;
		char c1;
		char c2;
		boolean success =false;
		// The value of pass goes from 1 to N-1
		for (int pass=1; pass<array.length; pass++){
			// Compare a series of adjacent pairs
			for (int i=0; i<array.length-pass; i++){
			    c1 = array[i].getGenre().charAt(0);
			    c2 = array[i+1].getGenre().charAt(0);
			    if(c1 > c2){
			        temp       = array[i];
					array[i]   = array[i+1];
					array[i+1] = temp;
			    }
			    if(c1 == c2){
			        for(int j=1; j< array.length && !success; j++){
			            c1 = array[j].getGenre().charAt(j);
			            c2 = array[j+1].getGenre().charAt(j);
			            if(c1 > c2){
			                temp       = array[j];
					        array[j]   = array[j+1];
					        array[j+1] = temp;
					        success = true;
			            }
			        }
			    }
		    } // end outer for loop
  	    }
  	}
}
