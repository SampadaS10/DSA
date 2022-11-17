package example.likedList;

public class LinkListTest {

	public static void main(String[] args) {
		Kite k1 =new Kite("Red", "Jack",50,true);
		Kite k2 =new Kite("Green", "Jane",60,true);
		Kite k3 =new Kite("Blue", "John",80,true);
		Kite k4 =new Kite("Yello", "Jane",60,true);
		Kite k5 =new Kite("Black", "John",80,true);
		k1.next=k2;
		k2.next=k3;
		k3.next=k4;
		k4.next=k5;
		
		System.out.println("K1 : "+k1);
		System.out.println("K2 : "+k1.next);
		System.out.println("K3 : "+k1.next.next);
		System.out.println("K4 : "+k1.next.next.next);
		System.out.println("K5 : "+k1.next.next.next.next);
		
		System.out.println("----------------------------------------------");
//		System.out.println("K1 : "+k1);
//		System.out.println("K2 : "+k2);
//		System.out.println("K3 : "+k3);
		
		System.out.println("K1 : "+k1.hashCode());
		System.out.println("K2 : "+k2.hashCode());
		System.out.println("K3 : "+k3.hashCode());
		System.out.println("K4 : "+k4.hashCode());
		System.out.println("K5 : "+k5.hashCode());
		
		System.out.println("----------------------------------------------");
		System.out.println("K1.next : "+k1.next.hashCode());
		System.out.println("K2.next : "+k2.next.hashCode());
		System.out.println("K3.next : "+k3.next.hashCode());
		System.out.println("K4.next : "+k4.next.hashCode());
//		System.out.println("K5.next : "+k5.next.hashCode());

	}

}
