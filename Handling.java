package cheannai;
import java.util.Scanner;

public class Handling {
	public static void main(String args[]) {
		Handling hand=new Handling();
	hand.add();
		
	}

	private void add() {
		add1();
		System.out.println("it call 1 add");
		// TODO Auto-generated method stub
		
	}

	private void add1() {
		add2();
		System.out.println("it call 2 add");
		
	}

	private void add2() {
		try {
		System.out.println("Please enter two numbers");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int no1=sc.nextInt();
		System.out.println("Please enter Secound number");
		int no2=sc.nextInt();
		System.out.println(no1+no2);
		System.out.println(no1-no2);
		System.out.println(no1*no2);
		
		System.out.println(no1/no2);
		int []ar=new int[no1];
		System.out.println(ar.length);
		
	
	}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("ArithemeticException");
			add2();
		}
		catch(NegativeArraySizeException p) {
			p.printStackTrace();
			System.out.println("-array size");
			add2();
		}
}
}