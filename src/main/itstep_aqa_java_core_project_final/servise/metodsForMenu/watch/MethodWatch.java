package itstep_aqa_java_core_project_final.servise.metodsForMenu.watch;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;

import java.util.List;

public class MethodWatch {
    private InformationScanner sc = new InformationScanner();

    private void watchedCategoriesList() {
        WorkWithFile createdCollection = new WorkWithFile();
        List<String> readFile = createdCollection.fileReader();
        System.out.println("Список категорий: ");
        for (String s : readFile
        ) {
            String[] array = s.split(",");
            System.out.println(array[0] + ". " + array[1]);
        }
        System.out.println();
    }

    private void watchedAllList() {
        WorkWithFile createdCollection = new WorkWithFile();
        List<String> readBase = createdCollection.fileReader();
        for (String str : readBase) {
            System.out.println(str);
        }
    }

    private void choosingToViewListOfCategories() {
        WorkWithFile createdCollection = new WorkWithFile();
        List<String> readBase = createdCollection.fileReader();
        System.out.println("Хотите посмотреть список категорий ещё раз?(Да или Нет)");
        String answerYes = "Да";
        String answerNo = "Нет";
        String answer = sc.getWord();
        if (answer.equals(answerYes)) {
            watchedCategoriesList();
        } else if (answer.equals(answerNo)) {
            System.out.println("Ок, продолжаем.");
        } else {
            System.out.println("Вы ввели не ответ!");
            choosingToViewListOfCategories();
        }
    }

    public void getWatchedCategoriesList() {
        watchedCategoriesList();
    }

    public void getWatchedAllList() {
        watchedAllList();
    }

    public void getChoosingToViewListOfCategories() {
        choosingToViewListOfCategories();

    }
}
