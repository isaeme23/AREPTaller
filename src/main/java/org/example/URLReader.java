package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class URLReader {

    public static void main(String[] args) {
        try{
            URL myurl = new URL("https://campusvirtual.escuelaing.edu.co:9786/moodle/pluginfile.php?id=48598&#numeral");
            System.out.println("Protocol: " + myurl.getProtocol());
            System.out.println("Autority: " + myurl.getAuthority());
            System.out.println("Port: " + myurl.getPort());
            System.out.println("Path: "+ myurl.getPath());
            System.out.println("File: " + myurl.getFile());
            System.out.println("Query: " + myurl.getQuery());
            System.out.println("Ref: "+ myurl.getRef());
        } catch (MalformedURLException ex){
           throw new RuntimeException(ex);
        }

    }
}
