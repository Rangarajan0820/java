package cheannai;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	
public static void main(String args[]) {

User user=new User();
user.add();

	
}

private void add() {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int no=sc.nextInt();
		System.out.println("Enter secound number");
		int no1=sc.nextInt();
		System.out.println(no+no1);
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("enter vaild number");
			add();
				}
	catch(StackOverflowError s) {
		System.out.println("stack overflow Execpistion");
		}
	
		
	
	
	
}
}
