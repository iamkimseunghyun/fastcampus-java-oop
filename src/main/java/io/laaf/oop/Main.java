package io.laaf.oop;

import io.laaf.oop.logic.BubbleSort;
import io.laaf.oop.logic.JavaSort;
import io.laaf.oop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
