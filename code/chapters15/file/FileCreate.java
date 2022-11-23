package file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        create01();
    }

    public static void create01() {
        String filePath = "/home/spider/work/hsp_java_basic/code/chapters15/file/1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("file create success");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
