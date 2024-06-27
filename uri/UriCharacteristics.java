import java.net.*;
public class UriCharacteristics {
    public static void displayURI(URI uri)
    {
        System.out.println("getAuthoriy="+uri.getAuthority());
        System.out.println("getScheme="+uri.getScheme());
        System.out.println("getSchemeSpecificPart="+uri.getSchemeSpecificPart());
        System.out.println("gethost="+uri.getHost());
        System.out.println("getPath="+uri.getPath());
        System.out.println("getQuery="+uri.getQuery());
        System.out.println("getFragment="+uri.getFragment());
        System.out.println("getUserInfo="+uri.getRawUserInfo());
        System.out.println("normalize=  "+uri.normalize());
    }
    public static void main(String[] args) throws Exception{
        URI uri= new URI("https://www.dns.google.com/search?q=is+ram+upgradable");
        displayURI(uri);
    }
}
