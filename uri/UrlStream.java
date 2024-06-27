
import java.io.InputStream;
import java.net.URL;

public class UrlStream {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("deprecation")
        URL url=new URL("https://www.google.com");
        try(InputStream inputStream=url.openStream())
        {
            int c;
            while((c=inputStream.read()) !=-1)
            {
                System.out.println((char)c);
            }
        }
    }
}
