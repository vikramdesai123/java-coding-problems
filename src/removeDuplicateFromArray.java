import java.util.HashSet;
import java.util.Set;

public class removeDuplicateFromArray {
	public static void main(String[] args) {
		String [] subject= {"c","python","java","c++","c#","python","golang","c#"};
		
		//using looping concept(time complexity--->[O(n2)])
		for(int i=0;i<subject.length;i++) {
			for(int j=i+1;j<subject.length;j++) {
				if(subject[i].equals(subject[j])) {
					System.out.println("Duplicate valuea are:"+subject[i]);
				}
			}
		}
		
		System.out.println("***************************");
		
		//using hashSet concept(time complexity--->[O(n)])
		Set<String> hs=new HashSet<String>();
		for(String name:subject) {
			if (hs.add(name)==false) {
				System.out.println("Duplicate valuea are:"+name);
			}
		}
	}
}