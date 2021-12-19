package FileExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*  FileWriter writes to a file by creating a file if is does not exist or writes to a existing file
        >>>> FileWriter is a lowest writing
        >>>> in this programmer has to manually add line separator
        >>>> And in some system \n is not considered as Line separator
        FileWriter constructors
        FileWriter f = new FileWriter(String fName); <-- Overrides file
        FileWriter f = new FileWriter(File fName); <-- Overrides file

        FileWriter f = new FileWriter(String fName, boolean append); <-- Appends file
        FileWriter f = new FileWriter(File fName, boolean append); <-- Appends file

        Methods of file writer
            1. write(int ch)
                to write a singe character
                e.g. f.write(100); >> O/P d
                    or f.write('d'); >> O/P d
            2. write(char[] ch);
            3. write(String s);
            4. flush(); >> to give the guarantee that total data including the last character is written properly to the file
            5. close(); >> we have to close after read or write operations
     */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt", true);
        fw.write(83);
        fw.write("unil Rao");
        fw.write("\n");
        char[] ch = {'a', 'b', 'c'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        fw.close();
        File f = new File("abc.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getCanonicalPath());
        System.out.println(f.isFile());
    }
}
