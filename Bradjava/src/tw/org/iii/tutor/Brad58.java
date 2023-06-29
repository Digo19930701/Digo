package tw.org.iii.tutor;

import java.util.LinkedList;

public class Brad58 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add(0,"Brad");//0
		names.add(0,"Eric");//1
		names.add(0,"Peter");//2
		names.add(0,"Amy");//3
		names.add(0,"Brad");//4
		System.out.println(names.size());
		for(String name : names) {
			System.out.println(name);
		}
	}

}
