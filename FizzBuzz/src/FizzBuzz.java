import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
	
	private final static String FIZZ = "Fizz"; 
	private final static String BUZZ = "Buzz"; 

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList();
		for (int i = 1; i <= 100 ;  i++) {
			array.add(i);
		}

		List<String> result = array.stream().map(x -> {return write(x);}).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

	public static boolean isMultiple3(int i) {
		return i%3 == 0;
	}

	public static boolean isMultiple5(int i) {
		return i%5 == 0;
	}

	public static String write(int i) {
		StringBuilder result = new StringBuilder();
		if (isMultiple3(i)) {
			result.append(FIZZ);
		} 
		if (isMultiple5(i)){
			result.append(BUZZ);
		} 
		if(result.length() == 0) {
			result.append(i);
		}
		return result.toString();
	}

}
