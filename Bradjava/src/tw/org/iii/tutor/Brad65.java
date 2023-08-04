package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.stream.FileImageOutputStream;

public class Brad65 {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.101.191"),9999);			
			
			File sours = new File("dir1/456.png");
			FileInputStream fin = new FileInputStream(sours);
			byte [] buf = new byte[(int)sours.length()];
			fin.read();
			fin.close();
			
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			
			
			socket.close();
			System.out.println("Client OK");
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
