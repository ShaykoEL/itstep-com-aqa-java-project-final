package itstep_aqa_java_core_project_final.servise.menuForUser;

import java.util.HashMap;

public class ListMenuForUser {
<<<<<<< HEAD
    private HashMap<Integer, String> MenuItems = new HashMap<>();

    private void createdMenu() {
        System.out.println("Select menu item: ");
        MenuItems.put(1, "See list of titles wines");
        MenuItems.put(2, "Search for wine by title");
        MenuItems.put(3, "Search for wine by color");
        MenuItems.put(4, "See all list in detail");
        MenuItems.put(5, "Exit");
        System.out.println(MenuItems);
=======
    private HashMap<Integer, String> NumberOfVarious = new HashMap<>();

    private void createdMenu() {
        System.out.println("Select menu item: ");
        NumberOfVarious.put(1, " See list of categories");
        NumberOfVarious.put(2, " Search category by name");
        NumberOfVarious.put(3, " Select the category of expenses you want to view in more detail");
        NumberOfVarious.put(5, " Exit");
        System.out.println(NumberOfVarious);
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
    }

    public void getCreatedMenu() {
        createdMenu();
    }

}
