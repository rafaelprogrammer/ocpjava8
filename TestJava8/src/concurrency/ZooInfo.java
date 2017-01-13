package concurrency;

import java.util.concurrent.*;

public class ZooInfo {

	/**
	 * With a single-thread executor, results are guaranteed to be executed in
	 * the order in which they are added to the executor service. Notice that
	 * the end text is output while our thread executor tasks are still running.
	 * This is because the main() method is still an independent thread from the
	 * ExecutorService, and it can perform tasks while the other thread is
	 * running.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(() -> System.out.println("Printing zoo inventory"));
			service.execute(() -> {
				for (int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i);
			});
			service.execute(() -> System.out.println("Printing zoo inventory"));
			System.out.println("end");
			
			service.submit(new Thread("teste"));
			
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}