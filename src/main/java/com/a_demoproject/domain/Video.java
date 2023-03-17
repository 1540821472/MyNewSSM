package com.a_demoproject.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 视频实体类
 * @author sunjiangdong
 */
@Data
@EqualsAndHashCode
public class Video implements Serializable {

    /**
     * 视频ID
     */
    private int id;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频描述
     */
    private String summary;

    /**
     * 视频价格
     */
    private int price;

    /**
     * 视频封面图
     */
    private String coverImg;

    /**
     * 视频创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
    private Date createTime = new Date();

    /**
     * 视频实体类中新增数组字段：章节
     */
    private List<Chapter> chapterList;

    public Video() {
    }

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
    }

}
