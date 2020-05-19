package com.julien.dao.daoimpl;

import com.julien.dao.BaseDao;
import com.julien.dao.UserDao;
import com.julien.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryBYName(String username) {
        String sql = "select username,password from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryBYNameANDPSWD(String username, String password) {
        String sql = "select username,password from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(String username, String password) {
        String  sql = "Insert into t_user (username,password)values(?,?)";
        return updata(sql,username,password);
    }
}
