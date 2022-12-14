package itstep_aqa_java_core_project_final.servise.menuForAdmin;

import java.sql.SQLOutput;
import java.util.HashMap;

public class ListMenuForAdmin {
    private HashMap<Integer,String> MenuItems = new HashMap<>();

    private void createdMenu() {
        System.out.println("Select menu item: ");
        MenuItems.put(1, "See list of wine");
        MenuItems.put(2, "Add line");
        MenuItems.put(3, "Delete line");
        MenuItems.put(4, "Search for wine by title");
        MenuItems.put(5, "See all list in detail");
        MenuItems.put(6, "Change information");
        MenuItems.put(7, "Exit");
        System.out.println(MenuItems);
    }
    public void getCreatedMenu(){
        createdMenu();
    }
}
