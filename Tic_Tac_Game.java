package cheannai;
import java.util.Scanner;

public class Tic_Tac_Game {
	String user1;
	String user2;
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		Tic_Tac_Game ta=new Tic_Tac_Game();
		char ar[][]=new char[3][3];
		
		ta.game(ar);
		
	}
	//public void user1Selection() {
		//System.out.println("Which Symbol You Wana Select ? :  \n1.!\n2.@\n3.#\n4.$\n5.&");
		//int user1=sc.nextInt();}
	//public void user2Selection() {
		//System.out.println("Which Symbol You Wana Select ? :  \n1.!\n2.@\n3.#\n4.$\n5.&");
		//int user2=sc.nextInt();
	//}
	public void user2Selected() {
		
	}
		
public void user1Selected() {
	
	System.out.println("Which Symbol You Wana Select ? :  \n1.!\n2.@\n3.#\n4.$\n5.&");
	String user1=sc.next();
	if(user1=="1") {
		System.out.println("Your Symbol is : !");
		}
	else if(user1=="2") {
		System.out.println("Your Symbol is : @");
		
	}
	else if(user1=="3") {
		System.out.println("Your Symbol is : #");
		
	}
	else if(user1=="4") {
		System.out.println("Your Symbol is : $");
		
	}
	else if(user1=="5") {
		System.out.println("Your Symbol is : %");
	
	}
	
	
	else {
		
		System.out.println("Please Select Vaild Sysmbol");
		
		}
		
	

	
	
	System.out.println("Which Symbol You Wana Select ? :  \n1.!\n2.@\n3.#\n4.$\n5.&");
	String user2=sc.next();

	if(user2=="1") {
		System.out.println("Your Symbol is : !");
		}
	else if(user2=="2") {
		System.out.println("Your Symbol is : @");
		
	}
	else if(user2=="3") {
		System.out.println("Your Symbol is : #");
		
	}
	else if(user2=="4") {
		System.out.println("Your Symbol is : $");
		
	}
	else if(user2=="5") {
		System.out.println("Your Symbol is : %");
	
	}
	else if(user1==user2) {
		user2Selected();
		
	}
		
	else {
		
		System.out.println("Please Seleact Vaild Sysmbol OR Please Change the Symbol");

	}
	


	
	
	
	//Integer user3=Integer.valueOf(this.user1);
	//Integer user4=Integer.valueOf(this.user2);

		} 		



	

	private void selectSymbol() {
		//user1Selection();
		//user2Selection();
		user1Selected();
		user2Selected();
	}
		
	private void game(char[][] ar) {
				for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				ar[i][j]='-';
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
				System.out.println("Please enter your name");
				String p1=sc.nextLine();
				System.out.println("Please enter your name");
				String p2=sc.nextLine();
				
	}
	
	
}
