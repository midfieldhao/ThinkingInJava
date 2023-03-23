//: exceptions\MainException.java

package exceptions;

import java.io.*;

public class MainException {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("README.md");
        // Use the file ...
        // Close the file:
        file.close();    
    }
}