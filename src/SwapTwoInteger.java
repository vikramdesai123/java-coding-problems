
public class SwapTwoInteger {

	public static void main(String[] args) {
		//1.using third variable
		
		int x=10; int y=4;
		int temp;
		
		System.out.println("value of x before swaping:"+x);
		System.out.println("value of y before swaping:"+y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("value of x after swaping:"+x);
		System.out.println("value of y after swaping:"+y);
		
		
		//2.Without using third variable
		
		int a=10; int b=20;
		
		System.out.println("value of a before swaping:"+a);
		System.out.println("value of b before swaping:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swaping:"+a);
		System.out.println("value of b after swaping:"+b);
		
	}

}
