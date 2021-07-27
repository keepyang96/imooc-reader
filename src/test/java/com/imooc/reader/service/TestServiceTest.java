package com.imooc.reader.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class) //Junit4运行的时候自动初始化ioc容器
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) //说明配置文件的地方
public class TestServiceTest {

    @Resource
    private TestService testService;

    @Test
    public void btachImport() {
        testService.btachImport();
    }
}