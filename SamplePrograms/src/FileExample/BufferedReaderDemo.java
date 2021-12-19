package FileExample;

import java.io.*;

public class BufferedReaderDemo {
    /*
        Constructors:
        BufferedReader br = new BufferedReader(Reader r);
        BufferedReader br = new BufferedReader(Reader r, int bufferSize);
        Methods:
        1. int read()
        2. int read(char[] ch)
        3. void close()
   >>>> 4. String readLine();  it attempts to read next line from a file and returns it.
                                if there are no new lines it will return null
     */

    public static void main(String[] args) {
        File f = new File("abc.txt");
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            while(br.readLine() != null) {
                System.out.println(line);
                line = br.readLine();
            }
            // br.close(); This is not needed because try-with resource will call close()
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
