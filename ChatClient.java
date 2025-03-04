import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3305);
            System.out.println("Connected to the server!");

            // Create ObjectOutputStream before ObjectInputStream
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
           
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;
            while (true) {
                // Client sends a message
                System.out.print("You: ");
                clientMessage = userInput.readLine();
                if (clientMessage.equalsIgnoreCase("exit")) {
                    out.writeObject("exit");
                    out.flush(); // Ensure message is sent
                    break;
                }
                out.writeObject(clientMessage);
                out.flush(); // Flush immediately

                // Read message from server
                
            }

            // Close resources
       
            out.close();
            userInput.close();
            socket.close();
            System.out.println("Client closed.");
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
