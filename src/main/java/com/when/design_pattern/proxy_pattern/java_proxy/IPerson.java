package com.when.design_pattern.proxy_pattern.java_proxy;

/**
 * @author: when
 * @create: 2019-06-18  17:43
 * @Description: TODO:
 **/
interface IPerson {
    String getName();

    void setName(String name);

    String getGender();

    void setGender(String gender);

    String getInterests();

    void setInterests(String interests);

    int getHotOrNotRating();

    void setHotOrNotRating(int hotOrNotRating);
}
