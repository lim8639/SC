package com.julien.dao.daoimpl;

import com.julien.pojo.User;

public interface UserDao {
    /**
     * 通过用户名查找用户
     *  注册功能
     * 验证登录名和密码
     */

    public User queryBYName(String username);

    public User queryBYNameANDPSWD(String username,String password);

    public int saveUser(String username,String password);

}
