package chp22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by bobsira on 8/14/17.
 * Demonstrate Sockets
 */
public class Whois {
    public static void main(String[] args) throws Exception{
        int c;

        // Create a socket connected to internic.net, port 43.
        Socket socket = new Socket("whois.internic.net",43);

        // Obtain input and output streams.
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        // Construct a request string
        String string = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        // Convert to bytes
        byte buf[] = string.getBytes();

        // Send request.
        outputStream.write(buf);

        // Read and display response
        while ((c = inputStream.read()) != -1){
            System.out.print((char) c);
        }
        socket.close();
    }
}
