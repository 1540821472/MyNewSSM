package com.demoproject.domain;

import com.sun.scenario.effect.impl.prism.PrRenderInfo;
import lombok.Data;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

/**
 *  用户类
 * @author sunjiangdong
 */
@Data
public class User {

    /**
     * 用户ID
     */
    private int id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户密码
     */
    private String pwd;

    public User() {
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
