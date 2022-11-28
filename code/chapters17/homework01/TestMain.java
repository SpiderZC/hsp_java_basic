package homework01;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class TestMain {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.io.File");
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class);

        String filePath = "mynew.txt";
        Object obj = constructor.newInstance(filePath);
        Method method = cls.getMethod("createNewFile");
        method.invoke(obj);
    }
}
