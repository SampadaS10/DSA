package example.generic;

public class GenericTest2 {

	public static void main(String[] args) {
		MyValues<Integer> mi= new MyValues<Integer>(10, 20);
		mi.print();
		mi.swap();
		mi.print();
		System.out.println("\n-------------------\n");
		MyValues<Float> mf= new MyValues<Float>(53.56f, 20.23f);
		mf.print();
		mf.swap();
		mf.print();

	}

}

class MyValues<AnyType>{
	AnyType x;
	AnyType y;
	MyValues(AnyType x, AnyType y) {
		this.x=x;
		this.y=y;	
	}
	
	void print() {
		System.out.println("X "+x);
		System.out.println("Y "+y);
	}
	
	void swap() {
		System.out.println("swapping...");
		AnyType temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
}