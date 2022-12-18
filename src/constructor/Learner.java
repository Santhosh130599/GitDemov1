package constructor;

public class Learner {
	
	int a;
	String Name;
	float b;
	
	void display() {
		
		System.out.println(a+Name+b);
	}
	
	Learner(int A){
		
		this.a=A;
		
	}
	
	Learner (int A,String name){
		
		this.a=A;
		this.Name=name;
	}

	Learner (int b,String namee,float c){
		
		this.a=b;
		this.Name=namee;
		this.b = c;
	}
	public static void main(String[] args) {

		
		Learner  l = new Learner(1000);

		l.display();
		
		Learner L1 = new Learner(2000,"SANDY");
		L1.display();
		
		
		
	}

}
