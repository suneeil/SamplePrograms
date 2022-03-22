package SamplePrograms.src.FileExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    /*
        Constructor:
        1. BufferedWriter bw = new BufferedWriter(writer w);  <<<  BufferedWrite can't communicate directly with the file, it can communicate
         via some other writer object only
        2. BufferedWriter bw = new BufferedWriter(writer w, int bufferSize); <<< This is not used frequently
        e.g. BufferedWriter bw1 = new BufferedWriter(new FileWriter("abc.txt"));
        e.g. BufferedWriter bw2 = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt")));

        Methods:
       __ 1. write(int ch) >> to write single character
       |  2. write(char[] ch) >> to write any array of characters to the file
       |  3. write(String s)
       |  4. flush()
       -- 5. close()
          6. newLine()

     */
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch = {'a', 'b', 'D','x', 'y', 'Z'};
        bw.write(ch);
        bw.newLine();
        bw.write("SUNIL RAO");
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static void sameAsAbove() {
        File f = new File("abc.txt");
        try (FileWriter fw = new FileWriter(f, true);
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(100);
            bw.newLine();
            char[] ch = {'a', 'b', 'D','x', 'y', 'Z'};
            bw.write(ch);
            bw.newLine();
            bw.write("SUNIL RAO");
            bw.newLine();
            bw.flush();
            // bw.close();  This is not needed since try with resource will close()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
