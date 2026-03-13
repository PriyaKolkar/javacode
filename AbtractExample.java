package package1;

abstract class Shape{
	abstract void draw();
	void message() {
		System.out.println(" This is a shape method");
	}
}

 class Circle extends Shape{
	void draw() {
		System.out.println(" Drawing circle");
	}}

public class AbtractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Shape s= new Circle();
		Shape s= new Circle();
   s.message();
   s.draw();
   
	}

}
