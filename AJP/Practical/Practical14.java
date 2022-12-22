// Write a program to demonstrate the use of URL and URLConnection class and its  methods.

// import java.net.URL;
// import java.net.MalformedURLException;
// public class Practical14
// {
//     public static void main(String[] args) throws MalformedURLException  {
//         URL url = new URL("https://msbte.org.in/");
//         System.out.println("Authority: "+ url.getAuthority());
//         System.out.println("Default Port: "+ url.getDefaultPort());
//         System.out.println("File: "+ url.getFile());
//         System.out.println("Path: "+ url.getPath());
//         System.out.println("Protocol: "+ url.getProtocol());
//         System.out.println("Reference: "+ url.getRef());
//     }
// }



import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import  java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
 
public class Practical14 
{
    public static void main(String[] args) throws IOException , MalformedURLException
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter any Url: ");
        String ad = sc.nextLine();
 
        URL url = new URL(ad);
        URLConnection uc = url.openConnection();
 
        System.out.println("Date:"+ new Date(uc.getDate()) );
        System.out.println("Content Type: "+ uc.getContentType());
        System.out.println("Content Length: "+ uc.getContentLength());
         
    }
}

create table designation (code int primary key auto_increment, title char(35) not null unique);