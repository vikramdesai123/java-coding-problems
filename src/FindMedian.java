//problem statement: find median of integer array
public class FindMedian {

	public double median(int [] arr)
    {
    
    int n = arr.length;
    
    if ( n % 2 == 1){
        return arr[n / 2];
    }else{
        return (arr[(n-1)/2] + arr[n/2])/2.0;
    }
    
    }   
	public static void main(String[] args) {
	    int [] arr = {10,20,30,40,50,60}; 
	    
	    FindMedian m = new FindMedian();
		System.out.println(m.median(arr));
	}

}
