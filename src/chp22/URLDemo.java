package chp22;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bobsira on 8/14/17.
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("http://www.HerbSchildt.com/WhatsNew");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("Host: " + url.getHost());
        System.out.println("File: " + url.getFile());
        System.out.println("Ext: " + url.toExternalForm());
    }
}
