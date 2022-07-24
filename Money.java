package cheannai;

public class Money {
	static int box=0;
static	int money=10;
	public static void main(String args[]) {
	Money m=new Money();
	m.add_money();
	m.add_while();
		
		
	}

	private void add_while() {
		for(int nod=25;nod>0;nod--) {
			box=box+money;
			
		}
		System.out.println("Total ammount in my hand"+box);
		
	}

	private void add_money() {
		int nod=25;
		int box=0;
		int money=10;
		while(nod>0) {
			box=box+money;
			
			
		nod=nod-1;	
		}
		System.out.println("Total money in my hand"+box);
	}

}
