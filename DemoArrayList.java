package cheannai;
import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String args[]) {
		ArrayList al=new ArrayList();
		
		al.add(20);
		al.add("abcd");
		al.add('R');
		al.add(23.5f);
		al.add(22.4);
		al.add(20);//add duplicate value
		System.out.println(al.size());//list value size 
		System.out.println(al);
		ArrayList all=new ArrayList();
		all.add(45);
		all.add("RANGA");
		all.add("Rajan");
		all.add("vikram");
		System.out.println(all.get(2));//this method index value get
		System.out.println(all);
		
		System.out.println(all.remove("vikram"));//this method remove value or index
				System.out.println(all);
		System.out.println(all.size());
		System.out.println(all.contains(20));
		System.out.println(all.contains("RANGA"));//this method give a boolean value
		
		all.addAll(al);//this method add the to ArrayList 
		System.out.println(all);
		System.out.println(all.size());
		
}
	
}