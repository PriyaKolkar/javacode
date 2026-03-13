package package1;

abstract class Animal {

 abstract void sound();

 void eat() {
     System.out.println("Animal is eating");
 }
}

class Dog extends Animal {
 void sound() {
     System.out.println("Dog barks");
 }
}

public class partialAbstraction {

 public static void main(String[] args) {

     Animal a = new Dog();
     a.eat();     // concrete method
     a.sound();   // abstract method
 }
}