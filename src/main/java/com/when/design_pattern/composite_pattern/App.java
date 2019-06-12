package com.when.design_pattern.composite_pattern;

/**
 * @author: when
 * @create: 2019-06-12  10:13
 * @Description: 组合迭代器的hasNext(),next()方法部分捋清思路；组合模式父子节点指针部分待完善。
 **/
public class App {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Lunch");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENU", "All menus combine");
        allMenus.add(pancakeMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinnerMenu.add(new MenuItem("Soup of the day", "Soup with a side of potato salad", false, 3.29));
        dinnerMenu.add(new MenuItem("Hot dog", "Hot dog with relish, onions, topped with cheese", false, 3.05));

        pancakeMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fired eggs and sausage", false, 2.99));
        pancakeMenu.add(new MenuItem("Blueberry Pancake Breakfast", "Pancakes made with fresh blueberries", true, 3.49));

        dinnerMenu.add(new MenuItem(
                "Pasta", "Marinara Sauce, and a slice of bread", true, 3.89));
        dinnerMenu.add(new MenuItem(
                "Apple pie", "Apple pie with a flakey crust", true, 1.59));
        dinnerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.print();
        waitress.printVegetarianMenu();

    }
}
