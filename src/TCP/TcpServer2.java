package TCP;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by 不器 on 2019/8/4.
 */
public class TcpServer2 {
    public static void main(String [] args)
    {
        try
        {
            ServerSocket ss=new ServerSocket(8001);
            while(true)
            {
                Socket s=ss.accept();
                System.out.println("来了一个client");
                new Thread(new Worker(s)).start();
            }
            //ss.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
