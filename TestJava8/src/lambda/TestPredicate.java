package lambda;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		Predicate<String> startsWithA = t -> t.startsWith("A");
		boolean result = startsWithA.test("Arthur");
		System.out.println("### startsWithA: "+result);
		
		Predicate<String> predicateNegative = startsWithA.negate();
		System.out.println("### startsWithA (NEGATIVE): "+predicateNegative.test("A"));
		
		Predicate<String> endsWithA = t -> t.endsWith("A");
		result = startsWithA.and(endsWithA).test("Arthur");
		System.out.println("### endsWithA (AND): "+result);
		
		
		result = startsWithA.or(endsWithA).test("Arthur");
		System.out.println("### endsWithA (OR): "+result);
		
		Predicate<String> predicateEquals = Predicate.isEqual("A");
		System.out.println("### startsWithA (EQUALS): "+predicateEquals.test("A"));
		
		
		IntPredicate intPredicate = t -> t % 2 == 1;
		result = intPredicate.test(5);
		System.out.println("### intPredicate: "+result);
		
		LongPredicate longPredicate = t -> t % 2 == 0;
		result = longPredicate.test(5L);
		System.out.println("### longPredicate: "+result);
		
		DoublePredicate doublePredicate = t -> t % 2.5 == 0.0;
		result = doublePredicate.test(5.9);
		System.out.println("### doublePredicate: "+result);
		
	}
	
}
