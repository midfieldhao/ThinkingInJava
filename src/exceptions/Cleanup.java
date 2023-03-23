//: exceptions\Cleanup.java

package exceptions;

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("README.md");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    // Perform line-by-line processing here...
                } 
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
