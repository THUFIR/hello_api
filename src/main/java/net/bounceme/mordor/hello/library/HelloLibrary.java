package net.bounceme.mordor.hello.library;

import java.util.Arrays;

public class HelloLibrary {

    public String hello(String... args) {
        return "hello world " + Arrays.toString(args);
    }
}
