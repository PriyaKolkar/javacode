package JavaPrograms;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s= "madam";
 String rev="";
 
 char a[]= s.toCharArray();
int  len=a.length;

for(int i=len-1;i>=0;i--) {
	
	rev= rev+a[i];		
}
		
System.out.println(" Reverse String is ---> "   +rev);
	}

}
