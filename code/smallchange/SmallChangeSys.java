package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String choice = " ";

        // 2. 零钱通明细
        String detail = "====================零钱通明细====================";

        // 3. 收益
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 4. 消费
        String note = "";

        do {
           System.out.println("\n====================零钱通菜单====================");
           System.out.println("\t\t 1. 零钱通明细");
           System.out.println("\t\t 2. 收益  入账");
           System.out.println("\t\t 3. 消      费");
           System.out.println("\t\t 4. 退      出");

           System.out.println("please enter your choice");

           choice = scanner.next();

           switch(choice) {
               case "1" :
                   System.out.println(detail);
                   break;
               case "2" :
                   System.out.println("收益入账金额:");
                   money = scanner.nextDouble();
                   if (money <= 0) {
                       System.out.println("收益入账金额需要大于0");
                       break;
                   }
                   balance += money;

                   // 拼接收益
                   date = new Date();
                   detail += "\n收益入账\t+" + money + "\t" +sdf.format(date) + "\t余额:" + balance;
                   break;
               case "3" :
                   System.out.println("消费金额:");
                   money = scanner.nextDouble();
                   if (money <= 0) {
                       System.out.println("消费额度应该大于0");
                   }else if (money > balance) {
                       System.out.println("余额不足,请充值!!!");
                       System.out.println("余额:" + balance);
                   } else {
                       System.out.println("消费说明:");
                       note = scanner.next();
                       balance -= money;
                       detail += "\n"+ note + "\t-" + money + "\t" +sdf.format(date) + "\t余额:" + balance;
                   }
                   break;
               case "4" :
                   String lop = "";
                   System.out.println("确认退出吗？ y/n");
                   while (true) {
                       lop = scanner.next();
                       if ("y".equals(lop) || "n".equals(lop)) {
                           break;
                       }
                       System.out.println("输入错误, 请输入y/n");
                   }

                   if (lop.equals("y")) {
                       loop = false;
                   }

                   break;
               default :
                   System.out.println("enter wrong, please enter again");
           }

        } while (loop);

        System.out.println("exit!!!");
    }
}

