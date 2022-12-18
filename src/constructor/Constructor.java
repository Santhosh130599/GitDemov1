package constructor;

public class Constructor {
	
	int x;
	String Name;
	
	void Display() {
		
		System.out.println(x +"---->"+Name);
	}

	public static void main(String[] args) {
		
		Constructor C = new Constructor();
		
		C.Display();	
	
	}

}
