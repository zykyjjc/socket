package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * created by 不器 on 2019/8/3.
 */
public class UdpSend {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String str="hello world";
        DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
                InetAddress.getByName("127.0.0.1"),3000);

        System.out.println("UDP.UdpSend: 我要发送信息");
        ds.send(dp);
        System.out.println("UDP.UdpSend: 我发送信息结束");
        Thread.sleep(3000);
        byte[] buffer=new byte[1024];
        DatagramPacket dp2=new DatagramPacket(buffer,1024);
        System.out.println("UDP.UdpSend: 我要接收信息");
        ds.receive(dp2);
        System.out.println("UDP.UdpSend: 我接收信息结束");
        String strRecv=new String(dp2.getData(),0,dp2.getLength()) +
                " from " + dp2.getAddress().getHostAddress()+":"+dp2.getPort();
        System.out.println(strRecv);


    }
}
