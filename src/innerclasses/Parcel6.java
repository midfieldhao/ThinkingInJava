//: innerclasses/Parcel6.java
// Nesting a class within a scope.

package innerclasses;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("silp");
            String s = ts.getSlip();
        }
        // Can't usr it here! Out of scope:
        //! TrackingSlip ts = new TrackingSlip("X");
    }
    public void track() {
        internalTracking(true);
    }
    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
