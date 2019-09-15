package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * created by 不器 on 2019/8/3.
 */
public class UdpRec {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket(3000);
        byte [] buf=new byte[1024];
        DatagramPacket dp=new DatagramPacket(buf,1024);

        System.out.println("UdpRecv: 我在等待信息");
        ds.receive(dp);
        System.out.println("UdpRecv: 我接收到信息");
        String strRecv=new String(dp.getData(),0,dp.getLength()) +
                " from " + dp.getAddress().getHostAddress()+":"+dp.getPort();
        System.out.println(strRecv);
        Thread.sleep(3000);
        System.out.println("UdpRecv: 我要发送信息");
        String str="aha";
        DatagramPacket dp2=new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("127.0.0.1"),dp.getPort());
        ds.send(dp2);
        System.out.println("UdpRecv: 我发送信息结束");
        ds.close();

    }
}