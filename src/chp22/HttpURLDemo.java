package chp22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by bobsira on 8/17/17.
 */
public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.google.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        // Display request method
        System.out.println("Request method is " + httpURLConnection.getRequestMethod());

        // Display response message.
        System.out.println("Response Message is " + httpURLConnection.getResponseMessage());

        // Get a list of the header fields and a set
        // of the header keys.
        Map<String, List<String>> headerMap = httpURLConnection.getHeaderFields();
        Set<String> headerField = headerMap.keySet();

        // Display all header keys and values.
        for ( String k : headerField){
            System.out.println("Key: " + k +
                                "  Value: " + headerMap.get(k));
        }
    }
}
