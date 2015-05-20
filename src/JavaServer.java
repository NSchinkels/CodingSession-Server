import java.net.*;
import java.io.*;

public class JavaServer {

	public static void main(String[] args) throws IOException {
		ServerSocket anschluss = new ServerSocket(6000);
		//Der ganze Scheiss ist noch nicht Thread sicher
		while (true) {
			Socket lauschen = anschluss.accept();
			ObjectInputStream PortLeser = new ObjectInputStream(lauschen.getInputStream());
			//BufferedReader Eingabe = new BufferedReader(PortLeser);
			try {
				Object S = PortLeser.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(PortLeser.readObject() instanceof CodingSession){
					System.out.println("angekommen");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			//Ausgabe.close();
		}
	}
}
