package tw.org.iii.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines,garbag;
	
	public MyDrawer() {
		lines = new LinkedList<>();
		garbag = new LinkedList<>();
		setBackground(Color.BLACK);//背景顏色
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}
	private class MyListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX(), y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
			repaint();
		}
//		@Override
//		public void mouseReleased(MouseEvent e) {
//		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getX(), y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			
			lines.getLast().addLast(point);
			repaint();
		}
	}
	
	@Override
	protected void paintChildren(Graphics g) {
		super.paintChildren(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.white);//線的顏色
		g2d.setStroke(new BasicStroke(10));;
		//g2d.drawLine(0, 0, 100, 200);
		
		for(LinkedList<HashMap<String, Integer>> line:lines) {
			for(int i =1; i< line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
		}
		
		
		
			
		}
	}

	public void clear() {
		lines.clear();
		repaint();
		
	}
	public void undo() {
		
		garbag.add(lines.removeLast());
		repaint();
		
	}
	public void redo() {
		if (lines.size()>0) {
		lines.add(garbag.removeLast());
		repaint();
		}
	}

	public void saveJPGE() {
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);//ARGB..A是透明度JPG沒有透明
		Graphics g = img.getGraphics();
		paint(g);
		try {
			ImageIO.write(img, "jpg", new File("dir1/brad.jpg"));
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void saveLine() throws Exception {
		try (ObjectOutputStream oout =
				new ObjectOutputStream(new FileOutputStream("dir/bard.sign"))){
			oout.writeObject(lines);
			oout.flush();
		}
	}
	public void loadLine() throws Exception{
		ObjectInputStream oin =
				new ObjectInputStream(new FileInputStream("dir/bard.sign"));
	Object obj=	oin.readObject();
	lines =(LinkedList<LinkedList<HashMap<String,Integer>>>)obj;
	oin.close();
	
	repaint();
	
	}
	
}
