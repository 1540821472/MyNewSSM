package com.demoproject.domain;

import lombok.Data;

/**
 * video视频对象中新增数组字段：章节
 * @author sunjiangdong
 * @date 2021/8/2 0002 2:58
 */
@Data
public class Chapter {

    /**
     * 章节ID
     */
    private int chapterId;

    /**
     * 章节标题
     */
    private String title;

    public Chapter() {
    }

    public Chapter(int chapterId, String title) {
        this.chapterId = chapterId;
        this.title = title;
    }
}
