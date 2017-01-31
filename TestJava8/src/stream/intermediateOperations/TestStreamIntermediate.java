package stream.intermediateOperations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamIntermediate {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("m", "k", "c", "t","c","t");
		s = s.distinct();
		System.out.println("distinct: "+ s.collect(Collectors.toList()));
		
		Stream<String> s1 = Stream.of("m", "k", "c", "t","c","t");
		s1 = s1.filter(f -> f.equals("c"));
		System.out.println("filter: "+ s1.collect(Collectors.toList()));
		
		//to convert Stream<String[]> to Stream<String>.
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        System.out.println("flatMap: "+ stringStream.collect(Collectors.toList()));
        
        Stream<String> s2 = Stream.of("m", "k", "c", "t","c","t");
		s2 = s2.limit(3);
		System.out.println("limit: "+ s2.collect(Collectors.toList()));
		
		Stream<String> s3 = Stream.of("m", "k", "c", "t","c","t");
		s3 = s3.map(m -> "letra: "+m);
		System.out.println("map: "+ s3.collect(Collectors.toList()));
		
		Stream<String> s4 = Stream.of("m", "k", "c", "t","c","t");
		s4 = s4.map(m -> "letra: " + m)
				.peek(c -> System.out.println("Peek Map " + c))
				.filter(f -> f.contains("c"))
				.peek(c -> System.out.println("Peek Filter " + c));
		System.out.println("peek: "+ s4.collect(Collectors.toList()));
		
		Stream<String> s5 = Stream.of("m", "k", "c", "t","c","t");
		s5 = s5.map(m -> "letra: " + m)
				.peek(c -> System.out.println("Peek skip Map " + c))
				.skip(5)
				.peek(c -> System.out.println("Peek skip " + c));
		System.out.println("skip: "+ s5.collect(Collectors.toList()));
		
		Stream<String> s6 = Stream.of("m", "k", "c", "t","c","t");
		s6 = s6.sorted();
		System.out.println("sorted: "+ s6.collect(Collectors.toList()));
		
		Stream<String> s7 = Stream.of("m", "k", "c", "t","c","t");
		s7 = s7.sorted((l1,l2) -> l2.compareTo(l1));
		System.out.println("sorted comparator: "+ s7.collect(Collectors.toList()));
		
		Stream<String> s8 = Stream.of("m", "k", "c", "t","c","t");
		Stream<String> s9= s8.parallel();
		System.out.println("parallel: "+ s9.collect(Collectors.toList()));
		
		Stream<String> s10 = Stream.of("m", "k", "c", "t","c","t");
		s10= s10.sequential();
		System.out.println("sequential: "+ s10.collect(Collectors.toList()));
		
		Stream<String> s11 = Stream.of("x", "c", "c", "d","e","f");
		s11= s11.unordered();
		System.out.println("unordered: "+ s11.collect(Collectors.toList()));
		
	}
}
