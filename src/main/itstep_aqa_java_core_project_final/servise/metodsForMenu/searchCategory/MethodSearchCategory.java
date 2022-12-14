package itstep_aqa_java_core_project_final.servise.metodsForMenu.searchCategory;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;

import java.util.List;

public class MethodSearchCategory {
    private InformationScanner scanner = new InformationScanner();

    private List<String> categorySearch() {
        WorkWithFile workWithFile = new WorkWithFile();
        List<String> readFile = workWithFile.fileReader();
<<<<<<< HEAD
        System.out.println("Enter the title of the wine with a capital letter: ");
=======
        System.out.println("Введите имя категории, которую хотите найти с большой буквы: ");
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
        String search = scanner.getWord();
        int y = 0;
        for (String str : readFile) {
            if (str.contains(search)) {
                System.out.println(str);
            } else {
                y++;
                if (y == readFile.size()) {
<<<<<<< HEAD
                    System.out.println("Not found.");
                }
            }
        }
        return readFile;
    }
    private List<String> colorWineSearch() {
        WorkWithFile workWithFile = new WorkWithFile();
        List<String> readFile = workWithFile.fileReader();
        System.out.println("Enter the color of the wine with a small letter: red or white ");
        String search = scanner.getWord();
        int y = 0;
        for (String str : readFile) {
            if (str.contains(search)) {
                System.out.println(str);
            } else {
                y++;
                if (y == readFile.size()) {
                    System.out.println("Not found.");
=======
                    System.out.println("Категория не найдена.");
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
                }
            }
        }
        return readFile;
    }

    public void getCategorySearch() {
<<<<<<< HEAD

        categorySearch();
    }
    public void getColorWineSearch() {

        colorWineSearch();
    }

=======
        categorySearch();
    }
>>>>>>> ec647149b4aabad6b1489cffe68461f44f0a0152
}
