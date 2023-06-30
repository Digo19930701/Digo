package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad63 {

	public static void main(String[] args) {
		String mesg = "吃火鍋";
		byte[] data = mesg.getBytes();
		try {
			DatagramSocket soket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(data, data.length,
					InetAddress.getByName("10.0.101.122"),88);
			soket.send(packet);
			
			soket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
