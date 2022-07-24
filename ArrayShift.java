package cheannai;

public class ArrayShift {
public static void main(String args[]) {
	ArrayShift as=new ArrayShift();
	//as.rightShift();
	//as.leftShift();
	//as.oddNumber();
	//as.evenNumber();
	//as.indexNumber();
	//as.linearSearch();
	//as.linearSearch1();
	//as.oddNumber1();
	as.rightShift2();
}

private void rightShift2() {
	int ar[]= {23,12,1,4,5,7,9};
	int temp=ar[6];
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	for(int i=6;i>=1;i--) {
	ar[i]=ar[i-1];
	}
	ar[0]=temp;
	System.out.println();
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
		
	}
	
	
}

private void oddNumber1() {
	int ar[]= {23,12,1,4,5,7,9};
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==1) {
			System.out.println("odd Number is "+ar[i]+" ");
		}
		
	}
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==0) {
			System.out.println("Even number is "+ar[i]+" ");
		}
	}

}

private void linearSearch1() {
	int ar[]= {450,55,75,95,105};
	int no=95;
for(int i=0;i<ar.length;i++) {
	if(ar[i]==no) {
		System.out.println("Yes is present index is :"+i);
		break;
	}
	
}

}

private void linearSearch() {
	int ar[]= {10, 5, 7,8, 2, 6};
	int no=8;
	
	
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==no){
		System.out.println("Yes present index is :"+i);
		
		break;
		}
		
	}
}

private void indexNumber() {
	int[] ar = {10, 5, 7,8, 2, 6}; 
for(int i=0;i<ar.length;i++) {
	if(i%2==1) {
		System.out.println("Index Odd number is:"+ar[i]+" ");
	}
	
}
System.out.println();
for(int i=0;i<ar.length;i++) {
	if(i%2==0) {
		System.out.println("Index Even number is:"+ar[i]+" ");
	}
}
		System.out.println("\n");
	
}

private void evenNumber() {
	int[] ar = {10, 5, 7,8, 2, 6}; 
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==0) {
		System.out.println("This number is Even Number :"+ar[i]+" ");
		}
		
	}
	System.out.println("\n");
	
}

private void oddNumber() {
	int[] ar = {10, 5, 7,8, 2, 6}; 
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==1) {
			
		System.out.println("This number is odd Number :"+ar[i]+" ");
		}
		
	}	
	System.out.println("\n");
}

private void leftShift() {
	int ar[]= {10,5,8,3,2};
	int first=ar[0];
	System.out.println("Before left shift");
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
		}
	System.out.println();
	System.out.println("After left shift");
	for(int j=0;j<ar.length-1;j++) {
		ar[j]=ar[j+1];
		}
	ar[4]=first;
	for(int j=0;j<ar.length;j++) {
		System.out.print(ar[j]+" ");
	}
	System.out.println();
	System.out.println("Twice left shift");
	int first1=ar[0];
	
	for(int j=0;j<ar.length-1;j++) {
		ar[j]=ar[j+1];
		}
	ar[4]=first1;
	for(int j=0;j<ar.length;j++) {
		System.out.print(ar[j]+" ");
		
	}
	System.out.println("\n");
}

private void rightShift() {
	int ar[]= {10,5,8,3,2};
	
	int last=ar[4];
	
	System.out.println("Before Right Shift");
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
			}
for(int i=4;i>=1;i-- ) {
	ar[i]=ar[i-1];
	}	
ar[0]=last;
System.out.println();
System.out.println("After Right Shift");
for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]+" ");
}
int last1=ar[4];
for(int i=4;i>=1;i-- ) {
	ar[i]=ar[i-1];
	}	
ar[0]=last1;
System.out.println();
System.out.println("Twice Right Shift");
for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]+" ");
}

System.out.println("\n");
}


}


