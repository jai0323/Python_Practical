package additionServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String agr[]){
        try {
            Socket s = new Socket("localhost",3305);
            System.out.println("Connection Esbalished!");

            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            out.flush();

            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.println("Enter the 2 numbers:- (type exit to close)");
                String n = br.readLine();
                if(n.equalsIgnoreCase("exit")){
                    System.out.println("Client Disconnect!");
                    out.writeObject(n);
                    break;
                }
                String m = br.readLine();

                String send = n+" "+m;

                out.writeObject(send);

                String sum = in.readObject().toString();
                System.out.println("Sume = "+sum);

            }
            in.close();
            br.close();
            out.close();
            System.out.println("Connection Closed!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
