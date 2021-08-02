package com.demoproject.mapper;

import com.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户Mapper接口
 *
 * @author sunjiangdong
 */
@Repository
public class UserMapper {
    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("admin", new User(1, "admin", "admin"));
        userMap.put("tom", new User(2, "tom", "123"));
    }

    /**
     * 校验用户名和密码是否正确
     *
     * @param name 用户名
     * @param pwd  密码
     * @return 返回token值
     */
    public User login(String name, String pwd) {
        User user = userMap.get(name);
        return user != null && !pwd.equals(user.getPwd())? null: user;
    }
}
