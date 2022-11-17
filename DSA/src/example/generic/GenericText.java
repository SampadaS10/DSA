package example.generic;

public class GenericText {

	public static void main(String[] args) {

		int x=10;
		int y=20;
		System.out.println("X "+x);
		System.out.println("Y "+y);
		
		System.out.println("X "+x);
		System.out.println("Y "+y);

	}

	
	public static void swap(int x, int y) 
	{
		System.out.println("swapping...");
		int temp=x;
		x=y;
		y=temp;
		System.out.println("swapping...");
	}
}
