import java.io.DataOutputStream;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) {
        try{
            Socket soc= new Socket("localhost", 6666);

            DataOutputStream d= new DataOutputStream(
                soc.getOutputStream());
            
                d.writeUTF("Hello Socket!");

                d.flush();

                d.close();

                soc.close();
        }


        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
