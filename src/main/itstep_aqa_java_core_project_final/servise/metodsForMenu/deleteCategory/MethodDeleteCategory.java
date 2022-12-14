package itstep_aqa_java_core_project_final.servise.metodsForMenu.deleteCategory;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.watch.MethodWatch;

import java.util.List;

public class MethodDeleteCategory {
    private MethodWatch methodsWatch = new MethodWatch();
    private InformationScanner scanner = new InformationScanner();

    private List<String> deleteCategories() {
        WorkWithFile workWithFile = new WorkWithFile();
        List<String> readFile = workWithFile.fileReader();
        try {
            methodsWatch.getChoosingToViewListOfCategories();
            System.out.println("Введите номер категории которую хотите удалить: ");
            int l = scanner.getNumberOfVarious();
            readFile.remove(l);
            workWithFile.fileWriter();
            String x = "";
            for (int i = 0; i < readFile.size(); i++) {
                String str1 = readFile.get(i);
                String[] arr = str1.split(",");
                arr[0] = String.valueOf(((readFile.size() + i) - readFile.size()));
                for (int n = 0; n < arr.length; n++) {
                    x += arr[n];
                    if (n != arr.length - 1) {
                        x += ",";
                    }
                }
                readFile.set(i, x);
                x = "";
            }
            System.out.println(x);
            workWithFile.fileWriter();
            return readFile;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вы ввели неверное число");
            deleteCategories();
        }
        return readFile;
    }

    public void getDeleteCategories() {
        deleteCategories();
    }

}
