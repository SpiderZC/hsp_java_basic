package homework01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "/home/spider/work/hsp_java_basic/code/chapters15/homework01/mytemp";

        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("创建" + directoryPath + "成功");
            } else {
                System.out.println("创建" + directoryPath + "失败");
            }
        }

        String fileName = directoryPath + "/hello.txt";
        file = new File(fileName);

        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("创建" + fileName + "成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
                bufferedWriter.write("Hello???");
                bufferedWriter.close();
            } else {
                System.out.println("创建" + fileName + "失败");
            }
        } else {
            System.out.println(fileName + "存在, 不可重复存在");
        }
    }
}
