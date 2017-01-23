package lambda.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestConstructor {

	public static void main(String[] args) {
		
		// Using an anonymous class
		Supplier<List<String>> s1 = new Supplier<List<String>>() {
		     public List<String> get() {
		         return new ArrayList<String>();
		     }
		};
		List<String> l1 = s1.get();
		System.out.println(l1);
		// Using a lambda expression
		Supplier<List<String>> s2 = () -> new ArrayList<String>();
		List<String> l2 = s2.get();
		System.out.println(l2);

		// Using a method reference
		Supplier<List<String>> s3 = ArrayList::new;
		List<String> l3 = s3.get();
		System.out.println(l3);
		
		// Using a anonymous class
		Function<String, Integer> f1 =
		     new Function<String, Integer>() {
		         public Integer apply(String s) {
		             return new Integer(s);
		         }
		};
		Integer i1 = f1.apply("100");
		System.out.println(i1);

		// Using a lambda expression
		Function<String, Integer> f2 = s -> new Integer(s);
		Integer i2 = f2.apply("100");
		System.out.println(i2);

		// Using a method reference
		Function<String, Integer> f3 = Integer::new;
		Integer i3 = f3.apply("100");
		System.out.println(i3);
		
		// Using a anonymous class
		BiFunction<String, String, Locale> f11 = new BiFunction<String, String, Locale>() {
		     public Locale apply(String lang, String country) {
		         return new Locale(lang, country);
		     }
		};
		Locale loc1 = f11.apply("en","UK");
		System.out.println(loc1);

		// Using a lambda expression
		BiFunction<String, String, Locale> f22 = (lang, country) -> new Locale(lang, country);
		Locale loc2 = f22.apply("en","UK");
		System.out.println(loc2);

		// Using a method reference
		BiFunction<String, String, Locale> f33 = Locale::new;
		Locale loc3 = f33.apply("en","UK");
		System.out.println(loc3);
		
	}
	
}
