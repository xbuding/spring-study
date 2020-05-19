package com.runbarry.spring.ioc.boot.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Member {

    private String name;

    private Integer level;

    private String remark;

    public Member() {
        log.info("Member的构造函数被执行啦");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void initMethodTest() {
        log.info("我是bean初始化方法");
    }

    public void destroyMethodTest() {
        log.info("我是bean destroy 方法");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", remark='" + remark + '\'' +
                '}';
    }
}
