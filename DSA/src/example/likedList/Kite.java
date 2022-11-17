package example.likedList;

public class Kite {

	 String color;
	 String owner;
	 int length;
	private boolean flying;
	Kite next;//self reference
	
	public Kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
		
		
	}

	@Override
	public String toString() {
	
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ", \n\n\tnext="
				+ next + "]";
	}
	
}
