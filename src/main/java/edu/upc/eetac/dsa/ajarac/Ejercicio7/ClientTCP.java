package edu.upc.eetac.dsa.ajarac.Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP {
	public static void main(String args[]) throws UnknownHostException,
			IOException {
		String server = "localhost";
		int port = 12345;
		Socket s = new Socket(server, port);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String time = reader.readLine();
		System.out.println(time);
	}
}
