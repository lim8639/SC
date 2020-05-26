package com.julien.dao;

import com.google.gson.Gson;
import com.julien.pojo.MyText;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TextDao {
    public void saveText(String username,String text,String date){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //通过SF 获取Session
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //保存
        MyText myText  = new MyText(text,username,date);

        session.save(myText);
        session.getTransaction().commit();
        //
        session.close();
        sessionFactory.close();
    }

    public String queryText(){
        Gson gson = new Gson();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //通过SF 获取Session
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Criteria criteria = session.createCriteria(MyText.class);
        return  gson.toJson(criteria.list());

    }
    public static void main(String[] args) {

        //new TextDao().saveText("管理员","什么也没余找到我什么都没偶写","2020");
        System.out.println(new TextDao().queryText());
    }
}
