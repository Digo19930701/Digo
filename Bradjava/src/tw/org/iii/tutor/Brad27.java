package tw.org.iii.tutor;

import tw.org.iii.classes.Scooter;

public class Brad27 {

	public static void main(String[] args) {
		String s1 = new String("Brad");//有兩種物件
		String s2 = new String("Brad");
		System.out.println(s1);
		
		Scooter s3 = new Scooter();
		System.out.println(s3);
		System.out.println("--------");
		System.out.println(s1 == s2);//比對記憶體位址
		System.out.println(s1.equals(s2) );//equals 比對內容
	}

}
