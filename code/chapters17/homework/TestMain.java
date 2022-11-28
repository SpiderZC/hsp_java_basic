package homework;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Class<?> cls = PrivateTest.class;
        PrivateTest privateTest = (PrivateTest) cls.newInstance();
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTest, "天龙八部");
        Method getName = cls.getMethod("getName");
        Object invoke = getName.invoke(privateTest);
        System.out.println(invoke);
    }
}

