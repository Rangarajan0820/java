package cheannai;
import java.util.LinkedList;

public class DemoLinkedList {
	public static void main(String args[]) {
		LinkedList ll=new LinkedList();
		ll.add(20);
		ll.add("abcd");
		ll.add('R');
		ll.add(23.5f);
		ll.add(22.4);
		ll.add(20);//add duplicate vllue
		System.out.println(ll.size());//list vllue size 
		System.out.println(ll);
		for(Object ob:ll) {
		System.out.println(ob);
		}
		System.out.println(ll.indexOf('R'));
		System.out.println(ll.remove(2));
		System.out.println(ll);
		ll.clear();// delete the value
		System.out.println(ll);
	}

}
