import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in));

        String msg;

        while (true) {
            msg = in.readLine();
            if (msg.equalsIgnoreCase("exit")) break;

            System.out.println("Client: " + msg);

            System.out.print("Server: ");
            msg = console.readLine();
            out.println(msg);

            if (msg.equalsIgnoreCase("exit")) break;
        }

        socket.close();
        serverSocket.close();
    }
}