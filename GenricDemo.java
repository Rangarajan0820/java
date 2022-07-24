package cheannai;
import java.util.ArrayList;
import java.util.HashMap;

public class GenricDemo {
public static void main(String args[]) {
	GenricDemo gd=new GenricDemo();
	//gd.first();
	gd.secound();
}
private void secound() {
	HashMap<String, Integer>hm=new HashMap<String,Integer>();
	hm.put("Ranga", 35);
	hm.put("Vimal",37);
	System.out.println(hm);
	
	
}
private void first() {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(55);
	al.add(10);
	al.add(45);

	System.out.println(al);

	for(Object o:al) {
		
		System.out.print(o+" ");
	}

	


}
}
