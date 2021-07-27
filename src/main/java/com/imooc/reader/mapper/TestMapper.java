package com.imooc.reader.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.reader.entity.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper extends BaseMapper<Test> {
    int insertByMybatis();
}
