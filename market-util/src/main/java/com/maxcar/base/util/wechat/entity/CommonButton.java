package com.maxcar.base.util.wechat.entity;

//二级菜单
public class CommonButton extends Button {
    private String type;        //菜单类型
    private String key;            //key值

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
