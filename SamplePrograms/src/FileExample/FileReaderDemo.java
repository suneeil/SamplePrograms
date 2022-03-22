package SamplePrograms.src.FileExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    /*  FileReader is the low level reader to read data from a file
        FileReader is used to read character or text data from a file
        Constructors:
        FileReader fr = new FileReader(String fName);
        FileReader fr = new FileReader(File file);
        Method:
        1. int read(); int is the unicode value of character
        2. int read(char[] ch);
        3. void close();
     */
    public static void main(String[] args) throws IOException {
        //================== read file using int read();
        FileReader fr1 = new FileReader("abc.txt");
        System.out.println(fr1.read());
        System.out.println((char)fr1.read());
        fr1.close();
        System.out.println("------------------");
        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();
        while(i != -1) {
            System.out.print((char)i);
            i = fr.read();
        }
        fr.close();


    }


}
