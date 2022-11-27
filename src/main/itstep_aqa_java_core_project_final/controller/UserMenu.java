package itstep_aqa_java_core_project_final.controller;

public class UserMenu extends Menu{
    private String[] userMenu = {
            "1. Category selection",
            "2. View assortment",
            "3. View product information",
            "4. Exit"
    };

    @Override
    public String[] getMenu() {
        return userMenu;
    }
}
