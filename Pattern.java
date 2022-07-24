package cheannai;
import java.util.Scanner;

public class Pattern {
	static Scanner sc=new Scanner(System.in);
public static void main(String args[]) {
	Pattern p=new Pattern();
	//p.print_different_number();
	//p.print_same_number();
	p.print_star();
	
	
	
}

private void print_star() {
	for(int row=1;row<=5;row++) {
		for(int col=5;col>=6-row;col--) {
			System.out.print("* ");
		}
			System.out.println();
	}
	
}

private void print_same_number() {
	
	System.out.println("Enter number of the rows to print the pattern");
	int rows=sc.nextInt();
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
	
}

private void print_different_number() {
	
	System.out.println("Enter the number of rows to print the pattern");
	int rows=sc.nextInt();
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			
		}
		System.out.println();
		
	}
	
}

}
