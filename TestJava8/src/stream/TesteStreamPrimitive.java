package stream;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TesteStreamPrimitive {

	public static void main(String[] args) {
		// stream of 1, 2, 3
		IntStream s = IntStream.range(1, 4);
		System.out.println(s.boxed().collect(Collectors.toList()));
		// stream of 1, 2, 3, 4
		IntStream s2 = IntStream.rangeClosed(1, 4);
		System.out.println(s2.boxed().collect(Collectors.toList()));

		IntStream s3 = new Random().ints(5, 1, 10);
		System.out.println(s3.boxed().collect(Collectors.toList()));

		// stream of 1, 2, 3
		LongStream l = LongStream.range(1, 4);
		System.out.println(l.boxed().collect(Collectors.toList()));
		// stream of 1, 2, 3, 4
		LongStream l2 = LongStream.rangeClosed(1, 4);
		System.out.println(l2.boxed().collect(Collectors.toList()));

		LongStream l3 = new Random().longs(5, 1, 10);
		System.out.println(l3.boxed().collect(Collectors.toList()));

		DoubleStream d3 = new Random().doubles(5, 1, 10);
		System.out.println(d3.boxed().collect(Collectors.toList()));

	}

}
