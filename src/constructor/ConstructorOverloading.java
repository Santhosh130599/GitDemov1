package constructor;

public class ConstructorOverloading {
	
	
	public ConstructorOverloading(int y,String Name) {
		
		this.Y = y;
		
		this.Name = Name;
		
	}
	
	public ConstructorOverloading(int y,String Name,int z) {
		
		this.Y = y;
		
		this.Name = Name;
		
		this.Z= z;
		
	}
	
	
	int Y ;
	String Name;
	int Z;
	
	void Display() {
		
		System.out.println(Y+"----"+Name+ Z);
	}
	public static void main(String[] args) {
		
		ConstructorOverloading CO = new ConstructorOverloading(10,"Santhosh",2000);
		CO.Display();
		
		
		ConstructorOverloading COL = new ConstructorOverloading(1000 , "Sandy");

		COL.Display();
		
	}

}
