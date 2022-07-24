package cheannai;

public class StarPattern {
	public static void main(String args[]) {
		StarPattern sp=new StarPattern();
		//sp.printStar();
		//sp.printStar1();
		//sp.printStar2();
		sp.printNumber();
		
	}

	private void printNumber() {
		for(int row=5;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
		
		
	}

	private void printStar2() {
		
			// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{
			System.out.print("* "); 
			for(int star=1; star<row; star++)
				{
				System.out.print("  "); 
				}
			System.out.print("* "); 
			for(int star=4-row; star>=1; star--)
			{	System.out.print("  "); }
			if(row!=5)
				System.out.print("* "); 
			System.out.println();
			}
		} 
		
	

	private void printStar() {
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=6-row;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

	private void printStar1() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print("* ");
			}
			
			
			
			System.out.println();
		}
		
	}

}
