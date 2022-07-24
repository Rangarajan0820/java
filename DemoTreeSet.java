package cheannai;
import java.util.TreeSet;

public class DemoTreeSet {
public static void main(String args[]) {
	TreeSet ts=new TreeSet();
	 ts.add("abcd"); 
	    ts.add("Abcd"); 
	    ts.add("pqrs"); 
	    ts.add("ghgh");
	System.out.println(ts);
	TreeSet ts1=new TreeSet();
	ts1.add("Ranga");
	ts1.add("Rajan");
	ts1.add("kick");
	ts1.add("Gunther");
	ts1.add("Brad");
	System.out.println(ts1);
	System.out.println(ts1.size());
ts1.addAll(ts);
System.out.println(ts1);
System.out.println(ts1.size());
System.out.println(ts1.contains("kick"));
System.out.println(ts1.contains("Billy Stumps"));
System.out.println(ts1.remove("Ranga"));
System.out.println(ts1);
}

}
