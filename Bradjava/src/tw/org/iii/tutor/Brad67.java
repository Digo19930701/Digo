package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Brad67 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.iii.org.tw");
			URLConnection conn = url.openConnection();
			
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader breader = new BufferedReader(ir);
			
			String line;
			while((line = breader.readLine()) != null) {
				System.out.println(line);
			}
			ir.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
