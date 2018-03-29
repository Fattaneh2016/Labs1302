import java.util.Arrays;


public class Java2lab10 {


	public static void main(String[] args) {
		int[] myArray={2,4,5,78,9};
		System.out.println("Sequential " + searchSequential(myArray,4));

		//Binary Search
		int[] myArray1={23,141,5,78,90};
		Arrays.sort(myArray1);
		
		System.out.println("Binary " +  searchBinary(myArray1,141));

		//Recursive Binary Search
		int[] myArray2={2,5,8,6,89,78,9};
		Arrays.sort(myArray2);
		
		System.out.println(" Recursive Binary " + searchRecursiveBinary(myArray2, 6, 0, 7));

	}

	public static int searchSequential(int[]  myArray ,int target) {

		for(int i=0 ;i<myArray.length;i++){
			if(myArray[i]==target){
				return i;
			}
		}
		return -1;
	}
	public static int searchBinary(int[] myArray ,int target){

		int min=0;
		int max=myArray.length-1;


		while( min<=max) {
			int mid=(max+min)/2;


			if(myArray[mid]< target){
				min=mid+1;
			}else if (myArray[mid]> target){
				max=min-1;
			}else{
				return mid;
			}
		}
		return -(min+1);
	}

	public static int searchRecursiveBinary(int[] myArray ,int target,int min,int max){

		if(min>max){
			return -1;
		}else{
			int mid=(min+max)/2;
			if(myArray[mid]< target){
				return searchRecursiveBinary(myArray,target,mid+1,max);
			}else if (myArray[mid]> target){
				return searchRecursiveBinary(myArray,target,min, mid-1);
			}else{
				return mid;
			}	

		}
	}
}
