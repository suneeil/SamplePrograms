package SamplePrograms.src.FileExample;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    /*
    with fileWriter we have below issue
    1. Print new line
     and since BufferedWriter interacts with FileWriter we have  the issues are
     1. bw.write(100) >>> will write the corresponding character 'd' will be added
     2. say you want to write 100 to a file then we need to pass in the form of String, because of which performance will
        be down.
        e.g. bw.write("100");
     3. bw.write("10.5") >>>> say you want to write 10.5 to a file then we need to pass in the form of String,
        because of which performance will be down.
     4. bw.write("false") >>>>> say you want to write boolean value to a file then we need to pass in the form of String,
        because of which performance will be down.
      Note:  To overcome this problem we need to use PrintWriter.
        We can write any type of data

       Constructor:
       1. PrintWriter pw = new PrintWriter(String fileName);
       2. PrintWriter pw = new PrintWriter(File f);
       3. PrintWriter pw = new PrintWriter(Writer w);

       Methods:
       1. write(int ch)
       2. write(char[] ch)
       3. write(String s)
       4. flush()
       5. close()
       along with the fileWriter methods it some methods like
       6. print(char ch)        | 11. println(char ch)
       7. print(int i)          | 12. println(int i)
       8. print(double d)       | 13. println(double d)
       9. print(boolean b)      | 14. println(boolean b)
       10. print(String s)      | 15. println(String s)
     */

    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter("abcd.txt")) {
            pw.write(100); //o/p - d
            pw.println();
            pw.println(100); //o/p - 100
            pw.println(true);
            pw.println(10.5);
            pw.println("Sunil");
            pw.flush();
            //pw.close(); not needed to call close() method since try-with resource will close()
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //========  example-2
        try(PrintWriter pw = new PrintWriter(new FileWriter("xyz.txt", true))) {
            pw.write(100); //o/p - d
            pw.println();
            pw.println(100); //o/p - 100
            pw.println(true);
            pw.println(10.5);
            pw.println("Sunil");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
