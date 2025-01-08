
public class reverseDigit {

	public static void main(String[] args) {
		long num=12345;
		System.out.println("original number: "+num );
		long revNum=0;
		while(num>0) {
			long digit=num%10;
			revNum=(revNum*10)+digit;
			num=num/10;
		}
		System.out.println("number after reversing: "+revNum);

	}

}
