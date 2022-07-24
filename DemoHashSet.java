package cheannai;
import java.util.HashSet;

public class DemoHashSet {
public static void main(String args[]) {
	HashSet dh=new HashSet();
	dh.add(20);
	dh.add(20);
	dh.add("Ranga");
	dh.add("RAJAN");
	dh.add(23.5f);
	dh.add(23.4);
	System.out.println(dh);
	HashSet dh1=new HashSet();
	dh1.add(34);
	dh1.add(55);
dh1.add(65);
dh1.add("Ravi");
System.out.println(dh1.size());
dh1.addAll(dh);
System.out.println(dh1);
System.out.println(dh1.size());
System.out.println(dh1.contains("Ravi"));
for(Object ob:dh1) {
System.out.println(ob);
}	

}
}