package stream;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamGenerate {

	
	public static void main(String[] args) {
		
		Stream<Double> s = Stream.generate(new Supplier<Double>() {
		    public Double get() {
		        return Math.random();
		    }
		}).limit(5);
		System.out.println(s.collect(Collectors.toList()));
		
		Stream<Double> s2 = Stream.generate(() -> Math.random()).limit(2);
		System.out.println(s2.collect(Collectors.toList()));
		
		Stream<Double> s3 = Stream.generate(Math::random).limit(5);
		System.out.println(s3.collect(Collectors.toList()));
		
	}
}
