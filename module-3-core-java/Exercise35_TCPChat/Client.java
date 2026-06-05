import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected to server!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in));

        String msg;

        while (true) {
            System.out.print("Client: ");
            msg = console.readLine();
            out.println(msg);

            if (msg.equalsIgnoreCase("exit")) break;

            msg = in.readLine();
            if (msg == null || msg.equalsIgnoreCase("exit")) break;

            System.out.println("Server: " + msg);
        }

        socket.close();
    }
}
