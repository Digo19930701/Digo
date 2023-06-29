package tw.org.iii.tutor;

import tw.org.iii.classes.TWId;

public class Brad28 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(TWId.isRightId("abc"));
		
		String id = "F127967547";            //A到X  只能12 0到9  {}出現8次
		if(id.matches("[A-Z][12][0-9]{8}")) {//[A-Z][12][0-9]{8}
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("---");
		if(TWId.isRightId("F127967546")) {
			System.out.println("ok");
		}else {
			System.out.println("XX");
		}
	}

}
