package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		{
ArrayList<Character> a1=new ArrayList<Character>();
				a1.add('L');
				a1.add('F');
				a1.add('J');
				a1.add('P');
				a1.add('Q');
				a1.add('X');
				System.out.println(a1);
				
				//Character c1=	a1.get(0);
				//	System.out.println(c1);
					
					Iterator<Character> i1=a1.iterator();//iterator()-non static method of ArrayList
				//Iterator is an Interface
					//abstarct methods-next,hasnext and remove
					System.out.println("Forward Iteration using Iterator:");
					while(i1.hasNext())
					{
						System.out.println(i1.next());
					}
					
					ListIterator<Character> i2=	a1.listIterator();
					System.out.println("Forward Iteartion using List Iterator:");
					while(i2.hasNext())
					{
						System.out.println(i2.next());
					}
					System.out.println("Backward Iteartion using List Iterator:");
					while(i2.hasPrevious())
					{
						System.out.println(i2.previous());
					}
					
				
			}

		
		}			
	}


