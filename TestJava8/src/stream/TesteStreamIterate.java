package stream;

import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStreamIterate {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.iterate(2, new UnaryOperator<Integer>() {
		    @Override
		    public Integer apply(Integer t) {
		        return t * 2; }
		}).limit(5);
		System.out.println(s.collect(Collectors.toList()));
		
		Stream<Integer> s1 = Stream.iterate(1, t -> t * 2).limit(5);
		System.out.println(s1.collect(Collectors.toList()));
	}
}
