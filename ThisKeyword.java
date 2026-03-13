package package1;

public class ThisKeyword {

	int EmpId;
	String EmpName;
	Double Salary;
	
	ThisKeyword(int EmpId, String EmpName, double Salary){
		this.EmpId= EmpId;
		this.EmpName=EmpName;
		this.Salary=Salary;
	}
		
		void display() {
			System.out.println(" Employee ID: "  +this.EmpId);
			System.out.println("Employee Name"+" "  +this.EmpName);
			System.out.println("Salary"  +this.Salary);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-geneated method stub
  ThisKeyword t1= new ThisKeyword(111, "priya", 45000);
  t1.display();
  
	}

}
