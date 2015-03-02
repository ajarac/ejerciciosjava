package edu.upc.eetac.dsa.ajarac.Ejercicio7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class ServerTCP {
	public static void main(String args[]) throws IOException {
		int port = 12345;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		ServerSocket serverSocket = new ServerSocket(port);
		while (true){
			Socket socket = serverSocket.accept();
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(sdf.format(System.currentTimeMillis()));
            writer.flush();//limpia el buffer
		}
	}
}
