package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.classes.MyClock;
import tw.org.iii.classes.MyDrawer;

public class MySign extends JFrame {
	private MyDrawer myDrawer;
	private JButton clear, undo, redo,savaJPEG;
	private MyClock clock;
	
	
	public MySign() {
		super();
		setLayout(new BorderLayout());//Layout設定版面
		
		myDrawer =new MyDrawer();
		add(myDrawer,BorderLayout.CENTER);
		
		clear = new JButton("清除");
		undo = new JButton("上一");
		redo = new JButton("復原");
		savaJPEG = new JButton("存取");
		clock = new MyClock();
		
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);top.add(undo);top.add(redo);
		top.add(savaJPEG);top.add(clock);
		
		add(top,BorderLayout.NORTH);
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
				
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initEvent();
	}
	
	private void initEvent() {
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
				
			}
		});
//--------------------------------------上一頁功能▼▼▼▼▼▼
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
				
			}
		});
//---------------------------------------復原功能▼▼▼▼▼▼
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
				
			}
		});
		//////
		savaJPEG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveJPGE();
				
			}
		});
		
	}

	public static void main(String[] args) {
		new MySign();
		
	}


}
