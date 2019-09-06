package com.when.design_pattern.listener_pattern;

import java.util.EventObject;

/**
 * @author: when
 * @create: 2019-09-06  16:41
 **/
public class CustomEvent extends EventObject {
    public static final long serialVersionId = 1l;
    private Object source;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source) {
        super(source);
        this.source = source;
    }

    @Override
    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
