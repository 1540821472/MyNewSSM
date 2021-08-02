package com.demoproject.mapper;

import com.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  视频Mapper接口
 * @author sunjiangdong
 */
@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"JavaSE"));
        videoMap.put(2,new Video(2,"SpringBoot"));
        videoMap.put(3,new Video(3,"Linux"));
    }

    /**
     * 获取视频对象集合
     * @return List 视频对象集合
     */
    public List<Video> listVideo(){
        List<Video> videos = new ArrayList<>();

        // Map.values() 方法用来获取Map集合中的所有键值对象，这些键值对象将存放在另一个集合对象中。
        videos.addAll(videoMap.values());
        return videos;
    }
}
