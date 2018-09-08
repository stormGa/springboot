package cn.lkhcoding.springboot.service.impl;

import cn.lkhcoding.springboot.dao.UserDao;
import cn.lkhcoding.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userdao;

    @Override
    public int getUser(String username, String password) {
        return userdao.getUser(username,password);
    }
}
