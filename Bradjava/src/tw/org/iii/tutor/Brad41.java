package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.nio.channels.FileLock;

public class Brad41 {

	public static void main(String[] args) {
		Brad411 obj = new Brad411();
		obj.m1();
	}
}
class Brad411{
	void m1() throws Exception{
		m2();
	}
	void m2() throws Exception{
		try {
		m3(1);
		}catch(Exception e) {
			
		}
	}
	void m3(int a) throws Exception {
		if (a==1) {
			throw new Exception();
		}else if(a ==2) {
			throw new InterruptedException();
		}else if(a ==3) {
			throw new FileNotFoundException();
		}
	}
	
}