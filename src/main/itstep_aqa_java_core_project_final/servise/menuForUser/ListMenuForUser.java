package itstep_aqa_java_core_project_final.servise.menuForUser;

import java.util.HashMap;

public class ListMenuForUser {
    private HashMap<Integer, String> MenuItems = new HashMap<>();

    private void createdMenu() {
        System.out.println("Select menu item: ");
        MenuItems.put(1, "See list of titles wines");
        MenuItems.put(2, "Search for wine by title");
        MenuItems.put(3, "Search for wine by color");
        MenuItems.put(4, "See all list in detail");
        MenuItems.put(5, "Exit");
        System.out.println(MenuItems);
    }

    public void getCreatedMenu() {
        createdMenu();
    }

}
