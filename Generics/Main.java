// package Generics;

import java.util.ArrayList;
import java.util.List;

class Test <T> {
    T a;

}

public class Main {
    public static void main(String[] args) {
       Test<String> t = new Test<>();
       t.a = "abc";

    }
}
