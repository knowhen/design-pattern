package com.when.design_pattern.listener_pattern;

import java.util.EventListener;

/**
 * @author: when
 * @create: 2019-09-06  16:43
 **/
public class CustomEventListener implements EventListener {
    // 事件发生后的回调
    public void fireCustomEvent(CustomEvent event) {
        EventSourceObject source = (EventSourceObject) event.getSource();
        System.out.println("my name is : " + source.getName());
    }
}
