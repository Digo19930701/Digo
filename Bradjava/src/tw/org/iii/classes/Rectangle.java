package tw.org.iii.classes;

public class Rectangle {   //矩形類別
	public double high,wide;//宣告 高跟寬 是共有的資料成員
	public double area = 0;//宣告 面積是共有的資料成員
	private double peri = 0;//宣告 私有peri成員
	
	public double getPeri(double h, double w) {
		high = h;
		wide = w;
		peri = (high+wide)*2;
		return peri;
	}

	public void CalArea() {
		area = high*wide;
	}
	
	public static void main(String[] args) {
		Rectangle rec1;
		rec1 = new Rectangle();
		rec1.high=20;//呼叫high
		rec1.wide=20;
		rec1.CalArea();
		double r1_peri = rec1.getPeri(20, 20);
		System.out.println("***物件rec1****");
		System.out.println("高度="+rec1.high);
		System.out.println("寬度="+rec1.wide);
		System.out.println("面積="+rec1.area);
		System.out.println("周長"+r1_peri);

	}
	
}
