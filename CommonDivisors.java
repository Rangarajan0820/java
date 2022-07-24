package cheannai;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CommonDivisors {
	public static void main(String args[]) {
		CommonDivisors cm=new CommonDivisors();
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Plese enter First number ");
		int no1=sc.nextInt();
		System.out.println("plese enter Secound number");
		int no2=sc.nextInt();
		cm.common(no1,no2);
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Plese enter vaild number");
			
		}
		
		try {
		System.out.println("Plese enter First number ");
		int no3=sc.nextInt();
		System.out.println("Plese enter Secound number ");
		int no4=sc.nextInt();
		cm.C_D(no3,no4);
		
	}
	catch(InputMismatchException e) {
		e.printStackTrace();
		System.out.println("Plese enter vaild number");
		
	}
	}

	private void C_D(int no1, int no2) {
	int small=(no1>no2)?no1:no2;
	System.out.println(small);
	
	for(int div=2;div<small;div++) {
		if (no1%div==0 && no2%div==0) {
			System.out.println(div);
			
		}
		
	}
	
		
	}

	private void common(int no1, int no2) {
		int small=no1<no2?no1:no2;
		System.out.println(small);
		int div=2;
		while(div<small) {
			if (no1%div==0 && no2%div==0) {
				System.out.println(div);
				}
			div=div+1;
		}
			
		
		
		
	}

}
