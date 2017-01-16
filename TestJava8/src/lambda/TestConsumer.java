package lambda;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> consumeStr = t -> System.out.println(t);
		consumeStr.accept("Hi");

		Consumer<String> first = t -> System.out.println("First:" + t);
		Consumer<String> second = t -> System.out.println("Second:" + t);
		first.andThen(second).accept("Hi");
		
		int[] a = {1,2,3,4,5,6,7,8};
		printListInt(a, t -> System.out.println(t));
		
		long[] l = {1L,2L,3L,4L,5L,6L,7L,8L};
		printListLong(l, t -> System.out.println(t));
		
		double[] d = {1.5,2.9,3.4,4.5,5,2,6.6,7.0,8.0};
		printListDouble(d, t -> System.out.println(t));
		
	}
	
	static void printListInt(int[] a, IntConsumer c) {
	     for(int i : a) {
	         c.accept(i);
	     }
	}
	
	static void printListLong(long[] a, LongConsumer c) {
	     for(long i : a) {
	         c.accept(i);
	     }
	}
	
	static void printListDouble(double[] a, DoubleConsumer c) {
	     for(double i : a) {
	         c.accept(i);
	     }
	}

}
