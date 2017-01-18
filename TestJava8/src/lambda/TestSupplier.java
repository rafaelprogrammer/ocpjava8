package lambda;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		String t = "one";
		Supplier<String> supplierString = () -> t.toUpperCase();
		System.out.println("Supplier: "+supplierString.get());
		
		boolean isTrue = true;
		BooleanSupplier booleanSupplier = () -> !isTrue;
		System.out.println("BooleanSupplier: "+booleanSupplier.getAsBoolean());
		
		int i = 0;
		IntSupplier intSupplier = () -> i+2;
		System.out.println("IntSupplier: "+intSupplier.getAsInt());
		
		long l = 0L;
		LongSupplier longSupplier = () -> l+2;
		System.out.println("LongSupplier: "+longSupplier.getAsLong());
		
		double d = 0;
		DoubleSupplier doubleSupplier = () -> d+2;
		System.out.println("DoubleSupplier: "+doubleSupplier.getAsDouble());
	}
}
