package tw.org.iii.tutor;

public class Brad35 {

	public static void main(String[] args) {
		
	}
}
abstract class Shape{
	abstract double calArea();
	abstract double calLengrh();
}
class RecShap extends Shape{
	double w,h;
	double calArea() {
		return w*h;
	}
	abstract double calLength() {
		return (w+h)*2;
	}
}
class CircleShae extends Shape{
	double r;
	CircleShae(double r){this.r=r; }
	
	
}