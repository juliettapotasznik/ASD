package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tablica = {"1", "f", "44", "a", "!" ,",","z"};
        Arrays.sort(tablica);

        for (String element : tablica) {
            System.out.println(element);
        }


    }
}