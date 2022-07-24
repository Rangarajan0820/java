package cheannai;

public class Demo {
	
	public static void main(String args[]) {
		Demo demo=new Demo();
		
		//demo.add();
		//demo.add1();
		//demo.add2(130,100);
	//demo.findLCM(20,13);
	//demo.flowers();
	//demo.temple();
	//demo.money();
	demo.box();
	}

private void box() {
		int box=0;
		int no_of_days=25;
		while(no_of_days>0) {
			box=box+no_of_days;
			no_of_days=no_of_days-1;
		}
		System.out.println("Total cash in last day in hand"+box);
	}

private void money() {
		int money=10;
		int box=0;
		int no_of_days=25;
		while(no_of_days>0) {
			box=box+money;
			no_of_days=no_of_days-1;
		
		}
		System.out.println("Total cash in hand last day"+box);
		
	}

private void temple() {
		int temple=7;
		int flower=1;
		while(temple>0) {
			System.out.println("Temple Count"+temple+"gave"+"Flower count"+flower);
			flower=flower*2;
			temple=temple-1;
			
		}
		
	}

private void flowers() {
		int flowers=128;
		while(flowers>1) {
			System.out.println("temple :"+(flowers/2));
			flowers=flowers/2;
			
		}
		
		
	}

private void findLCM(int no1, int no2) {
		int big=no1>no2?no1:no2;
		while(true) {
			if(big%no1==0&&big%no2==0) {
				System.out.println("LCM is"+big);
				break;
			}
			big++;
		}
		
	}

private void add2(int no1, int no2) {
	// find comman divisors 
	int small=no1<no2?no1:no2;
	System.out.println("Small number is :"+small);
	int div =2;
	while(div<small) {
		if(no1%div==0 && no2%div==0) {
			System.out.println(div);
		}
		div=div+1;
	}
		
		
	}

private void add1() {
	int i=10;
	while(i>=1) {
		System.out.println("number is :"+i);
		i--;
		
	}
		
		
	}
//number 1 to 10 assding order printing number
	private void add() {
		int i=1;
		while(i<=10) {
			System.out.println("number is :"+i);
			i++;
			
		}
		
		
	}
}
