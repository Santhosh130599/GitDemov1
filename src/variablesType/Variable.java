package variablesType;

public class Variable {
	
	
	int c = 100;
	
	public static int AddNumbers(int a , int b) {
		return a+b;
		
	}
	
	public void Numbers() {
		
		int c = 10;
		
		System.out.println(this.c+c);
	}

	public static void main(String[] args) {
		
		Variable V = new Variable();
		
		System.out.println(AddNumbers(10,20));
		
		V.Numbers();
	}

}
