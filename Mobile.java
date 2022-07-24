package cheannai;
public class Mobile implements Comparable {
	int price,year;
public Mobile(int price,int year) {
		this.price=price;
		this.year=year;
	}
public static void main(String args[]) {
	Mobile mobile1=new Mobile(18000,2015);
	Mobile mobile2=new Mobile(10000,2019); 
	//System.out.println(mobile1.hashCode());
	//System.out.println(mobile2.hashCode());
	System.out.println(mobile1.equals(mobile2));
	System.out.println(mobile1==mobile2);
System.out.println(mobile1.hashcode());
System.out.println(mobile2.hashcode());

}
public int hashcode() {
	return 123;
	
}
public boolean equals(Object ob) {
	Mobile m2=(Mobile)ob;
	System.out.println(m2.price);
	if(this.price==m2.price) {
		if(this.year==year) {
			return true;
		}
	return false;
	}else {
		return false;
	}
	


}
public String toString() {
	return this.price+"--->"+this.year;
	
}
@Override
public int compareTo(Object o) {
	System.out.println("This o"+this.price);
	Mobile mo=(Mobile)o;
	System.out.println("this mo"+mo.price);
	if(this.price>mo.price) {
	return +1;
	}
	else if(this.price<mo.price) {
	return -1;
	}
	return 0;
}
}
