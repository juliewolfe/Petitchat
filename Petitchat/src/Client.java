import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {
	
	
	public static void main (String[] argv)
	{
		Socket socket;
		BufferedReader in;
		
		try
		{
			socket = new Socket("120.0.0.1", 7777);
			in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
			System.out.println((String) in.readLine());
			
			socket.close();
		
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
