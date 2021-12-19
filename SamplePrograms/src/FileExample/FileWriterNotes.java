package FileExample;

public class FileWriterNotes {

    /*  FileWriter writes to a file by creating a file if is does not exist or writes to a existing file
        FileWriter constructors
        FileWriter f = new FileWriter(String fName); <-- Overrides file
        FileWriter f = new FileWriter(File fName); <-- Overrides file

        FileWriter f = new FileWriter(String fName, boolean append); <-- Appends file
        FileWriter f = new FileWriter(File fName, boolean append); <-- Appends file

        Methods of file writer
            1. write(int ch)
                to write a singe character
                e.g. f.write(100); >> O/P b
                    or f.write('b'); >> O/P b
            2. write(char[] ch);
            3. write(String s);
            4. flush(); >> to give the guarantee that total data including the last character is written properly to the file
            5. close(); >> we have to close after read or write operations
     */
}
