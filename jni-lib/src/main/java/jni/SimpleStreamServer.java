package jni;

public class SimpleStreamServer {
    static {
        if (!LibraryLoader.load(SimpleStreamServer.class, "simpleStreamServer"))
            System.loadLibrary("simpleStreamServer");
    }

    public String foo() {
        return "foo";
    }

    public native String bar();
}