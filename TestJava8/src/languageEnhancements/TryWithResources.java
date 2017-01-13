package languageEnhancements;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			s.nextLine();
		}
		
		try(Scanner s = new Scanner(System.in)){
			s.nextLine();
		}catch (Exception e) {
			
		}finally {
			
		}

	}

}
