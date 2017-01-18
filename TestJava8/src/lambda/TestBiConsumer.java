package lambda;

import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		BiConsumer<String,String> consumeStr = (s1,s2) -> System.out.println(s1+" "+s2);
		consumeStr.accept("Hi","Hello");

		BiConsumer<String, String> first = (t,u) -> System.out.println(t.toUpperCase() + u.toUpperCase());
		BiConsumer<String, String> second = (t,u) -> System.out.println(t.toLowerCase() + u.toLowerCase());
		first.andThen(second).accept("Again", " and again");
		
		int[] a = {1,2,3,4,5,6,7,8};
		printListInt(a, (t,u) -> System.out.println(t+ " "+u));
		
		long[] l = {1L,2L,3L,4L,5L,6L,7L,8L};
		printListLong(l, (t,u) -> System.out.println(t+ " "+u));
		
		double[] d = {1.5,2.9,3.4,4.5,5,2,6.6,7.0,8.0};
		printListDouble(d, (t,u) -> System.out.println(t+ " "+u));
		
	}
	
	static void printListInt(int[] a, ObjIntConsumer<String> c) {
	     for(int i : a) {
	         c.accept("Imprime int: ",i);
	     }
	}
	
	static void printListLong(long[] a, ObjLongConsumer<Boolean> c) {
	     for(long i : a) {
	         c.accept(true,i);
	     }
	}
	
	static void printListDouble(double[] a, ObjDoubleConsumer<Character> c) {
	     for(double i : a) {
	         c.accept('C',i);
	     }
	}

}