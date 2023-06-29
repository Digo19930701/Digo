package tw.org.iii.tutor;

public class If_else_parctice {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		System.out.println(a);
		if(a>=90) {
			System.out.println("A++");
		}else if(a>=80) {
			System.out.println("B++");
		}else if(a>=70) {
			System.out.println("C++");
		}else if(a>=60) {
			System.out.println("B++");
		}else {
			System.out.println("D");
		}
		System.out.println("成績公布結束");
	}

}
