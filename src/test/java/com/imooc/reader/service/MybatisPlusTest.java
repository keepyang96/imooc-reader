package com.imooc.reader.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.reader.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisPlusTest {

    @Resource
    private TestMapper testMapper;

    @Test
    public void insertByMybatis(){
        testMapper.insertByMybatis();
    }

    @Test
    public void insert(){
        com.imooc.reader.entity.Test test = new com.imooc.reader.entity.Test();
        test.setContent("test mp");
        testMapper.insert(test);
    }

    @Test
    public void update(){
        com.imooc.reader.entity.Test test = testMapper.selectById("1001");
        test.setContent("update test");
        testMapper.updateById(test);
    }

    @Test
    public void delete(){
        testMapper.deleteById(1001);
    }

    @Test
    public void selectList(){
        List<com.imooc.reader.entity.Test> list = testMapper.selectList(new QueryWrapper<com.imooc.reader.entity.Test>().eq("id", 950));
        System.out.println(list);
    }
}
