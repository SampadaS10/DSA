package example.likedList;

public class Song 
{
	String Title;
	String Album;
	String Artist;
	int Year;
	
	Song prev;
	Song next;
	
	public Song(String title, String album, String artist, int year) 
	{
		
		Title = title;
		Album = album;
		Artist = artist;
		this.Year = year;
	}

	@Override
	public String toString() {
		return "Song [Title=" + Title + ", Album=" + Album + ", Artist=" + Artist + ", Year=" + Year + "]";
	}
	
	
	
}
