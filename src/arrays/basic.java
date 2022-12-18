package arrays;

import java.util.Arrays;

public class basic {

	public static void main(String[] args) {

		Fruits();
		
	  Cost_Of_Fruits(20,30,40);
	  
	  System.out.println("All the methods are executed");
		
	}

	private static void Cost_Of_Fruits(int a,int b, int c) {
		
		
		int[] Costs = new int[3];
		
		Costs [0] = a;
		
		Costs [1] = b;
		
		Costs [2] = c;
		
		System.out.println(Arrays.toString(Costs));
		
		System.out.println(Costs.length);
		
		
	}

	public static void Fruits() {
		
		String Fruits_Name [] = {"APPLE","MANGO","PROMOGRANTE","ORANGE","GRAPES"};
		
		System.out.println(Arrays.toString(Fruits_Name));
		
	}
	
	

}
