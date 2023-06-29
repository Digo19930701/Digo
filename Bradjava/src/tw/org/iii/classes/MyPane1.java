package tw.org.iii.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPane1 extends JPanel{
	private BufferedImage ball0;
	private int ballx,bally, ballw, ballh;
	private HashSet<BallTask>balls;
	
	public MyPane1() {
		setBackground(Color.GREEN);
		
		balls = new HashSet<>();
		try {
			ball0 = ImageIO.read(new File("dir1/ball0.png"));
			ballw = ball0.getWidth();
			ballh = ball0.getHeight();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				changBallXY(e.getX(), e.getY());
			}
		});
};
		
		
		
	
		void changBallXY(int x , int y) {
			ballx =(int)(x -(ballw *0.5));
			bally =(int)(y-(bally*0.5));
			repaint();
			
		}
		private class BallTask extends TimerTask{
			private int x, y, w, h;
			@Override
			public void run() {
	
			}
			
		}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.drawImage(ball0, ballx, bally, null);
	}
}
