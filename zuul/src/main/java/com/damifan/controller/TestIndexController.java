package com.damifan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author wanglei
 * @email wanglei59@jd.com
 * @create 2017/7/13 10:07
 */
@RequestMapping
@RestController
public class TestIndexController {

    @RequestMapping("index/test")
    public String index() {
        return "This is index";
    }

    @RequestMapping("home")
    public String home() {
        return "This is home";
    }
}
