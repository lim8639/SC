package com.julien.test;

import com.julien.dao.daoimpl.TextDaoImpl;
import com.julien.pojo.MyText;
import org.junit.Test;

import java.util.List;

public class TextDaoImplTest {

    TextDaoImpl textDao = new TextDaoImpl();
    @Test
    public void saveText() {
         textDao.saveText(new MyText("25018","admin","admin"));

    }

    @Test
    public void queryListText() {
        List<MyText>list = textDao.queryListText();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}