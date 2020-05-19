package com.julien.dao.daoimpl;

import com.julien.dao.BaseDao;
import com.julien.dao.TextDao;
import com.julien.pojo.MyText;

import java.util.List;



public class TextDaoImpl extends BaseDao  implements TextDao {
    @Override
    public int saveText(MyText myText) {
        String sql = "insert into t_text (time, text, username) values (?,?,?);";
        System.out.println("正在存入数据库 ："+myText.toString());
        return updata(sql,myText.getTime(),myText.getText(),myText.getUsername());
    }

    @Override
    public List<MyText> queryListText() {
        String sql = "select time, text, username from t_text";
        return queryForList(MyText.class,sql);
    }
}
