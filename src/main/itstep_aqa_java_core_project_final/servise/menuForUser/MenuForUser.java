package itstep_aqa_java_core_project_final.servise.menuForUser;

import itstep_aqa_java_core_project_final.servise.InformationScanner;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.searchCategory.MethodSearchCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.watch.MethodWatch;

import java.util.InputMismatchException;

public class MenuForUser {
    private boolean exit = true;
    ListMenuForUser listMenuForUser = new ListMenuForUser();
    InformationScanner scanner = new InformationScanner();
    MethodWatch methodWatch = new MethodWatch();
    MethodSearchCategory methodSearchCategory = new MethodSearchCategory();

    private void menuOptions() {
        try {
            listMenuForUser.getCreatedMenu();
            int number = scanner.getNumberOfVarious();
            switch (number) {
                case 1:
                    methodWatch.getWatchedCategoriesList();
                    break;
                case 2:
                    methodSearchCategory.getCategorySearch();
                    break;
                case 3:
                    methodSearchCategory.getColorWineSearch();
                    break;
                case 4:
                    methodWatch.getWatchedAllList();
                    break;

                case 5:
                    System.out.println("End of program");
                    System.exit(0);
                    exit = false;
            }
        } catch (InputMismatchException e) {
            menuOptions();
        }
    }

    public void cycleForMenu() {
        MenuForUser menuForUser = new MenuForUser();
        do {
            menuForUser.menuOptions();
        } while (menuForUser.exit);
    }

    public void getVariousOfDoInMenu() {

        menuOptions();
    }


}
