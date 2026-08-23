package chapter14;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number (555) 555-5555: ");
        String phone = input.nextLine();

        String[] parts = phone.split("[()\\- ]+");
        if (parts.length >= 3) {
            String areaCode = parts[0].trim();
            String number = parts[1] + parts[2];
            System.out.println("Area code: " + areaCode);
            System.out.println("Phone number: " + number);
        } else {
            System.out.println("Invalid format.");
        }
    }
}
