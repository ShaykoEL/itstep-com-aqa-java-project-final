package itstep_aqa_java_core_project_final.servise.metodsForMenu.changeCategory;

import itstep_aqa_java_core_project_final.dao.WorkWithFile;
import itstep_aqa_java_core_project_final.servise.InformationScanner;
import itstep_aqa_java_core_project_final.servise.metodsForMenu.watch.MethodWatch;

import java.util.List;
import java.util.Scanner;

public class MethodForChangeCategory {
    private MethodWatch methodWatch = new MethodWatch();
    private InformationScanner scanner = new InformationScanner();

    public List<String> changeInformation() {
        WorkWithFile workWithFile = new WorkWithFile();
        List<String> readFile = workWithFile.fileReader();
        try {
            methodWatch.getWatchedAllList();
            System.out.println("Enter the number of the line you want to change: ");
            int l = scanner.getNumberOfVarious();
            String s = readFile.get(l - 1);
            System.out.println(s);
            System.out.println("Enter the cell number you want to change: ");
            int num = scanner.getNumberOfVarious();
            System.out.println("Enter a new value: ");
            Scanner scanner = new Scanner(System.in);
            String num2 = scanner.nextLine();
            String[] arr = s.split(",");
            int num3 = num;
            arr[num - 1] = num2;
            String newLineInList = "";
            for (int i = 0; i < arr.length; i++) {
                newLineInList += arr[i];
                if (i != arr.length - 1) {
                    newLineInList += ",";
                }
            }
            readFile.set(l - 1, newLineInList);
            workWithFile.fileWriter();
            System.out.println(newLineInList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You entered an invalid number");
            changeInformation();
        }
        return readFile;
    }

    public void getChangeInformation() {
        changeInformation();
    }

}
