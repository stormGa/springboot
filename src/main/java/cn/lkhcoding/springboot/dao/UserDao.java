package cn.lkhcoding.springboot.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    int getUser(String username, String password);
}
