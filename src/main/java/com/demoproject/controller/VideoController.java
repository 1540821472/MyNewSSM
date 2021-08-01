package com.demoproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 视频启动器
 * @author sunjiangdong
 */
@RestController
@RequestMapping("/api/video")
public class VideoController {
    @RequestMapping("list")
    public  Object list(){
        Map<String, String> map = new HashMap<>();
        map.put("1","SpringBoot");
        map.put("12","SpringCloud");
        return map;
    }
}
