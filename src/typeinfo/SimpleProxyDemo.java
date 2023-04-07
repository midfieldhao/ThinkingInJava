//: typeinfo\SimpleProxyDemo.java

package typeinfo;

import static util.Print.*;

interface Interface {
    void doSimething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSimething() { print("doSomething"); }
    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSimething() {
        print("SimpleProxy doSimething");
        proxied.doSimething();
    }
    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSimething();
        iface.somethingElse("bonbon");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
