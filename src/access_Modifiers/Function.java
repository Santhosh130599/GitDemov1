package access_Modifiers;

public class Function {
	
	
	public String Bike() {
		
		return "YAHAMA BIKE";
	}
	
	public void Normal() {
		
		System.out.println("Normal method is created");
	}
	
	private int Addition() {
		int a = 5;
		int b= 10;
		int sum = a+b;
		return sum;
	}
	
	public int Subraction() {
		
		int a , b, sub;
		
		a= 100;
		b= 50;
		sub= 100-50;
		return sub ;
	}
	
	public static void main(String[] args) {
		
		Function fn = new Function();
		
		int a = fn.Addition();
		
		System.out.println("Private method Executed : value of Addition : " +a);
	}

}
