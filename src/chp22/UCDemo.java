package chp22;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by bobsira on 8/14/17.
 */
public class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL url = new URL("http://www.internic.net");
        URLConnection urlConnection = url.openConnection();

        // get date
        long date = urlConnection.getDate();
        if (date == 0 )
            System.out.println("No date information.");
        else
            System.out.println("Date: " + new Date(date));

        // get content type
        System.out.println("Content-Type: " + urlConnection.getContentType());

        // get expiration date
        date = urlConnection.getExpiration();
        if ( date == 0 )
            System.out.println("No expiration information");
        else
            System.out.println("Expires: " + new Date(date));

        // get last-modified date
        date = urlConnection.getLastModified();
        if ( date == 0)
            System.out.println("No last-modified information.");
        else
            System.out.println("Last-Modified: " + new Date(date));

        // get content length
        long len = urlConnection.getContentLengthLong();
        if ( len == -1 )
            System.out.println("Content length unavailable.");
        else
            System.out.println("Content-Length: " + len );

        if ( len != 0 ) {
            System.out.println("=== Content ===");
            InputStream inputStream = urlConnection.getInputStream();
            while ((( c = inputStream.read()) != -1)){
                System.out.print((char) c);
            }
            inputStream.close();
        }  else {
            System.out.println("No content available.");
        }
    }
}
