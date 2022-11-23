package homework02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork02 {
    public static void main(String[] args) {
        String filePath = "/home/spider/work/hsp_java_basic/code/chapters15/homework01/mytemp/hello.txt";
        BufferedReader bufferedReader = null;
        String line = "";
        int lineNum = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(++lineNum + ":" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
