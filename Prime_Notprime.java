package cheannai;
import java.util.Scanner;

public class Prime_Notprime {

	public static void main(String args[]) {
		Prime_Notprime np=new Prime_Notprime();
		np.prime();
		np.Prime_for();
		
		
		
		
		
		
	}

	private void Prime_for() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		
		int div=2;
		int count=0;
		for (int no=sc.nextInt();div<no;div++) {
			if(no%div==0) {
				count=count+1;
				System.out.println("Notprime");
				break;
			}
			
		}
		if(count==0) {
			System.out.println("prime number");
		}
		
	}

	private void prime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int no =sc.nextInt();
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				count=count+1;
				System.out.println("notprime");
				
			break;	
			}
			
			div=div+1;
			
		}
		if(count==0) {
			System.out.println("Prime Number");
		}
		
		
	}
	
	
	
	
}
