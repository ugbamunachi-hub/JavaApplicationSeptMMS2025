package chapter14;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.print("Enter search character: ");
        char search = input.nextLine().charAt(0);

        int count = 0;
        int position = text.indexOf(search);
        while (position != -1) {
            count++;
            position = text.indexOf(search, position + 1);
        }

        System.out.println("Occurrences: " + count);
    }
}
