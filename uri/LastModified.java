import java.io.IOException;
import java.net.*;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
public class LastModified {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++)
        {
            try{
                URL u= new URL(args[i]);
                HttpURLConnection http= (HttpsURLConnection) u.openConnection();
                http.setRequestMethod("HEAD");
                System.out.println(u+"was last modified at "+ new Date(http.getLastModified()));
            }

            catch(MalformedURLException ex)
            {
                System.out.println(args[i]+ "is not a URL I understand");
            }
            catch(IOException ex)
            {
                System.out.println("ex");
            }
        }
    }
}
