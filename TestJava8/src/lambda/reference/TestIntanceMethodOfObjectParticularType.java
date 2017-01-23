package lambda.reference;

public class TestIntanceMethodOfObjectParticularType {

	interface TriFunction<T, U, V, R> {
		R apply(T t, U u, V v);
	}

	public static void main(String[] args) {
		//anonymous class
		TriFunction<Sum, String, String, Integer> anon = new TriFunction<Sum, String, String, Integer>() {
			@Override
			public Integer apply(Sum s, String arg1, String arg2) {
				return s.doSum(arg1, arg1);
			}
		};
		System.out.println(anon.apply(new Sum(), "1", "4"));

		//lambda expression
		TriFunction<Sum, String, String, Integer> lambda = (Sum s, String arg1, String arg2) -> s.doSum(arg1, arg1);
		System.out.println(lambda.apply(new Sum(), "1", "4"));

		//method reference
		TriFunction<Sum, String, String, Integer> mRef = Sum::doSum;
		System.out.println(mRef.apply(new Sum(), "1", "4"));
	}
}
