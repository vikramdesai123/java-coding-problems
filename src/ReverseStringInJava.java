
public class ReverseStringInJava {

	public static void main(String[] args) {
		String name="vikram desai";
		int l=name.length();
		String revName="";
		
		System.out.println("Original string: "+name);
		for(int i=l-1;i>=0;i--) {
			revName=revName+name.charAt(i);
		}
		System.out.println("string after revrsing: "+revName);
	}

}
