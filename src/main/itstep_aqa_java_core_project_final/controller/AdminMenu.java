package itstep_aqa_java_core_project_final.controller;

import java.awt.*;

public class AdminMenu extends Menu {
    private String[] adminMenu = {
            "1. Working with categories",
            "2. Working with assortment",
            "3. Working with product information",
            "4. Login change",
            "5. Exit from the program",
    };

    private String[] categoriesAdminMenu = {
            "1. Add category",
            "2. Change category",
            "3. Delete category",
            "4. Return",
    };

    private String[] assortmentAdminMenu = {
            "1. Add assortment",
            "2. Change assortment",
            "3. Delete assortment",
            "4. Return",
    };

    private String[] productInformationAdminMenu = {
            "1. Add product information",
            "2. Change product information",
            "3. Delete product information",
            "4. Return",
    };

    @Override
    public String[] getMenu() {
        return adminMenu;
    }

    public String[] getCategoriesAdminMenu() {
        return categoriesAdminMenu;
    }

    public String[] getAssortmentAdminMenu() {
        return assortmentAdminMenu;
    }

    public String[] getProductInformationAdminMenu() {
        return productInformationAdminMenu;
    }
}
