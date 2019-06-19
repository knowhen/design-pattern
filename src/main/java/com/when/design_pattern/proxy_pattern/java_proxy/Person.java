package com.when.design_pattern.proxy_pattern.java_proxy;

/**
 * @author: when
 * @create: 2019-06-18  17:10
 * @Description: TODO:
 **/
public class Person implements IPerson {
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return ratingCount;
        }
        return rating / ratingCount;
    }

    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
