//problem statement: Reverse string by words


public class ReverseWordsOfString {

	public static void main(String[] args) {
		String str = "my name is vikram desai";
		
		String [] strArray = str.split(" ");
		
		for(int i= strArray.length-1; i>=0; i--) {
			System.out.print(strArray[i]+" ");
		}

	}

}
