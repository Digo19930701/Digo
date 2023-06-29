package tw.org.iii.tutor;

public class DiGo4 {

	public static void main(String[] args) {
		float 	var1= 10.123456789f; 	//2*32   double =>10.123
		double	var2= 10.123456789;	    //2*64精確度
		System.out.println(var1);
		System.out.println(var2);
		
		double a = -10;
		double b = 0;//不是真的0 是接近0 Infinity無限大
		System.out.println(a / b);
		System.out.println(10 / 0);
	}

}
