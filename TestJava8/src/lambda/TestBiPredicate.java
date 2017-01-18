package lambda;

import java.util.function.BiPredicate;

public class TestBiPredicate {

	public static void main(String[] args) {
		BiPredicate<String,String> biPredicateEquals = (s1,s2) -> s1.equals(s2);
		boolean result = biPredicateEquals.test("Arthur","Arthur");
		System.out.println("### biPredicateEquals: "+result);
		
		BiPredicate<String,String> predicateNegative = biPredicateEquals.negate();
		System.out.println("### biPredicateEquals (NEGATIVE): "+predicateNegative.test("A","A"));
		
		BiPredicate<String,String> biPredicateAnd = (s1,s2) -> s1.equals(s2);
		result = biPredicateEquals.and(biPredicateAnd).test("Arthur","Selva");
		System.out.println("### biPredicateAnd (AND): "+result);
		
		result = biPredicateEquals.or(biPredicateAnd).test("Arthur","Arthur");
		System.out.println("### biPredicateOr (OR): "+result);
	}
}
