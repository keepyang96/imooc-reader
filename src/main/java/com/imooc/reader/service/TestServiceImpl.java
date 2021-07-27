package com.imooc.reader.service;


import com.imooc.reader.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Transactional
    public void btachImport() {
       for(int i = 0; i < 100; i ++) {
            testMapper.insertByMybatis();
       }
    }
}
