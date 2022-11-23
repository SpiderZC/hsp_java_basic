package homework03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class HomeWork03 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String filepath = "/Users/spider/Work/hsp_java_basic/code/chapters15/homework03/dog.properties";
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            properties.load(new FileReader(filepath));
            // properties.list(System.out);
            String name =properties.get("name") + "";
            int age = Integer.valueOf("" + properties.get("age"));
            String color = properties.get("color") + "";
            Dog dog = new Dog(name, age, color);
            System.out.println(dog);

            String serFilePath = "/Users/spider/Work/hsp_java_basic/code/chapters15/homework03/dog.dat";
            oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
            oos.writeObject(dog);

            ois = new ObjectInputStream(new FileInputStream(serFilePath));
            Dog dog1 = (Dog) ois.readObject();
            System.out.println(dog1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                System.out.println("序列话成功");
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                ois.close();
                System.out.println("反序列话成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
