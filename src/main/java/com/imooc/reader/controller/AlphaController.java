package com.imooc.reader.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class AlphaController {

    @GetMapping("/t1")
    public ModelAndView test1(){
        return new ModelAndView("/test");
    }

    @GetMapping("/t2")
    @ResponseBody
    public Map test2(){
        Map ret = new HashMap();
        ret.put("test","测试文本");
        return ret;
    }
}
