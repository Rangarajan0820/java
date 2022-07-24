package cheannai;
public class SimpleProgram {
public static void main(String args[]) {
	SimpleProgram sp=new SimpleProgram();
	//sp.first();
	//sp.rightShift();
	//sp.rightShift1();
	sp.rightShift2();
	//sp.leftShift();
    //sp.leftShift2();
	//sp.leftShift3();
}

private void leftShift3() {
	int ar[]= {100,200,300,400,500,600};
	    //index 0    1   2  3   4    5
	int first=ar[0];
	System.out.println("Before left Shift");
for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]+" ");
	}
for(int j=0;j<ar.length-1;j++) {
	ar[j]=ar[j+1];
}
	ar[5]=first;
	System.out.println();
	System.out.println("After left Shift");
for(int k=0;k<ar.length;k++) {
	System.out.print(ar[k]+" ");
		}

}



private void rightShift2() {
	int ar[]= {12,13,14,15,16};
             // 0  1  2  3  4	
	int last=ar[4];
	
	System.out.println("Right shift before");
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
		}
	System.out.println();
	for(int j=4;j>=1;j--) {
		ar[j]=ar[j-1];
		}
	ar[0]=last;
	System.out.println("after Right Shift");
	for(int k=0;k<ar.length;k++) {
		System.out.print(ar[k]+" ");
	}
	System.out.println("\n");
}

private void rightShift1() {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int first=a[9];
	System.out.println();
	System.out.println("Before right Shifting");
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
	for(int j=9;j>=1;j--) {
		a[j]=a[j-1];
		
	}
a[0]=first;
System.out.println();
System.out.println("After Right shifting");
for(int j=0;j<a.length;j++) {
	System.out.print(a[j]+" ");
	
}
System.out.println("\n");
}

private void leftShift2() {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int first=a[0];
	System.out.println("Shifting before");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	for(int j=0;j<a.length-1;j++) {
		a[j]=a[j+1];
		
	}
	a[a.length-1]=first;
	
	System.out.println();
	System.out.println("Shifting after Array");
	for(int j=0;j<a.length;j++) {
		System.out.print(a[j]+" ");
		}
	System.out.println("\n");
}

private void leftShift() {
	//value=5; 1  2  3  4  5
	int ar[]= {34,45,12,20,5};
    //index=4; 0  1  2   3  4
	int temp=ar[0];
	System.out.println();
	System.out.println("Before left Shift ");
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	
	for(int i=0;i<ar.length-1;i++) {
		ar[i]=ar[i+1];
		
		
	}
	ar[ar.length-1]=temp;
	System.out.println();
	System.out.println("After left shift");
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	
	
	System.out.println("\n");
	}
	
	


private void rightShift() {
             //1 2	3  4  5  6 value=6;
	int []ar= {5,10,15,20,25,8};
             //0 1  2  3  4  5	index=5;
	System.out.println();
	System.out.println("Before Right Shift");
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
		
	}
	
	int temp=ar[5];
		for(int i=5;i>=1;i--) {
			ar[i]=ar[i-1];
		}
		ar[0]=temp;
		System.out.println();
		System.out.println("After Right Shift");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("\n");
}

private void first() {
	int marks[]=new int[5];
	marks[0]=55;
	marks[1]=45;
	marks[2]=100;
	marks[3]=98;
	marks[4]=50;
	for(int i=0;i<marks.length;i++) {
		System.out.println("Students marks is:"+marks[i]);
		
	}
	System.out.println("\n");
	
}
}
