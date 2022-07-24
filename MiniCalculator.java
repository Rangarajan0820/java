package cheannai;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniCalculator {
	int result;
	public static void main(String args[]) {
		MiniCalculator mc = new MiniCalculator();
		mc.calculator();
		mc.calculator1();
	}

	private void calculator1() {
		int operator=0;
		int operator1=0;
		int no3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Which operation You Wana Select ?:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.exit");
		operator = sc.nextInt();
		try {
			System.out.println("Please Enter Third Number?");
			no3 = sc.nextInt();
			

		} catch (InputMismatchException e) {
			System.out.println("Please Enter vaild input:");
			calculator1();
		} catch (ArithmeticException e) {
			System.out.println("Can't Divide by Zero");
			calculator1();
		} catch (Exception e) {
			System.out.println("Please Enter vaild option");
			calculator1();
		}
		try {
			switch (operator) {
			case 1:
				result = this.result + no3;
				System.out.println(this.result + " + " + no3 + " = " + result);
				break;
			case 2:
				result = this.result - no3;
				System.out.println(this.result + " - " + no3 + " = " + result);

				break;
			case 3:
				result = this.result * no3;
				System.out.println(this.result+ " * " + no3 + " = " + result);

				break;
			case 4:
				result = this.result / no3;
				System.out.println(this.result + " / " + no3 + " = " + result);

				break;
			case 5:
				System.out.println("Tankyou see you again");
				System.exit(0);
				
			default:
				System.out.println("You enter wrong input");

			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter vaild input:");
			calculator1();
		} catch (ArithmeticException e) {
			System.out.println("Can't Divide by Zero");
			calculator1();
		} catch (Exception e) {
			System.out.println("Please Enter vaild option");
			calculator1();
		}
		System.out.println();
		System.out.println("you want to Continue ?:\n1.yes\n2.No");
		operator1 = sc.nextInt();
		switch (operator1) {
		case 1:
			calculator1();
		case 2:
			System.exit(0);

		}

		
		
	}

	private void calculator() {
		int operator = 0;
		int operator1 = 0;
		
		int no1 = 0;
		int no2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Which operation You Wana Select ?:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.exit");
		operator = sc.nextInt();
		try {
			System.out.println("Please Enter First Number?");
			no1 = sc.nextInt();
			System.out.println("Please Enter Secound Number?");
			no2 = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Please Enter vaild input:");
			calculator();
		} catch (ArithmeticException e) {
			System.out.println("Can't Divide by Zero");
			calculator();
		} catch (Exception e) {
			System.out.println("Please Enter vaild option");
			calculator();
		}
		try {
			switch (operator) {
			case 1:
				result = no1 + no2;
				System.out.println(no1 + " + " + no2 + " = " + result);
				break;
			case 2:
				result = no1 - no2;
				System.out.println(no1 + " - " + no2 + " = " + result);

				break;
			case 3:
				result = no1 * no2;
				System.out.println(no1 + " * " + no2 + " = " + result);

				break;
			case 4:
				result = no1 / no2;
				System.out.println(no1 + " / " + no2 + " = " + result);

				break;
			case 5:
				System.out.println("Thank you see Again");
				System.exit(0);
			default:
				System.out.println("You enter wrong input");

			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter vaild input:");
			calculator();
		} catch (ArithmeticException e) {
			System.out.println("Can't Divide by Zero");
			calculator();
		} catch (Exception e) {
			System.out.println("Please Enter vaild option");
			calculator();
		}
		System.out.println();
		System.out.println("you want to Continue ?:1.yes\n2.No");
		operator1 = sc.nextInt();
		switch (operator1) {
		case 1:
			calculator1();
		case 2:
			System.exit(0);

		}

	}

}