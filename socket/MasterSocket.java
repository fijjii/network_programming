import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MasterSocket {

    public static void main(String[] args) {
        int port_no= 6666;
        try{
            ServerSocket ss= new ServerSocket(port_no);
            Socket soc= ss.accept();
            DataInputStream dis= new DataInputStream(soc.getInputStream());

            String str= (String)dis.readUTF();
            System.out.println("message= "+ str);

            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
