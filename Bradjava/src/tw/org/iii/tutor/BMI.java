package tw.org.iii.tutor;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;



public class BMI extends JFrame{
	public BMI() {
		setTitle("BMI計算");//標題
		setBackground(Color.blue);//背景顏色
		setSize(600, 600);//視窗大小
		setVisible(true);//是否顯示視窗
		setDefaultCloseOperation(EXIT_ON_CLOSE);//結束後程式關閉
		
		
	
		
	}

	public static void main(String[] args) {
		new BMI();
	}

}
