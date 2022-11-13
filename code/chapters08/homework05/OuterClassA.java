package homework05;

public class OuterClassA {

    private String name;

    public void method1() {
        class InnerClassB {
            private String name;

            public void show() {
                System.out.println("InnerClassB show~");
            }
        }
    }
}
