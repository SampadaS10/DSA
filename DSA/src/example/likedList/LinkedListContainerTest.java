package example.likedList;


public class LinkedListContainerTest 
{
	public static void main(String[] args) 
	{
		Kite k1 = new Kite("Red","Sampada",50,true);
		Kite k2 = new Kite("Green","Shri",60,true);
		Kite k3 = new Kite("Blue","Sakshi",80,true);
		Kite k4 = new Kite("Yellow","Mansi",90,true);
		Kite k5 = new Kite("Black","Manjiri",75,true);
		
		MyLinkedList myList = new MyLinkedList();
		myList.showList();
		
		myList.add(k1);
		myList.add(k2);
		myList.showList();
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);
		
		myList.showList();
		
		System.out.println("===============================");
		//myList.searchKite(k4);
		//Kite k6 = new Kite("White","Samarth",175,true);
		
		//myList.addAtBegining(k6);
		//System.out.println("==============================");
		//myList.showList();
		//myList.searchKiteByLength(180);
		//myList.deleteKiteByLength(75);
		myList.deleteKite(k4);
		myList.showList();
		//myList.insertKite("Manjiri", k6);;
		//myList.showList();
		//myList.ModifyKiteOwner(k5, "Manav");
		//System.out.println("===============================");
		//myList.showList();
	}
}
