package jni;

public class Runner {
    public static void main(String[] args) {
        SimpleStreamServer simpleStreamServer = new SimpleStreamServer();
        System.out.println(simpleStreamServer.foo() + simpleStreamServer.bar());
    }
}