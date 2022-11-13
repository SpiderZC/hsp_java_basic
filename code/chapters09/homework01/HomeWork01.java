package homework01;

public class HomeWork01 {
    public static void main(String[] args) {
       HomeWork01 homework01 = new HomeWork01(); 

       try {
           if (args.length != 2) {
               throw new ArrayIndexOutOfBoundsException("参数个数错误");
           }

           int n1 = Integer.parseInt(args[0]);
           int n2 = Integer.parseInt(args[1]);

           double res = homework01.cal(n1, n2);
           System.out.println("计算结果是" + res);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
       } catch (NumberFormatException e) {
           System.out.println("参数格式错误");
       } catch (ArithmeticException e) {
           System.out.println("分母为zero");
       }
    }

    public double cal(int n1, int n2) {
        return n1 / n2;
    }
}
