package additionServerClient;

import java.io.*;
import java.net.*;

public class Sever {

    public static void main(String arg[]) throws IOException {

        try {
            ServerSocket ss = new ServerSocket(3305);
            System.out.println("Waiting for client!");
            Socket s = ss.accept();
            System.out.println("Client Connected!");
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            out.flush();

            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
            

            String cMsg;
            while(true){

                cMsg = in.readObject().toString();


                System.out.println("Client :- "+cMsg);
                if(cMsg.equalsIgnoreCase("exit")){
                    System.out.println("Client Disconnect!");
                    break;
                }
                // "3 5"
                String numbers[]=cMsg.split(" ");

                //  numbers[3,5]
                int sum = Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
                System.out.println("Sum = "+sum);
                out.writeObject(sum);


            }
            in.close();
            
            out.close();
            System.out.println("Server Closed!");


        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    
}
