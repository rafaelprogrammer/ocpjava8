package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class TestBinaryOperator {

	public static void main(String[] args) {
		BinaryOperator<String> f = (t, s) -> t.concat(s);
		System.out.println(f.apply("Teste", "Agora"));

		Function<String, String> fLowerCase = s1 -> s1.toLowerCase();

		System.out.println(f.andThen(fLowerCase).apply("Teste", "Agora"));

		BinaryOperator<Integer> biOp = BinaryOperator.maxBy(Comparator.naturalOrder());
		System.out.println(biOp.apply(28, 8));
		
		BinaryOperator<Integer> biOp2 = BinaryOperator.minBy(Comparator.naturalOrder());
		System.out.println(biOp2.apply(28, 8));

		IntBinaryOperator intBinaryOperator = (t,i) -> t+i;
		System.out.println("IntBinaryOperator: " + intBinaryOperator.applyAsInt(5,5));

		LongBinaryOperator longBinaryOperator = (t,l) -> t+l;
		System.out.println("LongBinaryOperator: " + longBinaryOperator.applyAsLong(565656565656L,565656565657L));

		DoubleBinaryOperator doubleBinaryOperator = (t,d) -> t+d;
		System.out.println("DoubleUnaryOperator: " + doubleBinaryOperator.applyAsDouble(5.6,9.6));
	}

}
