package cheannai;
import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		if(m1.price>m2.price) {
			return +12;
		}
		else if(m1.price<m2.price) {
			return -12;
		}else {
			if(m1.year>m2.year) {
				return +12;
			}
			else if(m1.year<m2.year) {
				return-12;
			}
		}
		return 0;
	}

}
