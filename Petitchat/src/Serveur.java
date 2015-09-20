import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {
	
	public static void main (String[] argv)
	{
		
		ServerSocket s;
		Socket serveur;
		PrintWriter out;
		
		try
		{
			s = new ServerSocket(7777);
			serveur = s.accept();
			out = new PrintWriter(serveur.getOutputStream());
			out.println("Hello world\n");
			
			
			serveur.close();
			s.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
