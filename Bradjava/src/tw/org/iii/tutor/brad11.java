package tw.org.iii.tutor;

public class brad11 {

	public static void main(String[] args) {
		int month =(int) (Math.random()*12)+1 ;//final 固定住的數字
		int days;
		System.out.println(month);
		switch (month) {
		case 1,3,5,7,9,11:
			days = 31;
			break;
		case 4,6,8,10,12:
			days = 30;
			break;
		default:
			days = 0;
		}
		System.out.printf("%d月有%d天",month,days);
		}

	}


