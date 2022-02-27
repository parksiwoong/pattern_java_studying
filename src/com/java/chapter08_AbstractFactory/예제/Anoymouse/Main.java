package com.java.chapter08_AbstractFactory.예제.Anoymouse;


import com.java.chapter08_AbstractFactory.예제.factory.Factory;
import com.java.chapter08_AbstractFactory.예제.factory.Link;
import com.java.chapter08_AbstractFactory.예제.factory.Page;
import com.java.chapter08_AbstractFactory.예제.factory.Tray;

//관련 부품을 조합해서 제품만들기
public class Main {
  public static void main(String[] agrs){
      if(agrs.length != 1){
          System.out.println("Usage : java Main class.name.of.ConcreteFactory");
          System.out.println("example 1 : java Main class.name.of.ConcreteFactory");
          System.out.println("example 2 : java Main class.name.of.ConcreteFactory");
          System.out.println(0);
      }
      Factory factory = Factory.getFactory(agrs[0]);

      Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
      Link chosun = factory.createLink("chosun", "http://www.joins.com/");

      Link us_yahoo = factory.createLink("Yahoo!", "http://www.joins.com/");
      Link ko_yahoo = factory.createLink("Yahoo!korea", "http://www.joins.com/");
      Link excite = factory.createLink("Excite", "http://www.joins.com/");
      Link google = factory.createLink("google", "http://www.joins.com/");

      Tray traynews = factory.createTray("신문");
      traynews.add(joins);
      traynews.add(chosun);

      Tray trayyahoo = factory.createTray("yahoo!");
      trayyahoo.add(us_yahoo);
      trayyahoo.add(ko_yahoo);

      Tray traysearch = factory.createTray("검색앤진");
      traysearch.add(traynews);
      traysearch.add(trayyahoo);

      Page page = factory.createPage("LinkPage", "영진닷컴");
      page.add(traynews);
      page.add(traysearch);
      page.output();
  }

}
