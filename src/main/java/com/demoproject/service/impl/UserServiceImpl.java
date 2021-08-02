package com.demoproject.service.impl;

import com.demoproject.domain.User;
import com.demoproject.mapper.UserMapper;
import com.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 用户业务类
 *
 * @author sunjiangdong
 * @date 2021/8/1 0001 16:53
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 模拟存放session。应该是要放到redis缓存中的。
     */
    private static Map<String, User> sessionMap = new HashMap<>();

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String name, String pwd) {
        User user = userMapper.login(name, pwd);
        if (user == null) {
            return null;
        } else {
            String token = UUID.randomUUID().toString();
            System.out.println("token = " + token);
            sessionMap.put(token, user);
            return token;
        }
    }
}
