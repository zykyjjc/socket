package Stream;

import java.io.IOException;

/**
 * created by 不器 on 2019/8/3.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte[] buffer=new byte[1024];
        try {
            int len=System.in.read(buffer);
            String s=new String(buffer,0,len);
            System.out.println("读到了"+len+"字节");
            System.out.println(s);
            System.out.println("读取长度"+s.length());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
