package itstep_aqa_java_core_project_final.servise.metodsForMenu.watch;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;

import java.util.List;

public class MethodWatch {
    private InformationScanner sc = new InformationScanner();

    private void watchedCategoriesList() {
        WorkWithFile createdCollection = new WorkWithFile();
        List<String> readFile = createdCollection.fileReader();
<<<<<<< HEAD
        System.out.println("Wine List ");
=======
        System.out.println("Список категорий: ");
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
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
<<<<<<< HEAD
        System.out.println("See the wine list again?: If Yes - click 1, No - 2)");
        String answerYes = "1";
        String answerNo = "2";
=======
        System.out.println("Хотите посмотреть список категорий ещё раз?(Да или Нет)");
        String answerYes = "Да";
        String answerNo = "Нет";
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
        String answer = sc.getWord();
        if (answer.equals(answerYes)) {
            watchedCategoriesList();
        } else if (answer.equals(answerNo)) {
<<<<<<< HEAD
            System.out.println("Ok, let's continue..");
        } else {
            System.out.println("You did not enter an answer!");
=======
            System.out.println("Ок, продолжаем.");
        } else {
            System.out.println("Вы ввели не ответ!");
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
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
