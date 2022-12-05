package apk82_lab10;

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,8,9};
		//System.out.println(sumOfDigits(8));
		printArray(a,6);
	}
	//recursive function to find sum of digits
	public static int sumOfDigits(int x) {
		int temp;
		//check if input is negative and set temp to the input, then check if input is 0(meaning we found answer), then if neither is true set temp to input
		if(x<0) {
			temp = x*-1;
		}else if(x==0){
			return 0;
		}else {
			temp = x;
		}
		return (temp%10+sumOfDigits(temp/10));
	}
	//recursive function that prints elements of an array, one per line
	public static void printArray(int a[], int index) {
		if(index<=0) {
			return;
		}
		System.out.println(a[index-1]);
		printArray(a,index-1);
	}

}
