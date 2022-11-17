package example.likedList;

public class CircularDoublyLinkedListTest 
{
	public static void main(String[] args) 
	{
		Song s1=new Song("Zhingat","Sairat","Ajay Atul",2016);
		Song s2=new Song("Mere Dholna","BhulBhulaiya","Shreya Ghoshal",2018);
		Song s3=new Song("Aaoge Jab Tum","Jab We Met","Rashid Khan",2007);
		Song s4=new Song("My Heart Will Go On","Titanic","Celine D",1997);
		Song s5=new Song("Bin Tere","I hate love storys","Vishal-Shekhar",2002);
		
		MyCircularDoublyLinkedList myList= new MyCircularDoublyLinkedList();
		
		myList.addSong(s1);
		myList.addSong(s2);
		myList.addSong(s3);
		myList.addSong(s4);
		myList.addSong(s5);
		
		myList.showSongs();
		myList.searchSong(s3);
		myList.deleteSong(s5);
		myList.showSongs();
	}
}
