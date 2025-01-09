//problem statement: count total number of words in given string

import java.util.Arrays;

public class countWordsOfString_Java8 {

	public static void main(String[] args) {
		String str = "my name is vikram desai";
		
		long totalCount = Arrays.stream(str.split("\\s+")).count();
		System.out.println(totalCount);

	}

}
