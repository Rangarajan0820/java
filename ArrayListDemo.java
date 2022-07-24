package cheannai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		Mobile mob1=new Mobile(12000,2004);
		Mobile mob2=new Mobile(10000,2005);
		Mobile mob3=new Mobile(8000, 2008);
		Mobile mob4=new Mobile(25000,2010);
		ArrayList al=new ArrayList();
		al.add(mob1);
		al.add(mob2);
		al.add(mob3);
		al.add(mob4);
		Iterator i=al.iterator();
		System.out.println(al);
		ComparatorDemo cd=new ComparatorDemo();
		Collections.sort(al,cd);
		System.out.println(al);

	
		 
		
		
	}

}
