package tryCatch;

public class newTryFeatures {
    /*  from Java 1.7
        1- try with resources: here we done need to use finally block
            try(BufferedReader br = new BufferedReader(new FileReader("fileName.txt")) {
                    based on our requirement use br
            } catch(IOException e) {
                   Handling code..
            }
           here automatically br will be closed, we are not required to close BufferedReader explcitly
        2- multi catch block
     */
}
