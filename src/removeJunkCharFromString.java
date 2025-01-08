
public class removeJunkCharFromString {

	public static void main(String[] args) {
		String username="vikramdesai@#$ ^&*^123";
		System.out.println("string with junk character: "+username);
		
		username=username.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("string without junk character: "+username);

	}

}
