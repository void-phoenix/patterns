package patterns.proxy;


import patterns.proxy.proxy.Proxy;

public class Launcher {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.doSomething();
    }

}
