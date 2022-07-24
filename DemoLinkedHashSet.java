package cheannai;

import java.util.LinkedHashSet;


public class DemoLinkedHashSet {
public static void main(String args[]) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(20);
	lhs.add(20);
	lhs.add("Ranga");
	lhs.add("RAJAN");
	lhs.add(23.5f);
	lhs.add(23.4);
	System.out.println(lhs);
	LinkedHashSet lhs1=new LinkedHashSet();
	lhs1.add(34);
	lhs1.add(55);
lhs1.add(65);
lhs1.add("Ravi");
System.out.println(lhs1.size());
lhs1.addAll(lhs);
System.out.println(lhs1);
System.out.println(lhs1.size());
System.out.println(lhs1.contains("Ravi"));
for(Object ob:lhs1) {
System.out.println(ob);
}	

}

}

