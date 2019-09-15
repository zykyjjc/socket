package Stream;

import java.io.*;

/**
 * created by 不器 on 2019/8/3.
 */
public class Print {
    public static void main(String[] args) {
        try {
            PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"))));
            int i=123456;
            String s="大风起兮云飞扬";
            out.print(s);
            out.close();
            BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream("src/Stream.Print.java")));
//            String s= String.valueOf(in.read());
//            String s=in.readLine();
//            System.out.println(s);
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
