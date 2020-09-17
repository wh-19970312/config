package com.eshore.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Wen Hao
 * @Date 2020/9/11 15:04
 */
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        //开始自动填充  增加的方法
        this.strictUpdateFill(metaObject, "createTime", () -> LocalDateTime.now(), LocalDateTime.class);

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        //开始自动填充修改时的方法
        this.strictUpdateFill(metaObject, "updateTime", () -> LocalDateTime.now(), LocalDateTime.class);

    }
}