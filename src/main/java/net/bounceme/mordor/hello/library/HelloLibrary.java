package net.bounceme.mordor.hello.library;

public class HelloLibrary {

    public String hello(String... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello world ");
        for (String str : args) {
            sb.append(str + " ");
        }
        return sb.toString();
    }
}
