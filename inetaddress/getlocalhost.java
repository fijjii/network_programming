import java.net.InetAddress;
import java.net.UnknownHostException;
public class getlocalhost  {
public static void main(String[] args) {
  try {
      InetAddress id = InetAddress.getLocalHost();
      System.out.println( id.getHostName());
    } catch (UnknownHostException e) {
    }
 }
}

