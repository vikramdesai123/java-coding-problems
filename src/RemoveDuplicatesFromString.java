//problem statement : Remove duplicate characters from string
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String str = "my name is vikram desai";
		
		System.out.println(removeDuplicateChar(str));
		
	}
	
	public static String removeDuplicateChar(String str) {
		
		Set< Character> set = new HashSet<>();
		StringBuffer br = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			Character ch = str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				br.append(ch);
			}
		}
		
		return br.toString();
	}
}
