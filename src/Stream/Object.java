package Stream;

import java.io.*;

/**
 * created by 不器 on 2019/8/3.
 */
class Student implements Serializable{
    private String name;
    private int age;
    private int grade;
    public Student(String name,int age,int grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public String toString(){
        return name+" "+age+" "+grade;
    }
}
public class Object{
    public static void main(String[] args) {
        Student s1=new Student("john",18,5);
        System.out.println(s1);
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("obj.dat"));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("obj.dat"));
            Student s2= (Student) in.readObject();
            in.close();
            System.out.println(s2);
            System.out.println(s1==s2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
