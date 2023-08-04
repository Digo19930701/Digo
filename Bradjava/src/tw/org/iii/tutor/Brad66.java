package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.Severity;

public class Brad66 {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(443);
			System.out.println("wait....");
			Socket socket = server.accept();//兩端連接
			
			String urip = socket.getInetAddress().getCanonicalHostName();//c
			FileOutputStream fout = new FileOutputStream(String.format("dir1%s.jpg", urip));
			
			
			
			InputStream in = socket.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4*1024*1024];
			int len;while ((len = bin.read(buf)) != -1) {
				fout.write(buf,0,len);
				
			}
			bin.close();
		
		fout.flush();
		fout.close();
		server.close();
			
			
		
		} catch (IOException e) {
			System.out.println(e);
			
		}
	}

}
