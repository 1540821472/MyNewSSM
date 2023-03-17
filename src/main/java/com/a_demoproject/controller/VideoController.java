package com.a_demoproject.controller;

import com.a_demoproject.domain.Video;
import com.a_demoproject.service.impl.VideoServiceImpl;
import com.a_demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 视频启动器 测试HTTP GET请求
 *
 * @author sunjiangdong
 */
@RestController
@RequestMapping("/api/video")
public class VideoController {

    @Autowired
    private VideoServiceImpl videoServiceImpl;

    //@RequestMapping(value = "list", method = RequestMethod.GET)

    /**
     * 给页面返回一个对象，页面收到的是一个Json数据
     */
    @GetMapping("list")
    public Object listVideo() {
        return JsonData.buildSuccess(videoServiceImpl.listVideo());
    }

    /**
     * 测试页面post传的参数中有数组的情况。只sout打印查看数组值。没有在return中把数组的值塞进对象，所以return语句忽略。
     */
    @PostMapping("chapters")
    public Object listChapter(@RequestBody Video video) {
        System.out.println(video.toString());
        return JsonData.buildSuccess(videoServiceImpl.listVideo());
    }
}
