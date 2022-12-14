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
<<<<<<< HEAD
                    methodSearchCategory.getCategorySearch();
                    break;
                case 3:
                    methodSearchCategory.getColorWineSearch();
                    break;
                case 4:
                    methodWatch.getWatchedAllList();
                    break;

=======
                    methodWatch.getWatchedAllList();
                    break;
                case 3:
                    methodSearchCategory.getSearchCategory();
                    break;
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
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
<<<<<<< HEAD
            menuForUser.menuOptions();
=======
            menuForUser.variousOfDoInMenu();
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
        } while (menuForUser.exit);
    }

    public void getVariousOfDoInMenu() {
<<<<<<< HEAD

        menuOptions();
=======
        variousOfDoInMenu();
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
    }


}
