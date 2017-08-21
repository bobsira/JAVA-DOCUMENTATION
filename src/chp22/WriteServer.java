package chp22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by bobsira on 8/21/17.
 * Demonstrate datagrams.
 */
public class WriteServer {
    public static int serverPort = 998;
    public static int clientPort = 999;
    public static int buffer_size = 1024;
    public static DatagramSocket datagramSocket;
    public static byte buffer[] = new byte[buffer_size];

    public static void TheServer() throws Exception{
        int pos =0;
        while (true){
            int c = System.in.read();
            switch (c){
                case  -1:
                    System.out.println("Server Quits.");
                    datagramSocket.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    datagramSocket.send( new DatagramPacket(buffer,pos, InetAddress.getLocalHost(),clientPort));
                    pos = 0;
                    break;
                default:
                    buffer[pos++] = (byte) c;
            }
        }
    }

    public static void TheClient() throws Exception{
        while (true){
            DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length);
            datagramSocket.receive(datagramPacket);
            System.out.println( new String( datagramPacket.getData(), 0, datagramPacket.getLength()));
        }
    }

    public static void main(String[] args) throws Exception{
        if (args.length == 1){
            datagramSocket = new DatagramSocket(serverPort);
            TheServer();
        } else {
            datagramSocket = new DatagramSocket(clientPort);
            TheClient();
        }
    }
}
