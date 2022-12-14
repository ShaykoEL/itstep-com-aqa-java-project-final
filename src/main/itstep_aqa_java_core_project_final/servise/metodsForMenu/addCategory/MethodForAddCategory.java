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
        System.out.println("The string  number you are adding: " + readFile.size());
        System.out.println("Enter a new string: ");
        String newCategories = scanner.getWord();
        readFile.add(newCategories);

        workWithFile.fileReader();
        return readFile;
    }

    public void getAddNewCategory() {
        addNewCategory();

        }
    }

