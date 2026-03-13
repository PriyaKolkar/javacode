package package1;


//Interface
interface Shape1 {
 void draw();
}

//Implementing class
class Circle1 implements Shape1 {

 public void draw() {
     System.out.println("Drawing Circle");
 }
}

//Main class
public class FullAbstraction {
 public static void main(String[] args) {

     Circle1 s = new Circle1();
     s.draw();
 }
}