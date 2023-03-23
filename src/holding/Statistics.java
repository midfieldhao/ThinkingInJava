//: holding\Statistics.java
// Simple demonstration of HashMap.

package holding;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freg = m.get(r);
            m.put(r, freg == null ? 1 : freg + 1);
        }
        System.out.println(m);
    }
}
