import java.util.Arrays;

public class smallestAndLargestNumInArray {

	public static void main(String[] args) {
		int []num= {12,3,43,54,-23,23,-2,532};
		int small=num[0];
		int large=num[0];
		
		for(int i=0;i<num.length;i++) {
			if (small>num[i]) {
				small=num[i];
			}
			else if(large<num[i]) {
				large=num[i];
			}
		}
		System.out.println("given array is :"+Arrays.toString(num));
		System.out.println("smallest element is :"+small);
		System.out.println("largest element is :"+large);
	}

}
