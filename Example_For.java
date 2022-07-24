package cheannai;

public class Example_For {
	public static void main(String args[]) {
		Example_For ef=new Example_For();
		//ef.print_Same_Line();
       //ef.print_differ_row();	
        //ef.print_123__fivetimes();
ef.printodd();
	}
	

	private void printodd() {
		for(int no=1;no<=10;no+=2) {
			System.out.print(no+" ");
			if(no==9) {
				System.out.println();
				no=0;
				
			}
			
			
		}
		
	}


	private void print_123__fivetimes() {
		int no=1;
		int col=1;
		int row=20;
		for(col=1;col<=row;col++) {
			System.out.print(no+" ");
			if(col%5==0) {
				no++;
				System.out.println();
				row--;
			}
			
		}
		
	}


	private void print_differ_row() {
		for(int row =1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(row+" ");
				}
			System.out.println();
		}
		
	}


	private void print_Same_Line() {
		int no=1;
		int n=3;
		while(no<=n) {
			System.out.print(1+" ");
			no++;
		}
		}
		
	}


