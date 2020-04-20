package com.when.design_pattern.iterator_pattern.waitress;

import java.util.Arrays;

/**
 * @author: when
 * @create: 2019-06-11  16:11
 * @Description: TODO:
 **/
public class App {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress alice = new WaitressAlice(Arrays.asList(dinerMenu, pancakeHouseMenu));
        alice.printMenu();
    }
}
