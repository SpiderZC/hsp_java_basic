package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork01 {
    public static void main(String[] args) {
//        News new1 = new News("新闻一: 新冠确证病例超千万,数百万印度教信徒赴恒河\"圣浴\"引民众担忧", "");
//        News new2 = new News("新闻二: 男子突然想起2个月前钓的鱼还在网兜里, 捞起一看感觉放生", "");

        News new1 = new News("新冠确证病例超千万,数百万印度教信徒赴恒河\"圣浴\"引民众担忧", "");
        News new2 = new News("男子突然想起2个月前钓的鱼还在网兜里, 捞起一看感觉放生", "");

        ArrayList<News> arrayList = new ArrayList<>();

        arrayList.add(new1);
        arrayList.add(new2);

        Collections.sort(arrayList, new Comparator<News>() {
            @Override
            public int compare(News o1, News o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });

        for (News news : arrayList) {
            String title = "";
            if (news.getTitle().length() >= 15) {
                title = news.getTitle().substring(0, 15) + "...";
            } else {
                title = news.getTitle();
            }
            System.out.println(title);
        }

    }
}

