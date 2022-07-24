package cheannai;
public class BinarySearch {
public static void main(String args[]) {
	BinarySearch bs=new BinarySearch();
	//bs.search();
	//bs.search1();
	bs.search2();
}

private void search2() {
int ar[]= {120,99,88,77,66,55,44,33,22,11};
int key=120;
int s=0,end=ar.length-1;
int mid=(s+end)/2;
while(s<=ar[end]) {
	
if(key==ar[mid]) {
	System.out.println("Key present in "+ar[mid]);
	break;
}
else if(ar[mid]>key) {
	s=mid-1;
}
else if(ar[mid]<key) {
	s=mid+1;
}

}
	
}

private void search1() {
	int ar[]= {1,22,33,44,55,66,77,88,99,120};
	int key=77;
	int s=0,end=ar.length-1;
	for(int i=0;i<ar.length;i++) {
while(s<=ar[end]) {
	int mid=(s+end)/2;
	
 if(key==ar[mid]) {
	 System.out.println("key is prsent in index  : "+ar[mid]);
	 break;
 }
 else if(key>=ar[mid]) {
s=mid-1;
	
}
 else if(key<=ar[mid]) {
 s=mid+1;
 }
 

	}

	}
}

private void search() {
	int ar[]= {1,22,33,44,55,66,77,88,99,100};
	int key=55;
	int s=0,end=ar.length-1;
	while(s<=end) {
		int mid=(s+end)/2;
		if(key==ar[mid]) {
			System.out.println("Key is present  at :"+ar[mid]);
		break;
		}
		else if(key>=ar[mid]) {
			s=mid-1;
				}
		else if(key<=ar[mid]) {
s=mid+1;
		}		
	}
	
}
}
