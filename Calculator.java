package cheannai;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	int result=0;
public static void main(String args[]) {
	Calculator cal=new Calculator();
	cal.calculator();
	
}

private void calculator() {
	try {
	Scanner sc = new Scanner(System.in);
	System.out.println(
			"Which operation You Wana Select ?:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.exit");
int input=sc.nextInt();	


if(input==1) {
	System.out.println("Please enter First number ?");
	int no1=sc.nextInt();
	System.out.println("Please enter Secound ");
	int no2=sc.nextInt();
	result=no1 + no2;
	System.out.println(no1+" +"+no2+" ="+result);
}else if(input==2) {
	System.out.println("Please enter First number ?");
	int no1=sc.nextInt();
	System.out.println("Please enter Secound ");
	int no2=sc.nextInt();
	result=no1 - no2;
	System.out.println(no1+" -"+no2+" ="+result);
}
else if(input==3) {
	System.out.println("Please enter First number ?");
	int no1=sc.nextInt();
	System.out.println("Please enter Secound ");
	int no2=sc.nextInt();
	result=no1 * no2;
	System.out.println(no1+" *"+no2+" ="+result);
}else if(input==4) {
	System.out.println("Please enter First number ?");
	int no1=sc.nextInt();
	System.out.println("Please enter Secound ");
	int no2=sc.nextInt();
	result=no1 / no2;
	System.out.println(no1+" /"+no2+" ="+result);
}
else if(input==5) {
	System.exit(0);
}

System.out.println( "Do you want to continue?\n1.Yes\n2.NO");
int select=sc.nextInt();
		  if(select==1) {
			  calculator2();
			  
		  }
		  else{
System.exit(0);
		  }
		  
}catch(InputMismatchException e) {
	System.out.println("Please select vaild input");
	e.printStackTrace();
	calculator();
	
}
catch(ArithmeticException e) {
	System.out.println("can't divide by Zero");
	e.printStackTrace();
	calculator();
}
catch(Exception e) {
	System.out.println("Please select vaild input");
	e.printStackTrace();
	calculator();
	
	
}
}

private void calculator2() {
	try {
	Scanner sc = new Scanner(System.in);
	System.out.println(
			"Which operation You Wana Select ?:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.exit");
int input=sc.nextInt();	

if(input==1) {
	
	System.out.println("Please enter Thired ");
	int no3=sc.nextInt();
	result=this.result + no3;
	System.out.println(this.result+" +"+no3+" ="+result);
}else if(input==2) {
	System.out.println("Please enter Thired ");
	int no3=sc.nextInt();
	result=this.result - no3;
	System.out.println(this.result+" -"+no3+" ="+result);}
else if(input==3) {
	System.out.println("Please enter Thired ");
	int no3=sc.nextInt();
	result=this.result * no3;
	System.out.println(this.result+" *"+no3+" ="+result);
}else if(input==4) {
	System.out.println("Please enter Thired ");
	int no3=sc.nextInt();
	result=this.result / no3;
	System.out.println(this.result+" /"+no3+" ="+result);}
else if(input==5) {
	System.exit(0);
}

System.out.println( "Do you want to continue?\n1.Yes\n2.NO");
int select=sc.nextInt();
		  if(select==1) {
			  calculator2();
			  
		  }
		  else{
System.exit(0);
		  }
}
catch(InputMismatchException e) {
	System.out.println("Please select vaild input");
	e.printStackTrace();
	calculator2();
	
	
}
catch(ArithmeticException e) {
	System.out.println("can't divide by Zero");
	e.printStackTrace();
	calculator2();
	
}
catch(Exception e) {
	System.out.println("Please select vaild input");
	e.printStackTrace();
	calculator2();
	
	
}

}
}
