package package1;
interface A{
	void methodA();
}

interface B extends A{
	void methodB();
}

class C implements B{
	public void methodA() {
		System.out.println("Method A from inteface A");
	}
	
	public void methodB() {
		System.out.println("method B from interface B");
	}
}
public class multilevelInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		C obj = new C();
		obj.methodA();
		obj.methodB();
	}

}
