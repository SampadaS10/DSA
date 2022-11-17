package example.likedList;

public class DoublyLinkedListTest 
{
	public static void main(String[] args) 
	{
		MyDoublyLinkedList myList= new MyDoublyLinkedList();
		
		Song s1=new Song("Zhingat","Sairat","Ajay Atul",2016);
		Song s2=new Song("Mere Dholna","BhulBhulaiya","Shreya Ghoshal",2018);
		Song s3=new Song("Aaoge Jab Tum","Jab We Met","Rashid Khan",2007);
		Song s4=new Song("My Heart Will Go On","Titanic","Celine D",1997);
		
		//Song s5=new Song("Iktara","Wake Up Sid","Amit Trivedi",2014);
		
		myList.addSong(s1);
		myList.addSong(s2);
		myList.addSong(s3);
		myList.addSong(s4);	
		
		myList.showSongs();
		//myList.deleteFirstSong();
		myList.deleteLastSong();
		System.out.println("---------------------------------");
		myList.showSongs();
		
//		myList.showSongsInReverse();
//		
//		//myList.searchSong(s3);
//		System.out.println("---------------------------------");
//		//myList.deleteSong(s3);
//		//myList.showSongs();
//		
//		//myList.insertSong(s3, s5);
//		//myList.showSongs();
		
	}
}
