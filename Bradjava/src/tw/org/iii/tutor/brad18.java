package tw.org.iii.tutor;

import java.util.Scanner;

public class brad18 {

	public static void main(String[] args) {
		//1+2+3+....+n= ?
		System.out.print("n =");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		
		int i=1, sum = 0;
		while(i <=n) {
			sum += i++;
			System.out.println(sum);
		}
	}

}
