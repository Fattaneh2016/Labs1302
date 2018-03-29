import java.util.Arrays;


public class Lab11DifferentSort {


	public static void main(String[] args) {

		int[] a={3,5,9,2,90,6,17};

		System.out.println("selectionSort " +  Arrays.toString(a));
		selectionSort(a);
		System.out.println("selectionSort " + Arrays.toString(a));
		System.out.println();

		
		int[] b={30,15,9,2,900,6,107};
		
		System.out.println("bubbleSort " + Arrays.toString(b));		
		bubbleSort(b);
		System.out.println("bubbleSort " + Arrays.toString(b));
		
		System.out.println();
		
		int[] c={13,54,98,2,90,6,1,17};
		
		System.out.println("insertionSort " + Arrays.toString(c));	
		insertionSort(c);	
		System.out.println("insertionSort "+ Arrays.toString(c));

	}

	public static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++){
			int j=i-1;
			int temp=a[i];
			while(j>=0 && temp<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}

	}

	public static void bubbleSort(int[] a) {

		for(int i=0;i<a.length ;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]<a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}


			}
		}

	}

	public static void selectionSort(int[] a) {

		for (int i=0 ; i<=a.length-1;i++){
			int max=i;

			for(int j=i+1;j<a.length;j++){

				if(a[max]<a[j]){
					max=j;
				}

			}
			swap(a,i,max);
		}
	}

	private static void swap(int[] a, int i, int max) {

		if(i!=max){
			int temp=a[i];
			a[i]=a[max];
			a[max]=temp;
		}


	}

}
