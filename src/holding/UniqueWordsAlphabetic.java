//: holding\UniqueWordsAlphabetic.java
// Producing an alphabetic listing.

package holding;

import java.util.*;
import util.*;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("README.md","\\W+"));
        System.out.println(words);
    }
}
