package itstep_aqa_java_core_project_final.servise.menuForAdmin;

import java.sql.SQLOutput;
import java.util.HashMap;

public class ListMenuForAdmin {
    private HashMap<Integer,String> MenuItems = new HashMap<>();

    private void createdMenu() {
        System.out.println("Select menu item: ");
        MenuItems.put(1, "See list of categories");
        MenuItems.put(2, "Add categories");
        MenuItems.put(3, "Delete categories");
        MenuItems.put(4, "Search by name");
        MenuItems.put(5, "Exit");
    }
    public void getCreatedMenu(){
        createdMenu();
    }
}
