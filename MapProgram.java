package package1;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Map<Integer,String> m1=		new HashMap<Integer,String>();
			m1.put(7854, "Abhi");
			m1.put(9654, "Nazima");
			m1.put(5412, "Raju");
			m1.put(6542, "Supriya");
			m1.put(9685, "Monu");
			
			System.out.println(m1);

			boolean b1=	m1.isEmpty();
			System.out.println(b1);
			
			boolean b2=	m1.containsKey(8521);
			System.out.println(b2);
			boolean b3=	m1.containsValue("Raju ");
			System.out.println(b3);
			
			
			}
		
	}


