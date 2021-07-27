package com.imooc.reader.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("test")
public class Test {

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;

    // 如果相同或者符合驼峰命名规则是可以省略
    @TableField("content")
    private String content;

    public Test() {
    }

    public Test(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
