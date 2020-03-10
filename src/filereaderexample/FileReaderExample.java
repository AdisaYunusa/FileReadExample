
package filereaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\HP\\list.txt");
        if(file.canRead()) {
            try(FileReader fr = new FileReader(file);
                BufferedReader bur = new BufferedReader(fr)) {
                String line;
                while((line = bur.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("Finished reading !!!");
            } catch(IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        } else {
            System.out.println("File cannot be read");
        }
    }
    
}
