import java.net.*;
public class hello
{
    public static void main(String[] args)
    {
try
{
//InetAddress address= InetAddress.getByName("www.bishwobista.com.np");
InetAddress address2= InetAddress.getByName("169.254.0.1");
//InetAddress local = InetAddress.getLocalHost();
//InetAddress unknown= InetAddress.getByName("www.cloudnetworkingnepal.com");
//System.out.println(address2.getHostName());
//System.out.println(local);
//System.out.println(address);
//System.out.println(unknown);
//System.out.println(address2.getCanonicalHostName());//same as getHostName
//System.out.println(address2.getHostName());
//System.out.println(address2.isLoopbackAddress());
//System.out.println(address2.isAnyLocalAddress());
System.out.println(address2.isLinkLocalAddress());
}
catch(UnknownHostException ex)
{
    System.out.println("could not find");
}
    }
}