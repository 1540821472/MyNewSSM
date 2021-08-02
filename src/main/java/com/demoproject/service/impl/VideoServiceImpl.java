package com.demoproject.service.impl;

import com.demoproject.domain.Video;
import com.demoproject.mapper.VideoMapper;
import com.demoproject.service.VideoService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 视频业务类
 * @author sunjiangdong
 */
@Service
@Data
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
