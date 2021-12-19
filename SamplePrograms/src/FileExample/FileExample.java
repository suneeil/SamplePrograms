package FileExample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String path = "/Users/sunilrao/Documents/ElectrictyBill";
        String fileName1 = "Jan.txt";
        String fileName2 = "Feb.txt";
        String fileName3 = "Mar.txt";
        String fileName4 = "Apr.txt";

        File f0 = new File(path);
        System.out.println(f0.exists());

        File f1 = new File(f0, fileName1);
        System.out.println(">>>> Before: " + f1.exists());
        f1.createNewFile();
        System.out.println(">>>> After: " + f1.exists());

        //File f1 = new File("", "");
        checkFileExists(f1);
        System.out.println("Create file1: " + createFileInSubDirectory(path, fileName2));
        System.out.println("Create file2: " +createFileInSubDirectory(path, fileName3));
        System.out.println("Create file3: " +createFileInSubDirectory(path, fileName4));

        System.out.println(f0.isDirectory());

        File fileLen = new File(path, fileName1);
        System.out.println("Get the length of the file: " + fileLen.length());
        //================== List files in directory ========================
        File getFileInDir = new File(path);
        File[] listOfFile = getFileInDir.listFiles();
        System.out.println("Files in the Directory: " );
        Arrays.stream(listOfFile).forEach(System.out::println);
        //===================List all hidden files =======================
        List<File> hiddenFile = Arrays.stream(listOfFile).filter(fi -> fi.isHidden()).collect(Collectors.toList());
        System.out.println("Hidden Files are: " + hiddenFile);
        //================== List all pdf files ========================
        List<File> pdfFiles = Arrays.stream(listOfFile).filter(fi -> fi.getName().contains(".pdf")).collect(Collectors.toList());
        System.out.println("Pdf files: " + pdfFiles);
    }

    private static void checkFileExists(File f) {
        System.out.println(">>>>>>>>>>>>>> Does file exist: " + f.exists());
    }

    private static boolean createFileInSubDirectory(String subDirectory, String file) throws IOException {
        File f = new File(subDirectory, file);
        return f.createNewFile();
    }

    private static long getFileLength(File file) {
        return file.length();
    }
}
