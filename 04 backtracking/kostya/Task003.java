package ru.esmukov.Grammar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kostya Esmukov <kostya@esmukov.ru>
 * 402
 */

public class Task003 {

    public static void print(List<Integer> l) {
        for (Integer i : l) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static void dfs(List<Integer> v, int sum, int n) {
        if (v.size() == n) {
            print(v);
        } else {
            for (int i = 0; i <= 1; i++) {
                v.add(i);
                if (sum + i <= 2)
                    dfs(v, sum + i, n);
                v.remove(v.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        dfs(new ArrayList<Integer>(), 0, 7);
    }
}
