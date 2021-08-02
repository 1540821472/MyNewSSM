package com.demoproject.service;

import com.demoproject.domain.Video;

import java.util.List;

/**
 * 视频业务接口
 * @author sunjiangdong
 */
public interface VideoService {

    /**
     * 返回视频集合
     * @return List 返回视频集合
     */
    List<Video> listVideo();
}
