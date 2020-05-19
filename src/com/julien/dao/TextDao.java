package com.julien.dao;

import com.julien.pojo.MyText;

import java.util.List;

public interface TextDao {
    /**
     *  直接保存
     * @return  保存成功的记录数
     */
    public int saveText(MyText myText);


//    时间hello
    /**
     *
     * @return返回一个集合对象
     */
    public List<MyText> queryListText();
}
