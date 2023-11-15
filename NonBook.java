public class NonBook 
{
	String itemType;
	String creator;
	String genre;
	int quantity;
	int quality;
	String title;
	float rating;
	int releaseYear;
	String pubOrStud;
	String illust;
	static int IDTrack = 100;
	final int NBID;
	//constructor
	public NonBook(String iType, String cre, String gen, int quan, int qual, String tit, float rat, int relYr, String pubStud, String ill)
	{
		itemType = iType;
		creator = cre;
		genre = gen;
		quantity = quan;
		quality = qual;
		title = tit;
		rating = rat;
		releaseYear = relYr;
		pubOrStud = pubStud;
		illust = ill;
		NBID = IDTrack;
		IDTrack++;
	}
	//getters
	public String getType()
	{
		return itemType;
	}
	public String getCreator()
	{
		return creator;
	}
	public String getGenre()
	{
		return genre;
	}
	public int getQuant()
	{
		return quantity;
	}
	public int getQual()
	{
		return quality;
	}
	public String getTitle()
	{
		return title;
	}
	public int getRelYr()
	{
		return releaseYear;
	}
	public String getPubStud()
	{
		return pubOrStud;
	}
	public String getIll()
	{
		return illust;
	}
	public int getID()
	{
		return NBID;
	}
	public void getDetails()
	{
		System.out.println("Item Type: "+itemType+"\nTitle: "+title+"\nCreator: "+creator+"\nGenre: "+genre+"\nYear of Release: "+releaseYear+"\nRating: "+rating+"\nPublisher/Studio: "+pubOrStud+"\nItem Quality: "+quality+"\nIllustrator: "+illust+"\nQuantity: "+quantity+"\nQuality: "+quality+"\nID: "+NBID+"\n");
	}
	//setters
	public void setType(String newType)
	{
		itemType = newType;
	}
	public void setCreator(String newCreator)
	{
		creator = newCreator;
	}
	public void setGenre(String newGenre)
	{
		genre = newGenre;
	}
	public void setQuant(int newQuant)
	{
		quantity = newQuant;
	}
	public void setQual(int newQual)
	{
		quality = newQual;
	}
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	public void setRelYr(int newRelYr)
	{
		releaseYear = newRelYr;
	}
	public void setPubStud(String newPubStud)
	{
		pubOrStud = newPubStud;
	}
	public void setIllust(String newIllust)
	{
		illust = newIllust;
	}
}

