package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStreamBuilder {
	public static void main(String[] args) {
		Stream.Builder<String> builder = Stream.<String> builder().add("h").add("e").add("l").add("l");
		builder.accept("o");
		Stream<String> s = builder.build();
		System.out.println(s.collect(Collectors.toList()));
	}
}
