package itstep_aqa_java_core_project_final.servise;

import java.util.Scanner;

public class InformationScanner {

        private int scan() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        private String scanTwo() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        public int getNumberOfVarious() {
            return scan();
        }

        public String getWord() {
            return scanTwo();
        }
    }

