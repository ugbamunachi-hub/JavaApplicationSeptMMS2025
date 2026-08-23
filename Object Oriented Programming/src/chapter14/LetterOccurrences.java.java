package chapter14;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LetterOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        int[] totals = new int[26];

        for (char c = 'a'; c <= 'z'; c++) {
            int position = text.toLowerCase().indexOf(c);
            while (position != -1) {
                totals[c - 'a']++;
                position = text.toLowerCase().indexOf(c, position + 1);
            }
        }

        System.out.println("Letter\tOccurrences");
        for (int i = 0; i < totals.length; i++) {
            System.out.printf("%c\t%d%n", (char)('A' + i), totals[i]);
        }
    }
}
