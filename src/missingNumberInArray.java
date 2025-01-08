
public class missingNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8,9};
		int expectedSum=9*(9+1)/2;//formula is: n*(n+1)/2
		System.out.println("Expected sum is: "+expectedSum);
		
		int actualSum=0;
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		System.out.println("Actual sum is: "+actualSum);
		
		System.out.println("Missing number is: "+(expectedSum-actualSum));

	}

}
