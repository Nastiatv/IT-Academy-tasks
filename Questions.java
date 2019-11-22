
import java.util.stream.IntStream;


public class Questions {
	public static void main(String[] args) {
		
		
		
		
		
		
		
			int product = IntStream.range(0, 10)
				    .filter(x -> x++ % 4 == 0)
				    .reduce((acc, x) -> acc * x)
				    .getAsInt();
			
			System.out.print(product);
			
			
			
			
			
			// 0
			
			
			/*Map<Character, String> map3 = Stream.of(50, 54, 55)
				    .collect(Collectors.toMap(
				        i -> (char) i.intValue(),
				        i -> String.format("<%d>", i)
				    ));
			System.out.println(map3);*/
				// {'2'="<50>", '6'="<54>", '7'="<55>"}
			
			
		}}
