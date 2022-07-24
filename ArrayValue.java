package cheannai;

public class ArrayValue {
public static void main(String args[]) {
	ArrayValue av=new ArrayValue();
	//av.highestValue();
	//av.lowestValue();
	//av.highestSecound();
	//av.highestSecound1();
	//av.lowestSecound();
	//av.lowestSecound1();		
	//av.highest();
	//av.lowestValue1();
	//av.highestValue1();
	//av.highestValue2();
av.lowestValue2();
}

private void lowestValue2() {
	int ar[]= {123,34,55,98,23,14,12,11};
	int low=ar[0];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]<low) {
			low=ar[i];
		}
	}
System.out.println(low);	
}

private void highestValue2() {
	int ar[]= {23,34,55,66,88,99};
	int high=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>high) {
		high=ar[i];
		}
		
	}
	System.out.println(high);
}

private void lowestSecound1() {
	int ar[]= {100,10,20,30,40,50};
	int low=ar[0];
	int sec_low=ar[0];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]<low) {
			sec_low=low;
			low=ar[i];
		}
		else if(ar[i]<sec_low) {
			sec_low=ar[i];
			
		}
	}
	System.out.println("First Lowest number is : "+low);
	System.out.println("Secound Lowest Number is :"+sec_low);
	
}

private void lowestSecound() {
	int score[]= {58,23,45,49,99,100};
	int low=score[0];
	int sec_low=score[0];
	for(int i=0;i<score.length;i++) {
		if(score[i]<low) {
			sec_low=low;
			low=score[i];
			}
		else if(score[i]<sec_low) {
			sec_low=score[i];
			
		}
		
	}
System.out.println("First Lowest Number is :"+low);
System.out.println("Secound Lowest Numvber is : "+sec_low);
System.out.println("\n");
}

private void highestSecound1() {
	int ar[]= {100,150,200,250,300,450,600,500};
	int high=ar[0];
	int sec_high=ar[0];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>high) {
			sec_high=high;
			high=ar[i];
			}
		else if(ar[i]>sec_high) {
			sec_high=ar[i];
			
		}
		
	}
	System.out.println("First Highest  Number is : "+high);
	System.out.println("Secound Highest Number is : "+sec_high);
	
	
}

private void highestValue1() {
	int ar[]= {100,10,20,30,40,50};
	int high=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>high) {
high=ar[i];			
			
		}
		
	}
	System.out.println(high);
}

private void lowestValue1() {
	int ar[]= {1,2,3,4,5,6};
	int low=ar[0];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]<low) {
			low=ar[i];
			
		}
		
	}
	System.out.println(low);
}

private void highestSecound() {
	
	int marks[]= {90,76,58,98,100};
	int high=marks[0];
	int sec_high=marks[0];
	for(int i=0;i<marks.length;i++) {
		if(marks[i]>high) {
			sec_high=high;
			high=marks[i];			
        }
		else if(marks[i]>sec_high) {
			sec_high=marks[i];
			
		}
		
	}
	System.out.println("First Highest Number is : "+high);
	System.out.println("Secound Highest Number is : "+sec_high);
	System.out.println("\n");
	
}

private void lowestValue() {
	int marks[]= {90,76,58,98,100};
	int low=marks[0];
	for(int i=0;i<marks.length;i++) {
		if(marks[i]<low) {
			low=marks[i];
			
		}
		
	}
	System.out.println(low);
	
}

private void highest() {
	
	
}

private void highestValue() {
	int marks[]= {90,76,58,98,100};
	int high=0;
	for(int i=0;i<marks.length;i++) {
		if(marks[i]>high) {
			high=marks[i];
		}
		}
		System.out.println(high);
	}
	

}

