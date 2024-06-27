import java.net.*;

public class URLSplitter {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                URL u = new URL(args[i]);
                System.out.println("The URL is: " + u);
                System.out.println("The scheme is: " + u.getProtocol());
                System.out.println("The user info is: " + u.getUserInfo());
                
                String host = u.getHost();
                if (host != null) {
                    int atSign = host.indexOf('@');
                    if (atSign != -1) {
                        host = host.substring(atSign + 1);
                    }
                    System.out.println("The host is: " + host);
                } else {
                    System.out.println("The host is null");
                }
                
                int port = u.getPort();
                if (port == -1) {
                    port = u.getDefaultPort();
                }
                System.out.println("The port is: " + port);
                
                System.out.println("The path is: " + u.getPath());
                System.out.println("The query is: " + u.getQuery());
                System.out.println("The fragment is: " + u.getRef());
            } catch (MalformedURLException e) {
                System.out.println("Invalid URL: " + args[i]);
            }
            System.out.println();
        }
    }
}