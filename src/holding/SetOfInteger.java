//: holding\SetOfInteger.java

package holding;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(30);
            System.out.print(n+ " hashCode:" + new Integer(n).hashCode() + ", ");
            intset.add(n);
        }
        System.out.println("\n" + intset);
    }
}
