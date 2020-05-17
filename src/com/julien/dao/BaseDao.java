package com.julien.dao;

import com.alibaba.druid.util.JdbcUtils;
import com.julien.utils.JDBC;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();
    /**
     * update()方法执行 Insert，Update，Delete语句
     * @return 返回执行的行数，失败返回-1
     */
    public int updata(String sql, Object...args){
        Connection connection = JDBC.getConnection();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 查询一个javabean
     * @param type 返回类型
     * @param  sql 执行这条语句
     * @param  args sql的参数
     * @return <T>
     */
    public <T>T queryForOne(Class<T> type, String sql, Object...args){
        Connection connection = JDBC.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBC.close(connection);
        }
        return null;
    }

    /**
     * 查询并且返回一个list对象
     *
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object...args){
        Connection connection = JDBC.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;
}
    public Object queryForSingleValue(String sql, Object...args){
        Connection connection =JDBC.getConnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBC.close(connection);
        }
        return null;
    }
}