package concurrency;

public class CheckResults {

	private static int counter=0;
	
	public static void main(String[] args) {
		new Thread(() ->{
			for(int i=0;i<5;i++){
				CheckResults.counter ++;
			}
		});
		
		while(CheckResults.counter < 3){
			System.out.println("Not reached yet");
		}
		
		System.out.println("Reached!");
	}
	
}
