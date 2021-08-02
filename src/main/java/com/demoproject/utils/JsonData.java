package com.demoproject.utils;

import lombok.Data;

/**
 * 统一编码规范，返回页面数据格式为 状态码 + 数据 + 描述信息
 * 如果直接返回对象给页面的话，页面只能通过HTTP请求的status去判断接口是否调用成功，所以这里统一规范
 *
 * @author sunjiangdong
 * @date 2021/8/1 0001 23:55
 */
@Data
public class JsonData {

    /**
     * 接口返回状态码 0：成功 !0：失败
     */
    private int code;

    /**
     * 接口返回数据
     */
    private Object data;

    /**
     * 接口返回描述信息
     */
    private String msg;

    public JsonData() {
    }

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 接口调用成功时
     *
     * @param data 数据
     * @return 封装后的json对象
     */
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, data, null);
    }

    /**
     * 接口调用失败时
     *
     * @param code 状态码
     * @param data 数据
     * @param msg  描述信息
     * @return 封装后的json对象
     */
    public static JsonData buildFail(String msg) {
        return new JsonData(-1, "", msg);
    }
}
