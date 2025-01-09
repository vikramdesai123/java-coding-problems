//problem statement :  different ways to print array element

import java.util.Arrays;
import java.util.stream.Stream;

public class printArrayElement {

	public static void main(String[] args) {
		String [] arr = {"one","two","three","four"};
		Arrays.asList(arr).forEach(ele-> System.out.println(ele));//first way
		
		Arrays.asList(arr).forEach(System.out::println);//second way
		
		Stream.of(arr).forEach(element->System.out.println(element));//third way
		
		//fourth way
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//fifth way
		for(String ele:arr) {
			System.out.println(ele);
		}
		
		//sixth way
		System.out.println(Arrays.toString(arr));
		
	}

}
