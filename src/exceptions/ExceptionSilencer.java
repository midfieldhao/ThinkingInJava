//: eceptions\ExceptionSilencer.java

package exceptions;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using "ruturn" inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
}
