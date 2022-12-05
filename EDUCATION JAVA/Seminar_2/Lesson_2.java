package Seminar_2;
/*
Задание 5. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции.
В случае возникновения исключения, оно должно записаться в лог-файл.
 */

import java.io.File;
import java.io.FileWriter;

public class Lesson_2 {


    public static void main(String[] args) {
        File dir = new File(".");
//        System.out.println(dir.getAbsolutePath());
        File[] filesList = dir.listFiles();
//        List<String> l = new ArrayList<>();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.printf(" %s\n", file.getName());
            } else {
                System.out.println(file.getName());
            }

        try (FileWriter fw = new FileWriter("C:\\Users\\osavitskiy\\Documents\\JAVA\\EDUCATION JAVA\\Seminar_2\\Lesson_2.txt", false)) {
            for (File f : filesList) {
                fw.write(f.toString());
                fw.write("\n");
            }
        } catch (Exception e) {
        } finally {
            System.out.println();
        }
        }

//        String pathFile = "C:\\Users\\osavitskiy\\Documents\\JAVA\\EDUCATION JAVA\\Seminar_2\\example.txt";
//
//
//        String line = "empty";
//        try {
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created");
//            } else {
//                BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                System.out.println("file.existed");
//                line = bufReader.readLine();
//                bufReader.close();
//            }
//        } catch (Exception e) {
//            //e.printStackTrace();
//        } finally {
//            System.out.println(line);
//        }
//
//    }
//    public static void saveFiles(File[] file) {
//        for (File f : file) {
//            if (f.isFile()) {
//                System.out.printf(" %s\n", f.getName());
//            } else {
//                System.out.println(f.getName());
//            }
//        }
    }
}