package tw.org.iii.tutor;

import tw.org.iii.classes.TWId;

public class Brad32 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefg")
			.append("OK")
			.append("xx");
		System.out.println(sb);
		System.out.println("------");
		TWId id = TWId.newTWId("F127967546");
		if (id == null) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}

	}

}
