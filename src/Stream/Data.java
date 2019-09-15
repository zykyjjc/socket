package Stream;

import java.io.*;

/**
 * created by 不器 on 2019/8/3.
 */
public class Data {
    public static void main(String[] args) {
        try {
            DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat") ) );
            int i=0xffff;
            out.writeInt(i);
            out.close();
            DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int j=in.readInt();
            System.out.println(j);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
