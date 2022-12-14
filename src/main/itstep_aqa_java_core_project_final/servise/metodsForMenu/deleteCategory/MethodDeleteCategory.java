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
            System.out.println("Enter the number of the string you want to delete: ");
            int l = scanner.getNumberOfVarious();
            readFile.remove(l - 1);
            workWithFile.fileWriter();
            String x = "";
            for (int i = 0; i < readFile.size(); i++) {
                String str1 = readFile.get(i);
                String[] arr = str1.split(",");
                int z  = readFile.size();
                arr[0] = String.valueOf((z+i) - (z-1));
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
            System.out.println("No such number");
            deleteCategories();
        }
        return readFile;
    }

    public void getDeleteCategories() {

        deleteCategories();
    }

}
