package access_Modifiers;

public class My_Car {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.Car_Name = "Shift";
		
		c.Number_of_Cars = 10;
		
		String a = c.Car_Body();
		
		System.out.println(a);
		
		boolean b = c.Car_Brand();
		
		System.out.println(b);
		
		int d = c.Car_Size();
		
		System.out.println(d);
		

	}

}
