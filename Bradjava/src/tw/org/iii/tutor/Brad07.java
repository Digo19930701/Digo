package tw.org.iii.tutor;

public class Brad07 {

	public static void main(String[] args) {
		
		double temp = Math.random();//random亂碼產生
		int a = (int)(temp * 101) ;//個數 0~100  +1代表位移
		System.out.println(a);
		
		
		if (a >= 90) {System.out.println("a");}
		else if (a >= 80) {System.out.println("b");}
		else if (a >= 70) {System.out.println("c");}
		else if (a >= 60) {System.out.println("d");}
				
	}

}
