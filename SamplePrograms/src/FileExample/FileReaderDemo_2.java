package SamplePrograms.src.FileExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo_2 {
    public static void main(String[] args) throws IOException {
        //================== read file using int read(char[] ch);
        System.out.println("================== read file using int read(char[] ch); ==================");
        File f = new File("abc.txt");
        char[] charArray = new char[(int) f.length()];
        FileReader frArr = new FileReader(f);
        frArr.read(charArray);
        for (char ch : charArray) {
            System.out.print(ch);
        }
        frArr.close();
    }
}
