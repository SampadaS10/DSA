package example.likedList;

public class MyCircularDoublyLinkedList 
{
	Song start,ptr;
	boolean found;
	
	void addSong(Song newSong)
	{
		if(start==null)
		{
			System.out.println("List is Empty..Adding first song..");
			start=newSong;
			start.prev=null;
			start.next=null;
		}
		else if(start.next==null)
		{
			start.next=newSong;
			start.prev=newSong;
			newSong.prev=start;
			newSong.next=start;
			System.out.println("Adding second song..");
		}
		else
		{
			ptr=start.next;
			while(ptr.next!=start)
			{
				ptr=ptr.next;
			}
			ptr.next=newSong;
			start.prev=newSong;
			newSong.prev=ptr;
			newSong.next=start;
			System.out.println("Adding other songs..");
			
		}
	}
	
	void showSongs()
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			ptr=start;
			do
			{
				System.out.println("\n Data: "+ptr);
				ptr=ptr.next;
			}
			while(ptr!=start);
		}
	}
	
	void searchSong(Song s)
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			ptr=start;
			do
			{
				if(ptr==s)
				{
				System.out.println("\n Song Found: "+ptr);
				
				}
				ptr=ptr.next;
			}
			while(ptr!=start);
		}
	}
	
	void deleteSong(Song s)
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			ptr=start;
			do
			{
				if(ptr==s)
				{
				System.out.println("\nSong Found.. deleting... ");
				ptr.prev.next=ptr.next;
				ptr.next.prev=ptr.prev;
				ptr.prev=null;
				ptr.next=null;
				System.out.println("Song deleted....");
				break;
				}
				ptr=ptr.next;
			}
			while(ptr!=start);
		}
	}
}
