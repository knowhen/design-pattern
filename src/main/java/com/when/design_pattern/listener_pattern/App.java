package com.when.design_pattern.listener_pattern;

/**
 * @author: when
 * @create: 2019-09-06  16:47
 **/
public class App {
    public static void main(String[] args) {
        EventSourceObject object = new EventSourceObject();
        //注册监听器
        CustomEventListener listener = new CustomEventListener();

        object.addCusListener(listener);
        //触发事件
        object.setName("eric");
    }
}
