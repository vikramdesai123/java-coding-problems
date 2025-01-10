import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepeatedStringChar {

	public static void main(String[] args) {
		String str = "abbaccd";
		char val = getFirstNonRepeatedChar( str);
		System.out.println(val);

	}
	
	public static char getFirstNonRepeatedChar(String str) {
		
		Map<Character, Integer> countMap = new LinkedHashMap<Character,Integer>(str.length());
		
		for(char ch:str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch)?countMap.get(ch)+1 : 1);		
		}
		
		for(Entry<Character,Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("value did not found!!");
	}

}
