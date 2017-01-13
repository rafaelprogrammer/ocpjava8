package languageEnhancements;

public interface ITeste {

	void log();
	default void log(String a){
		System.out.println("Executa default");
	}
	static void log(int x){
		System.out.println("Executa static");
	}
	//NAO COMPILA
	/*default boolean equals(Object o){
		
	}*/
	/*default int hashCode(){
		
	}*/
	/*default String toString(){
		
	}*/
	
}
