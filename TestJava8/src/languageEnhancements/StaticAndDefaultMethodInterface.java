package languageEnhancements;

public class StaticAndDefaultMethodInterface implements ITeste2 {

	@Override
	public void log() {
		System.out.println("Log normal");
	}
	
	public static void main(String[] args) {
		StaticAndDefaultMethodInterface s = new StaticAndDefaultMethodInterface();
		s.log();
		s.log("aa");
		ITeste.log(4);
		//ITeste2.log(4); nao compila tem que redefinir o metodo, mas nao e uma override
	}

}
