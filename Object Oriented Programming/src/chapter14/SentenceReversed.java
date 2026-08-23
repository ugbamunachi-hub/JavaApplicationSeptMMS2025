
package chapter14;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class SentenceReversed {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = JOptionPane.showInputDialog(
"Enter a sentence: ");
        
  String[] words = sentence.split(" ");    
     
     
        JTextArea output = new JTextArea();
        
        output.setText("Reversed sentence:\n");

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i] + " ");
        }

        JOptionPane.showMessageDialog(null, output);
    }
     }

