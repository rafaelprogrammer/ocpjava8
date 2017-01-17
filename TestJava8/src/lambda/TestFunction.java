package lambda;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class TestFunction {

	public static void main(String[] args) {
		Function<Double, Long> f = d -> {return Math.round(d);};
		System.out.println(f.apply(5.6));
		
		Function<String, String> fUpperCase = s -> {return s.toUpperCase();};
		Function<String, String> fLowerCase = s -> {return s.toLowerCase();};
		
		System.out.println(fUpperCase.compose(fLowerCase).apply("Compose"));
		System.out.println(fUpperCase.andThen(fLowerCase).apply("AndThen"));
		
		
		System.out.println(Function.identity().compose(fUpperCase).apply("Teste"));
		
		IntFunction<String> intFuncion = s -> {return "IntFunction: "+s;};
		System.out.println(intFuncion.apply(5));
		
		IntToDoubleFunction intToDoubleFunction = d -> {return d+d;};
		System.out.println(intToDoubleFunction.applyAsDouble(5));
		
		IntToLongFunction intToLongFunction = l -> {return l+898989895;};
		System.out.println(intToLongFunction.applyAsLong(5));
		
		LongFunction<String> longFunction = s -> {return "LongFunction: "+s;};
		System.out.println(longFunction.apply(898989859));
		
		LongToDoubleFunction longToDoubleFunction = l -> {return l+l;};
		System.out.println(longToDoubleFunction.applyAsDouble(898989859));
		
		LongToIntFunction longToIntFunction = l -> {
			return (int)l;
		};
		System.out.println(longToIntFunction.applyAsInt(999999999));
		
		
		
		
		 
		
		
	}
	
}
