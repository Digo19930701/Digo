package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class Brad26 {

	public static void main(String[] args) {
		Bike b1 = new Bike("Brad");
		Bike b2 = new Bike("Brad");
		Bike b3 = b1;
		int[] a1 =new int[3];
		double[] a2 = new double[3];
		boolean[] a3 = new boolean[3];
		long[] a4 = new long[3];
		
//		System.out.println(b3);
//		System.out.println(b2);
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);
		
		System.out.println(b1);
		System.out.println(b2);
		//System.out.println(b1==b3);
	}

}
