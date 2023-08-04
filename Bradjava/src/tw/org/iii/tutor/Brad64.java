package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad64 {

	public static void main(String[] args) {
	while (true)	{
		byte[] buf = new byte[1024];
		try {
			DatagramSocket soket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			soket.receive(packet);
			soket.close();
			
			InetAddress urip = packet.getAddress();
			int len = packet.getLength();
			byte[] data = packet.getData();
			
			String msg = new String(data,0,len);
			
			System.out.println(urip.getCanonicalHostName()+":"+new String(packet.getData()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}

}
