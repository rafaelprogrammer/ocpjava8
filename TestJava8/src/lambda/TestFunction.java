package lambda;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

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
		
		LongToIntFunction longToIntFunction = l -> {return (int)l;};
		System.out.println(longToIntFunction.applyAsInt(999999999));
		
		
		DoubleFunction<String> doubleFunction = s -> {return "DoubleFunction: "+s;};
		System.out.println(doubleFunction.apply(5));
		
		DoubleToIntFunction doubleToIntFunction = d -> {return (int)(d+d);};
		System.out.println(doubleToIntFunction.applyAsInt(5.5));
		
		DoubleToLongFunction doubleToLongFunction = d -> {return (long)d;};
		System.out.println(doubleToLongFunction.applyAsLong(5656565555.9));
		
		ToIntFunction<String> toIntFunction = s -> {return new Integer(s);};
		System.out.println(toIntFunction.applyAsInt("59"));
		
		ToDoubleFunction<String> toDoubleFunction = s -> {return new Double(s);};
		System.out.println(toDoubleFunction.applyAsDouble("59.69"));
		
		ToLongFunction<String> toLongFunction = s -> {return new Long(s);};
		System.out.println(toLongFunction.applyAsLong("8969"));
		
	}
	
}
