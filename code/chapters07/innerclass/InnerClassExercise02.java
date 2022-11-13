package innerclass;

public class InnerClassExercise02{
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床啦");
            }
        });

        new CellPhone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("匿名内部类2");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}
