package cheannai;

public class Flowers {
	void add(){
		
		int flowers=128;
		while(flowers>1) {
			System.out.println("Temple"+(flowers/2));
			flowers=flowers/2;
			
		}
		System.out.println(flowers);
	}
	void temple() {
		int temple=7;
		int flowers=1;
		while(temple>0) {
			System.out.println(temple+"gave"+flowers);
			flowers=flowers*2;
			temple=temple-1;
			
		}
		System.out.println("Total flowers count"+(flowers));
	}
		
	
public static void main(String args[]) {
Flowers fl=new Flowers();

fl.add();
fl.temple();
fl.temple_For();
}
private void temple_For() {
	int flowers=1;
	for(int temple=7; temple>0; temple--) {
		System.out.println(temple+"gave"+flowers);
		flowers=flowers*2;
		
			}
	System.out.println("Total flowers count"+flowers);
}

		
		
	
	
}
