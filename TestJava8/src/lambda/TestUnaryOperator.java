package lambda;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<String> f = s -> s.substring(0,2);
		System.out.println(f.apply("Teste"));
		
		UnaryOperator<String> fUpperCase = s -> {return s.toUpperCase();};
		UnaryOperator<String> fLowerCase = s -> {return s.toLowerCase();};
		
		System.out.println(fUpperCase.compose(fLowerCase).apply("Compose"));
		System.out.println(fUpperCase.andThen(fLowerCase).apply("AndThen"));
		
		
		System.out.println(UnaryOperator.identity().compose(fUpperCase).apply("Teste"));
		
		IntUnaryOperator intUnaryOperator = i -> i+2;
		System.out.println("IntUnaryOperator: "+intUnaryOperator.applyAsInt(5));
		
		LongUnaryOperator longUnaryOperator = l -> l+2;
		System.out.println("LongUnaryOperator: "+longUnaryOperator.applyAsLong(565656565656L));
		
		DoubleUnaryOperator doubleUnaryOperator = d -> d+2.5;
		System.out.println("DoubleUnaryOperator: "+doubleUnaryOperator.applyAsDouble(5.6));
	}
	
}
