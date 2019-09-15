package Stream;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * created by 不器 on 2019/8/3.
 */
public class Sk {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),12345);
            PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            out.print("hello");
            out.flush();
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
//            while ((line=in.readLine())!=null){
//                System.out.println(line);
//            }
            line=in.readLine();
            System.out.println(line);
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
