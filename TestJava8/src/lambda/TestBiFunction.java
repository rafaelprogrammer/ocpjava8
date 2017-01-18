package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class TestBiFunction {

	public static void main(String[] args) {
		
		BiFunction<Double, Long,String> f = (d1,l1) -> {return String.valueOf(Math.round(d1+l1));};
		System.out.println(f.apply(5.6,5L));
		
		Function<String,String> fLowerCase = s1 -> s1.toLowerCase();
		
		System.out.println(f.andThen(fLowerCase).apply(6.6,5L));
		
		
		ToIntBiFunction<Double,Long> toIntBiFunction = (d,l) -> (int)(d+l);
		System.out.println(toIntBiFunction.applyAsInt(86.0, 9L));
		
		ToLongBiFunction<Double,Double> toLongBiFunction = (d1,d2) -> (long)(d1+d2);
		System.out.println(toLongBiFunction.applyAsLong(86.0, 9.6));
		
		ToDoubleBiFunction<Integer,Integer> toDoubleBiFunction = (i1,i2) -> (double)(i1+i2);
		System.out.println(toDoubleBiFunction.applyAsDouble(5, 6));
		
	}
	
}
