package example.likedList;

public class MyDoublyLinkedList 
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
			newSong.prev=start;
			newSong.next=null;
			System.out.println("Adding second song..");
		}
		else
		{
			ptr=start.next;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newSong;
			newSong.prev=ptr;
			newSong.next=null;
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
			while(ptr!=null)
			{
				System.out.println("\n Data: "+ptr);
				ptr=ptr.next;
			}
		}
	}
	
	void showSongsInReverse()
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			
		System.out.println("Printing in reverse...");
		ptr=start;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		while(ptr!=null)
		{
			System.out.println("\n Data: "+ptr);
			ptr=ptr.prev;
		}
			
		}
	}
	
	void searchSong(Song s)
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			ptr=start;
			while(ptr!=null)
			{
				if(ptr==s)
				{
				System.out.println("\n Song Found: "+ptr);
				
				}
				ptr=ptr.next;
			}
		}
	}
	
	void deleteSong(Song s)
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			ptr=start;
			while(ptr!=null)
			{
				if(ptr==s)
				{
				System.out.println("\nSong Found.. deleting... ");
				ptr.prev.next=ptr.next;
				ptr.next.prev=ptr.prev;
				ptr.prev=null;
				ptr.next=null;
				System.out.println("Song deleted....");
				}
				ptr=ptr.next;
			}
		}
	}
	
	
	void deleteFirstSong()
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			start=start.next;
			start.prev=null;
			System.out.println("First song deleted...");
		}
	}
	
	void deleteLastSong()
	{
		if(start==null)
			System.out.println("List is empty..");
		else
		{
			ptr=start;
			while(ptr!=null)
			{
				if(ptr.next==null)
				{
					ptr.prev.next=null;
					System.out.println("Last Song deleted....");
				}
				ptr=ptr.next;
			}
		}
	}
	
	
	void insertSong(Song songbeforeinsert ,Song songToInsert )
	{
		found=false;
		if(start==null)
			System.out.println("List is empty..");
		else if(start==songbeforeinsert)
		{
			System.out.println("List is Empty..Adding first song..");
			songToInsert.prev=null;
			songToInsert.next=start;
			start=songToInsert;		
		}
		else
		{
			ptr=start;
			while(ptr!=null)
			{
				if(ptr==songbeforeinsert)
				{
					found=true;
				}
				ptr=ptr.next;
			}
			if(found=true)
			{
				songbeforeinsert.prev.next=songToInsert;
				songToInsert.prev=songbeforeinsert.prev;
				songbeforeinsert.prev=songToInsert;
				songToInsert.next=songbeforeinsert;
				System.out.println("Inserted Successfully....");
			}
		}
	}
	
	
	
	
	
	
	
	

}
