//problem statement: find fibonnaci series

public class Fibbonacci {

	public static void main(String[] args) {
		int n = 10;
		int first = 0;
		int second = 1;
		
		for (int i=1;i<=10;i++) {
			System.out.print(first+",");
			
			int nextNum = first + second;
			first = second;
			second = nextNum;
		}

	}

}
