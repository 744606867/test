package com.taiyue.bio;

import com.taiyue.model.JDdata;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class Tjsoup {

    public static void main(String[] args) throws IOException {
        String s = "套餐";
        String encode = URLEncoder.encode(s, "GBK");
        Document document = Jsoup.parse(new URL("http://search.jd.com/Search?keyword="+encode), 30000);
        Element element = document.getElementById("J_goodsList");
        Elements elements = element.getElementsByTag("li");
        ArrayList<JDdata> jdDatee = new ArrayList<>();

        for (Element element1 : elements) {
            String img = element1.getElementsByTag("img").eq(0).attr("source-data-lazy-img");
            String price = element1.getElementsByClass("p-price").eq(0).text();
            String name = element1.getElementsByClass("p-name").eq(0).text();

            JDdata jDdata = new JDdata();
            jDdata.setName(name);
            jDdata.setPrice(price);
            jDdata.setImg(img);
            jdDatee.add(jDdata);
        }
        jdDatee.forEach(e->{
            System.out.println(e);
        });
    }
}
