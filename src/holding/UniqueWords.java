//: holding\UniqueWords.java

package holding;

import java.util.*;
import util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("README.md", "\\W+"));
        System.out.println(words);
    }
}
