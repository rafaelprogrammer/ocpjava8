package languageEnhancements;

public class JammedTurkeyCage implements AutoCloseable {

	// RuntimeException
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {

		System.out.println("###1");
//		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//			System.out.println("put turkeys in");
//		} catch (IllegalStateException e) {
//			System.out.println("caught: " + e.getMessage());
//		}

		System.out.println("###2");
		try (JammedTurkeyCage t1 = new JammedTurkeyCage(); JammedTurkeyCage t2 = new JammedTurkeyCage()) {
			throw new IllegalStateException("turkeys entered cages");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
			for (Throwable t : e.getSuppressed())
				System.out.println(t.getMessage());
		}

		

		System.out.println("###3");
//		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//			throw new RuntimeException("turkeys ran off");
//		} catch (IllegalStateException e) {
//			System.out.println("caught: " + e.getMessage());
//		}
		
		System.out.println("###4");
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new IllegalStateException("turkeys ran off");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}
}