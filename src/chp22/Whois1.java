package chp22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by bobsira on 8/14/17.
 */
public class Whois1 {
    public static void main(String[] args) throws Exception{
        int c;

        // Create a socket connected to internic.net, port 43.
        // Manage this socket with a try-with-resources block.
        try (Socket socket = new Socket("whois.internic.net",43)) {

            // Obtain input and output streams.
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // Construct a request string.
            String string = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
            // Convert to bytes.
            byte buf[] = string.getBytes();

            // Send request.
            outputStream.write(buf);

            // Read and display response.
            while (( c = inputStream.read()) != -1){
                System.out.print((char) c);
            }
        }
        // The socket is now closed
    }
}
