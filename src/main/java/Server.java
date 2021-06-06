import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int SERVER_PORT = 10001;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);


        try (Socket socket = serverSocket.accept();
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("New connection accepted");
            String line;
            while ((line = in.readLine()) != null) {
                if (line.equals("end")) {
                    System.out.println("The connection interrupted");
                    break;
                }
                int n = Integer.parseInt (line);
                Fibonacci fibonacci = new Fibonacci();
                System.out.println(fibonacci.computeFibanacci(n));
                out.println(n + "th element of Fibanacci's sequence equals " + fibonacci.computeFibanacci(n));
//                if (line.equals("end")) {
//                    System.out.println("The connection interrupted");
//                    break;
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
