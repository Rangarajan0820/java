package cheannai;

public class ArraySorting {
	public static void main(String args[]) {
		ArraySorting as = new ArraySorting();
		//as.ascendingOrder();
		//as.ascendingOrder1();
		//as.decendingOrder();
		//as.decendingOrder1();
//as.ascendingOrder2();
as.decendingOrder2();
	}

	private void decendingOrder2() {
		int ar[]= {450,55,75,95,105};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			}
		System.out.println();
		for(int i=1;i<ar.length;i++) {
			for(int j=0;j<ar.length-i;j++) {
				if(ar[j]<ar[j+1]) {
					int tem=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=tem;
							}
				
			}
			
		}
	
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

	private void ascendingOrder2() {
		int ar[]= {450,55,75,95,105};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
		for(int i=1;i<ar.length;i++) {
			for(int j=0;j<ar.length-i;j++) {
				if(ar[j]>ar[j+1]) {
					int tem=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=tem;
					
				}
				
			}
			
		}
				for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
	}

	private void decendingOrder1() {
		System.out.println("Decending Order");
		int ar[] = { 123, 133, 144, 155, 166 };
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i; j++) {
				if (ar[j] < ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;

				}

			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
		System.out.println("\n");
	}

	private void decendingOrder() {
		System.out.println("Decending Order");
		int ar[] = { 100, 200, 300, 400, 500 };
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i; j++) {
				if (ar[j] < ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;

				}

			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
		System.out.println("\n");
	}

	private void ascendingOrder1() {
		System.out.println("Ascending Order");
		int ar[] = { 500, 400, 300, 200, 100 };
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("\n");
	}

	private void ascendingOrder() {
		System.out.println("Ascending Order");
		int ar[] = { 12, 10, 7, 3 };
		for (int j = 1; j < ar.length; j++) {
			for (int i = 0; i < ar.length - j; i++) {
				if (ar[i] > ar[i + 1]) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}

			}
		}
		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);
		}
		System.out.println("\n");
	}

}
