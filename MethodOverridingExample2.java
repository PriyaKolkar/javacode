package package1;

class Parent1{
	static void display() {
		System.out.println(" static method in parent class");
	}
}

class child1 extends Parent1{
	static void display() {
		System.out.println(" static method in child class");
	}
}

public class MethodOverridingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent1 p1=new Parent1();
		p1.display();
		
		Parent1 p2= new child1();
		p2.display();
		
		child1 c1= new child1();
		c1.display();
	}

}
