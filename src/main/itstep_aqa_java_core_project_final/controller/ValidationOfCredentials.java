package itstep_aqa_java_core_project_final.controller;

import itstep_aqa_java_core_project_final.servise.menuForAdmin.MenuForAdmin;
import itstep_aqa_java_core_project_final.servise.menuForUser.MenuForUser;

import java.util.Scanner;

public class ValidationOfCredentials implements Menu {

    private final int passwordAdmin = 15963;

    private void validationOfCredentials () {
        MenuForAdmin menuForAdmin = new MenuForAdmin();
        MenuForUser menuForUser = new MenuForUser();
        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        if(passwordAdmin == password) {
            System.out.println("You admin");
            menuForAdmin.cycleForMenu();
        }else {
            System.out.println("You user");
            menuForUser.cycleForMenu();
        }
    }

    @Override
    public void startProgram() {
        validationOfCredentials();
    }
}
