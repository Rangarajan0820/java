package cheannai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoMixed {
public static void main(String args[]) {
	DemoMixed dm=new DemoMixed();
	//dm.first();
dm.secound();

}

private void secound() {
	ArrayList as=new ArrayList();
	as.add(20);
	as.add(23);
	as.add(45);
	as.add(56);
	Iterator it= as.iterator();
	boolean result= it.hasNext();
	while(result) {
		Object ob=it.next();
		Integer s=(Integer)ob;
		if(s.equals(20)){
			it.remove();
		}
		result=it.hasNext();
	}
	System.out.println(as);
}

private void first() {
	ArrayList al=new ArrayList();
	al.add(5);
	al.add(10);
	al.add(56);
	al.add(66);
	al.add(5);
	al.add(56);
	al.add(0);
	System.out.println(al);
	LinkedHashSet ls=new LinkedHashSet();
	for(Object ob:al) {
		boolean result=ls.add(ob);
		if(result==false) {
			System.out.println(ob);
		}
		
	}
}
}
