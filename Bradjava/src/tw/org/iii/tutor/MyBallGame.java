package tw.org.iii.tutor;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import tw.org.iii.classes.MyPane1;

	
	


public class MyBallGame extends JFrame {
	private MyPane1 myPane1;
	
	public MyBallGame() {
		setLayout(new BorderLayout());
		
		myPane1 = new MyPane1();
		add(myPane1, BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	

	public static void main(String[] args) {
		new MyBallGame();

	}

}
