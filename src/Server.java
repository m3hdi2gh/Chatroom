import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static final List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        int port = 1234;
        System.out.println("Chat Server is running on port " + port);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    static class ClientHandler implements Runnable {
        private static int clientCount = 0;
        private final Socket socket;
        private final PrintWriter out;
        private final String clientName;

        public ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            this.out = new PrintWriter(socket.getOutputStream(), true);
            this.clientName = "User" + ++clientCount;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                String message;
                while ((message = in.readLine()) != null) {
                    String formattedMessage = clientName + ": " + message;
                    System.out.println(formattedMessage);
                    Server.broadcast(formattedMessage);
                }
            } catch (IOException e) {
                System.out.println(clientName + " has left the chat");
            }
        }

        public void sendMessage(String message) {
            out.println(message);
        }
    }
}