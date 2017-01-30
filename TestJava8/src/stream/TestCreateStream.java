package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestCreateStream {

	
	public static void main(String[] args) {
		//1
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		Stream<String> stream = words.stream();
		System.out.println(stream.collect(Collectors.toList()));
		
		//2
		Stream<String> stream2 = Stream.of("hello","hola", "hallo", "ciao");
		System.out.println(stream2.collect(Collectors.toList()));
		
		//3
		String[] words2 = {"hello", "hola", "hallo", "ciao"};
		Stream<String> stream3= Stream.of(words2);
		System.out.println(stream3.collect(Collectors.toList()));
		
		//Importante
		int[] nums = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(nums).count());//print 1
		
		Integer[] nums1 = {1, 2, 3, 4, 5};
		// It prints 5!
		System.out.println(Stream.of(nums1).count());
		
		int[] nums2 = {1, 2, 3, 4, 5};
		// It also prints 5!
		System.out.println(Arrays.stream(nums2).count());
		
		int[] nums3 = {1, 2, 3, 4, 5};
		// It also prints 5!
		System.out.println(IntStream.of(nums3).count());
		
	}
}
