package itstep_aqa_java_core_project_final.servise.menuForAdmin;

import itstep_aqa_java_core_project_final.servise.InformationScanner;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.addCategory.MethodForAddCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.deleteCategory.MethodDeleteCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.watch.MethodWatch;

import java.util.InputMismatchException;

public class MenuForAdmin {
    private ListMenuForAdmin listMenuForAdmin = new ListMenuForAdmin();
    private InformationScanner scanner = new InformationScanner();
    private MethodWatch watch = new MethodWatch();
    private MethodForAddCategory methodForAddCategory= new MethodForAddCategory();
    private MethodDeleteCategory methodDeleteCategory = new MethodDeleteCategory();
    private MethodSearchCategory methodCategorySearch = new MethodSearchCategory();
    private boolean end = true;



    private void menuOptions(){
        try {
            listMenuForAdmin.getCreatedMenu();
            int number = scanner.getNumberOfVarious();
            switch (number) {
                case 1:
                    watch.getWatchedCategoriesList();
                    break;
                case 2:
                    MethodForAddCategory.getAddNewCategory();
                    break;
                case 3:
                    methodDeleteCategory.getDeleteCategory();
                    break;
                case 4:
                    methodCategorySearch.getMethodSearchCategory();
                    break;
                case 5:
                    System.out.println("End of program");
                    System.exit(0);
                    end = false;
            }
        }catch (InputMismatchException e) {
            menuOptions();
        }
    }
        public void cycleForMenu() {
            MenuForAdmin menuForAdmin = new MenuForAdmin();
            do {
                menuForAdmin.menuOptions();
            } while (menuForAdmin.end);
        }

        public void getMenuOptions() {
            menuOptions();
    }

}
