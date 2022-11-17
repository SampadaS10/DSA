package example.likedList;

public class MyLinkedList
{
	Kite start,ptr,prev;
	int size=0;
	void showList() 
	{
		if(start==null) 
		{
			System.out.println("List is empty");
		}
		else 
		{
			System.out.println("List is not empty");
			ptr = start;
			while(ptr!=null) 
			{
				System.out.println("DATA :"+ptr);
				ptr=ptr.next;
			}
			System.out.println("The Count is: "+size);
		}
	}
	
	
	void searchKiteByLength(int lengthToSearch) 
	{
		
		boolean found=false;
		
		if(start==null) 
		{
			System.out.println("List is empty..nothing to search");
		}
		else 
		{
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr.length == lengthToSearch) 
				{
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) 
			{
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	
	void searchKiteByOwner(String ownerToSearch) 
	{
		
		boolean found=false;
		
		if(start==null) 
		{
			System.out.println("List is empty..nothing to search");
		}
		else 
		{
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr.owner == ownerToSearch) 
				{
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) 
			{
				System.out.println("Kite not found... of this length : "+ownerToSearch);
			}
		}
	}
	
	void searchKiteByColor(String colorToSearch) 
	{
		
		boolean found=false;
		
		if(start==null) 
		{
			System.out.println("List is empty..nothing to search");
		}
		else 
		{
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr.owner == colorToSearch) 
				{
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) 
			{
				System.out.println("Kite not found... of this length : "+colorToSearch);
			}
		}
	}
	
	void searchKite(Kite k) 
	{
		
		boolean found=false;
		
		if(start==null) 
		{
			System.out.println("List is empty..nothing to search");
		}
		else 
		{
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr==k) 
				{
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) 
			{
				System.out.println("Kite not found... "+k);
			}
		}
	}
	
	void addAtBegining(Kite newKite) 
	{
		if(start!=null) {
			System.out.println("This kite is added at the beginning of the existing list of kites...");
			newKite.next = start;
			start = newKite;
			size++;
		}
		else 
		{
			System.out.println("You are the first kite..");
			start = newKite;
			size++;
		}
		
	}
	
	void add(Kite newKite) 
	{ 
		if(start==null) 
		{
			System.out.println("Adding first node...");
			start = newKite;
			size++;
		}
		else 
		{		
			System.out.println("Adding internal node...");
			ptr=start;
			while(ptr!=null) 
			{
				System.out.println("Searching....");
				prev = ptr;
				ptr=ptr.next;
			}
			prev.next = newKite;
			newKite.next = null;
			size++;
		}
	}
	
	void insertKite(String owner, Kite newKite) 
	{ 
		
		boolean found=false;
		
		if(start == null) 
		{
			System.out.println("List is empty...cannot add this object...");
		}
		else if(start.owner.equals(owner))
		{
			addAtBegining(newKite);
		}
		else 
		{
			ptr = start; 
			while(ptr!=null) 
			{
				if(ptr.owner.equals(owner)) 
				{
					found = true;
					
					break;
				}
				prev = ptr;
				ptr=ptr.next;
			}
			if(found==true) 
			{
				prev.next = newKite;
				newKite.next = ptr;
				System.out.println("Object INSERTED before....."+owner);
				size++;
			}
			else
				System.out.println("Not Found....");
		}
	}
			
		
	
	void deleteKiteByLength(int lengthToSearch) 
	{
		
		boolean found=false;
		
		if(start==null) 
		{
			System.out.println("List is empty..nothing to delete");
		}
		else 
		{
			System.out.println("List is not empty...searching...deleting...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr.length == lengthToSearch) 
				{
					System.out.println("Kite Found :"+ptr);
					prev.next=ptr.next;
					found=true;
					size--;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) 
			{
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	
	void deleteKite(Kite theKite) {
		boolean found=false;
	
		if(start==null) {
			System.out.println("List is empty..nothing to delete");
		}
		else if(start == theKite) {
			prev = start;
			start = start.next;
			prev.next = null;
			size--;
			System.out.println("Deleted Kite from the begining...");
		}
		else {
			ptr=start;//100
			while(ptr!=null)
			{
				if(ptr == theKite) {
					found=true;
					break;
				}
				prev = ptr; //100
				ptr = ptr.next;
			}
			if(found==true) {
				prev.next = ptr.next;
				System.out.println("Internal Object deleted...by Kite reference.");
				ptr.next = null;
				ptr =null;
				size--;
			}
			else {
				System.out.println("Kite NOT found....");
			}
		}
	}
	
	void ModifyKiteOwner(Kite k,String o) 
	{
		
		boolean found=false;
		
		if(start==null) 
		{
			System.out.println("List is empty..cannot modify..");
		}
		else 
		{
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr==k) 
				{
					System.out.println("Kite Found to Modify :"+ptr);
					ptr.owner=o;
					System.out.println("Kite Modified :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) 
			{
				System.out.println("Kite not found... ");
			}
		}
	}
	
}