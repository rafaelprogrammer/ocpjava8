package languageEnhancements;

public class TurkeyCage implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println(("Close gate"));
	}

	public static void main(String[] args) throws Exception {
		try(TurkeyCage turkeyCage = new TurkeyCage()){
			System.out.println("Puts turkeys in");
		}

	}

}
