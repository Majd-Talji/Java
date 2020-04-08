//package _03_Advanced._07_Networking._04_Socket_ServerSocket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(3333);

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String serverMsg, clientMsg;
            
            do {                
                clientMsg = dis.readUTF();
                System.out.println("\nClient says: " + clientMsg + "\n");
                serverMsg = br.readLine();
                dos.writeUTF(serverMsg);
                dos.flush();
            } while (!clientMsg.equals("end"));
            
            dis.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
