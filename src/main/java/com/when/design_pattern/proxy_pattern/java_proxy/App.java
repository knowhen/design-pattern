package com.when.design_pattern.proxy_pattern.java_proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * @author: when
 * @create: 2019-06-18  16:29
 * @Description: TODO:
 **/
public class App {
    HashMap<String, IPerson> datingDB = new HashMap<>();

    public static void main(String[] args) {
        App test = new App();
        test.drive();
    }

    public App() {
        initializeDatabase();
    }

    public void drive() {
        IPerson joe = getIPersonFromDatabase("Joe Javabean");
        IPerson ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        IPerson nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    IPerson getOwnerProxy(IPerson person) {

        return (IPerson) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    IPerson getNonOwnerProxy(IPerson person) {

        return (IPerson) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    IPerson getIPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    void initializeDatabase() {
        IPerson joe = new Person();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        IPerson kelly = new Person();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
