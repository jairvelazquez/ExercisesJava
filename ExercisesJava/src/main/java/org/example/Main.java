package org.example;

import org.example.utils.KeyboardEntry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String example = KeyboardEntry.enterLine("Give me your name: ");
        System.out.println("Example: "+ example);
    }
}