package com.demoproject.controller;

import com.demoproject.domain.User;
import com.demoproject.service.impl.UserServiceImpl;
import com.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录启动器 测试HTTP POST请求
 *
 * @author sunjiangdong
 * @date 2021/8/2 0002 0:15
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;
    /**
     * @return 封装后的json数据
     */
    @PostMapping("login")
    public Object login(@RequestBody User user) {
        System.out.println("name = " + user.getName());
        System.out.println("pwd = " + user.getPwd());
        String token = userServiceImpl.login(user.getName(),user.getPwd());
        return token == null? JsonData.buildFail("账号或密码错误"): JsonData.buildSuccess(user);
    }
}
