package itstep_aqa_java_core_project_final.servise.metodsForMenu.searchCategory;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;

import java.util.List;

public class MethodSearchCategory {
    private InformationScanner scanner = new InformationScanner();

    private List<String> categorySearch() {
        WorkWithFile workWithFile = new WorkWithFile();
        List<String> readFile = workWithFile.fileReader();
        System.out.println("Enter the title of the wine with a capital letter: ");
        String search = scanner.getWord();
        int y = 0;
        for (String str : readFile) {
            if (str.contains(search)) {
                System.out.println(str);
            } else {
                y++;
                if (y == readFile.size()) {
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
                }
            }
        }
        return readFile;
    }

    public void getCategorySearch() {

        categorySearch();
    }
    public void getColorWineSearch() {

        colorWineSearch();
    }

}
