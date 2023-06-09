//: strings\ArrayListDisplay.java

package strings;

import generics.coffee.*;
import java.util.*;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10))
          coffees.add(c);
        System.out.println(coffees);
    }
}
