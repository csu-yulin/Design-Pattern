package 创建型模式.单例模式.破坏.序列化;


import 创建型模式.单例模式.饿汉式.Singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjectToFile();
        System.out.println(Singleton.getInstance());
        System.out.println(readObjectFromFile());
    }

    //将单例对象写入文件之中
    public static void writeObjectToFile() throws IOException {
        Singleton instance = Singleton.getInstance();

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\liupiao\\中南大学\\我的大学\\学习\\后端学习\\设计模式\\Code\\创建型模式\\单例模式\\破坏\\序列化\\a.txt"));

        outputStream.writeObject(instance);
    }

    //从文件之中读会单例模式
    public static Singleton readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\liupiao\\中南大学\\我的大学\\学习\\后端学习\\设计模式\\Code\\创建型模式\\单例模式\\破坏\\序列化\\a.txt"));
        return (Singleton) inputStream.readObject();
    }
}
