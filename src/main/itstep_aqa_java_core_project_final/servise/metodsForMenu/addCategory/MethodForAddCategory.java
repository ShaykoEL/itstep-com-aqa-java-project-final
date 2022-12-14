package itstep_aqa_java_core_project_final.servise.metodsForMenu.addCategory;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.watch.MethodWatch;

import java.util.List;

public class MethodForAddCategory {
    private MethodWatch methodWatch = new MethodWatch();
    private InformationScanner scanner = new InformationScanner();

    private List<String> addNewCategory(){
        WorkWithFile workWithFile = new WorkWithFile();
        List<String> readFile = workWithFile.fileReader();
        methodWatch.getChoosingToViewListOfCategories();
<<<<<<< HEAD
        System.out.println("The string  number you are adding: " + readFile.size());
        System.out.println("Enter a new string: ");
=======
        System.out.println("Номер категории, которую вы добавляете: " + readFile.size());
        System.out.println("Введите новую категорию согласно примеру(номер категории, название в кавычках, значение рассходов через запятую(Все через запятую и без пробелов)): ");
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
        String newCategories = scanner.getWord();
        readFile.add(newCategories);

        workWithFile.fileReader();
        return readFile;
    }

    public void getAddNewCategory() {
        addNewCategory();

        }
    }

