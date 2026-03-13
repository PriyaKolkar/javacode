package package1;

class Parent2{
	 void display() {
		System.out.println(" method in parent class");
	}
}

class child2 extends Parent2{
	 void display() {
		System.out.println(" method in child class");
		super.display();
	}
}


public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    child2 obj= new child2();
    obj.display();
    
	}

}
