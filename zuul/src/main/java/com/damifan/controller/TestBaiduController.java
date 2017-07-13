package com.damifan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author wanglei
 * @email wanglei59@jd.com
 * @create 2017/7/6 15:22
 */
@RestController
@RequestMapping("/baidu")
public class TestBaiduController {

    @RequestMapping("/testBaidu")
    public String testBaidu() {
        return "baidu";
    }
}
