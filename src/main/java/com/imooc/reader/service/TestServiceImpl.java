package com.imooc.reader.service;


import com.imooc.reader.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    public void btachImport() {
       for(int i = 0; i < 100; i ++) {
            testMapper.insert();
       }
    }
}
