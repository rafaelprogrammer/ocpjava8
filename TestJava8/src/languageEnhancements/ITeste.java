package languageEnhancements;

public interface ITeste {

	void log();
	default void log(String a){
		System.out.println("Executa default");
	}
	static void log(int x){
		System.out.println("Executa static");
	}
	
}
