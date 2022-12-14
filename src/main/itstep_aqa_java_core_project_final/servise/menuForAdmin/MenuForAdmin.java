package itstep_aqa_java_core_project_final.servise.menuForAdmin;

import itstep_aqa_java_core_project_final.servise.InformationScanner;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.addCategory.MethodForAddCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.changeCategory.MethodForChangeCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.deleteCategory.MethodDeleteCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.searchCategory.MethodSearchCategory;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.watch.MethodWatch;

import java.util.InputMismatchException;

public class MenuForAdmin {
    private ListMenuForAdmin listMenuForAdmin = new ListMenuForAdmin();
    private InformationScanner scanner = new InformationScanner();
    private MethodWatch watch = new MethodWatch();
    private MethodForAddCategory methodForAddCategory= new MethodForAddCategory();
    private MethodDeleteCategory methodDeleteCategory = new MethodDeleteCategory();
    private MethodSearchCategory methodSearchCategory = new MethodSearchCategory();

    private MethodForChangeCategory changeCategory = new MethodForChangeCategory();
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
                    methodForAddCategory.getAddNewCategory();
                    break;
                case 3:
                    methodDeleteCategory.getDeleteCategories();
                    break;
                case 4:
                    methodSearchCategory.getCategorySearch();
                    break;
                case 5:
                    watch.getWatchedAllList();
                    break;
                case 6:
                    changeCategory.getChangeInformation();
                    break;

                case 7:
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
