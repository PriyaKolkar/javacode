package package1;
 interface Vehicle{
	void start();
	 default void fueltype() {
		 System.out.println(" vehicle uses fuel");
	 }
	 
	 static void service() {
		 System.out.println(" vehicle needs regular service");
	 }
 }
 
 class bike implements Vehicle{
	public void start() {
		System.out.println(" bike starts with self button");
	}
 }
 
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  bike v= new bike();
  v.start();
  v.fueltype();
  Vehicle.service();
	}

}
