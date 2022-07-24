package cheannai;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintNumber {
	public static void main(String args[]) {
		PrintNumber pn = new PrintNumber();
		//pn.printNumber();
		//pn.printnumber1();
		//pn.printNumber2();
		//pn.printNumber3();
		//pn.printNumber4();
		//pn.printNumber5();
		//pn.printNumber6();
		//pn.printNUmber7();
		//pn.printNumber8();
		//pn.printNumber9();
		//pn.printNumber10();
		//pn.printNumber11();
		//pn.printNumber12();
		pn.printNumber13();

	}

	private void printNumber13() {
		
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(row==2){
					System.out.print("894");
						break;
						}
					else if(row==3) {
						System.out.print("765");
						break;
						}
				
				else {
					System.out.print(col);
				}
				
				}
			System.out.println();
			
		}

	}

	private void printNumber12() {
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
				
			}
			
			System.out.println();
			
		}
		
		
	}

	private void printNumber11() {
		int count=1;
		for(int row=1;row<=5;row++){
			for(int col=1;col<=row;col++) {
				System.out.print(count+" ");
				count++;
			}
		System.out.println();
		}
		
	}

	private void printNumber10() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				for(int speace=1;speace<=row;speace++) {
					if((row==1) && (col==1) || ((row==2)&&(col==1))){
					System.out.print(" ");
					}
				}
				System.out.print(col);
			
			}
			System.out.println();
		}
		
			
		}
		
	

	private void printNumber9() {
		for (int row = 1; row <= 5; row++) {
			for (int colm = 1; colm <= row; colm++) {
				if ((row == 3 && colm == 2) || ((row == 4) && (colm == 2)) || ((row == 4) && (colm == 3))) {
					System.out.print(" ");
				} else
					System.out.print(colm);
			}
			System.out.println();
		}

	}

	private void printNumber8() {
		int count = 1;

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("which number you wana multiple");
			int no = sc.nextInt();
			for (int row = 1; row <= 5; row++) {
				for (int col = row; col <= 5; col++) {
					System.out.print(count * no + " ");
					count++;

				}
				System.out.println();
			}
			

		} catch (InputMismatchException e) {
			System.out.println("please enter vaild number");
			printNumber8();

		}
		System.out.println();
		System.out.println();

	}

	private void printNUmber7() {
		int count = 1;
		int no = 2;
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {
				System.out.print(count * no + " ");
				count++;

			}
			System.out.println();
		}

	}

	private void printNumber6() {
		int count = 15;
		int no = 2;
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {
				System.out.print(count * no + " ");
				count--;
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();
	}

	private void printNumber5() {
		int count = 15;
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {
				System.out.print(count + " ");
				count--;

			}
			System.out.println();
		}

	}

	private void printNumber4() {
		int count = 1;
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {
				System.out.print(count + " ");
				count++;
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();
	}

	private void printNumber3() {
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);

			}
			System.out.println();
		}

	}

	private void printNumber2() {
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private void printnumber1() {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

	}

	private void printNumber() {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}

			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
