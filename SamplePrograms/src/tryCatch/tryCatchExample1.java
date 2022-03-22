package SamplePrograms.src.tryCatch;

public class tryCatchExample1 {
    /*  All possible combiation of try - catch - finally
        Yes: try {
           }
           catch(x e) {
           }
        ---------
        No: try {
           }
           catch(x e) {
           }
           catch(x e) {     <<< -- Compile time error exception x already been caught
           }
        ---------
        Yes: try {
           }
           catch(x e) {     <<--- x - should be child  i.e. use ArithmeticException here
           }
           catch(y e) {     <<-- y - should be parent i.e. use Exception here
           }
        ---------
        Yes: try {
           }
           finally {
           }
     */
}
