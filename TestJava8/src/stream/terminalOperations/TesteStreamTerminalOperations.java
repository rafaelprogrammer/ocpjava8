package stream.terminalOperations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStreamTerminalOperations {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("aa","ss","xx","bb","yy","hh","zz");
		System.out.println("allMatch: "+s1.allMatch(p -> p.length() > 1));
		
		Stream<String> s2 = Stream.of("a","ss","x","b","y","hh","zz");
		System.out.println("anyMatch: "+s2.anyMatch(p -> p.length() > 1));
		
		Stream<String> s3 = Stream.of("a","s","x","b","y","h","z");
		System.out.println("noneMatch: "+s3.noneMatch(p -> p.length() > 1));
		
		Stream<String> s4 = Stream.of("aa","ss","xx","bb","yy","hh","zz");
		System.out.println("findAny: "+s4.findAny().get());
		
		Stream<String> s5 = Stream.of("aa","ss","xx","bb","yy","hh","zz");
		System.out.println("findFirst: "+s5.findFirst().get());
		
		Stream<String> s6 = Stream.of("aa","ss","xx","bb","yy","hh","zz");
		System.out.println("list collect: "+s6.collect(Collectors.toList()));
		
		Stream<String> s7 = Stream.of("aa","ss","xx","bb","yy","hh","zz");
		s7.forEach(c -> System.out.println("forEach: "+c));
	}
	
}
