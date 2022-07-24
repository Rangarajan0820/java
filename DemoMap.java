package cheannai;
//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//import javax.swing.text.html.parser.Entity;

public class DemoMap {
	public static void main(String args[]) {
		DemoMap dm = new DemoMap();
		// dm.first();
		//dm.secound();
		 dm.thrid();

	}

	private void thrid() {
		TreeMap tm = new TreeMap();
		tm.put("idli", 20);
		tm.put("Dosa", 15);
		tm.put("poori", 35);
		tm.put("pongal", 30);
		 System.out.println(tm);
		 System.out.println(tm.keySet());
		 System.out.println(tm.values());
		 System.out.println(tm.get("chapathi"));
		 System.out.println(tm.entrySet());

		Set s = tm.entrySet();
		for (Object o : s) {
			Map.Entry entry=(Map.Entry)o;
			String key=(String)entry.getKey();
			if(key=="poori"|| key=="Dosa"||key=="pongal") {
				System.out.println(entry.getValue());
			}
			
		}
	}

	private void secound() {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("pen", 20);
		lhm.put("penchil", 5);
		lhm.put("book", 20);
		lhm.put("note", 35);
		System.out.println(lhm);
		System.out.println(lhm.containsKey("book"));
		System.out.println(lhm.containsValue(45));
		System.out.println(lhm.entrySet());
		Set s=lhm.entrySet();
		for(Object o: s) {
		Map.Entry entry=(Map.Entry)o;
		System.out.println("Key is :"+entry.getKey()+" :Value is :"+entry.getValue());
	int price=(int)	entry.getValue();
	if(price==20) {
		System.out.println(entry.getKey());
	}
		
		
			
			
		}
		}

	

	private void first() {

		HashMap hm = new HashMap();
		hm.put("idli", 20);
		hm.put("dosai", 30);
		hm.put("pongal", 35);
		hm.put("poori", 35);
		hm.put("meals", 75);
		
		  System.out.println(hm); System.out.println(hm.containsKey("Dosai"));
		 System.out.println(hm.containsValue(35.0)); System.out.println(hm.keySet());
		 System.out.println(hm.values()); System.out.println(hm.get("poori"));
		 System.out.println(hm.entrySet());
	

		Set s = hm.entrySet();
		for (Object o : s) {
		Map.Entry entry = (Map.Entry) o;
			
			int price = (int) entry.getValue();
			if (price == 35) {
				//entry.setValue(40);
				
				System.out.println(entry.getKey());
			}

		}

	}

}
