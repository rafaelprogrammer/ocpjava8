package lambda.reference;

import java.io.Serializable;
import java.util.function.Consumer;

public class TestInstanceMethodExistingObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Mechanic mechanic = new Mechanic();
		Car car = new Car();

		// Using an anonymous class
		execute(car, new Consumer<Car>() {
		     public void accept(Car c) {
		         mechanic.fix(c);
		     }
		});

		// Using a lambda expression
		execute(car, c -> mechanic.fix(c));

		// Using a method reference
		execute(car, mechanic::fix);

		Consumer<String> c = System.out::println;
		c.accept("Hello");
		
	}
	
	public static void execute(Car car, Consumer<Car> c) {
	     c.accept(car);
	}
	
	private static class Car {
		private int id;
		//private String color;

		public int getId() {
			return id;
		}

	}
	private static class Mechanic {
		public void fix(Car c) {
			System.out.println("Fixing car " + c.getId());
		}
	}
}
