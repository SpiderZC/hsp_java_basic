package template;

public abstract class Template {
    public abstract void job();

    public void caleTimes() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务花费时间" + (end - start));
    }
}
