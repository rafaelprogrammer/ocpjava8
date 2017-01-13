package teste;

import languageEnhancements.ITeste;
import languageEnhancements.StaticAndDefaultMethodInterface;

public class TestInterfaceMethodDefault implements ITeste {

	@Override
	public void log() {
		System.out.println("Log normal");
	}
	
	public static void main(String[] args) {
		StaticAndDefaultMethodInterface s = new StaticAndDefaultMethodInterface();
		s.log();
		s.log("aa"); 
		ITeste.log(4);
		
		TestInterfaceMethodDefault t = new TestInterfaceMethodDefault();
		t.log();
		t.log("sss");
	}

}
