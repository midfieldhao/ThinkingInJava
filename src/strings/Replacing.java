//: strings\Replacing.java

package strings;

import static util.Print.*;

public class Replacing {
    static String s = Splitting.Knights;
    public static void main(String[] args) {
        print(s.replaceFirst("f\\w+", "located"));
        print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
