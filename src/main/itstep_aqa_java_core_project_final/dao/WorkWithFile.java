package itstep_aqa_java_core_project_final.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkWithFile {
    private List<String> readBase = new ArrayList<>();


    public List fileReader() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\file_wine.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                readBase.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readBase;
    }

    public List fileWriter() {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\src\\main\\resources\\file_wine.txt"));
            for (String str1 : readBase
            ) {
                bufferedWriter.write(str1);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return readBase;
    }
}



