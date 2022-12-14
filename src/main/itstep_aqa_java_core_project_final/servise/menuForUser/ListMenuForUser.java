package itstep_aqa_java_core_project_final.servise.menuForUser;

import java.util.HashMap;

public class ListMenuForUser {
    private HashMap<Integer, String> NumberOfVarious = new HashMap<>();

    private void createdMenu() {
        System.out.println("Select menu item: ");
        NumberOfVarious.put(1, " See list of categories");
        NumberOfVarious.put(2, " Search category by name");
        NumberOfVarious.put(3, " Select the category of expenses you want to view in more detail");
        NumberOfVarious.put(5, " Exit");
        System.out.println(NumberOfVarious);
    }

    public void getCreatedMenu() {
        createdMenu();
    }

}
