package cheannai;

public class Fibonacci {
	public static void main(String args[]) {
Fibonacci fb=new Fibonacci();
//fb.fibonacci();
fb.count();
	}

	private void count() {
		int first=-1;
		int secound=1;
		int third=0;
		int count=6;
		while(count>0) {
			third=first+secound;
			System.out.println(third);
			first=secound;
			secound=third;
		count--;
		}
		
		
		
	}

	private void fibonacci() {
		int first=-1;
		int secound=1;
		int third=0;
		while(third<21) {
			third=first+secound;
			System.out.println(third);
			first=secound;
			secound=third;
			
			}
		
	}
}