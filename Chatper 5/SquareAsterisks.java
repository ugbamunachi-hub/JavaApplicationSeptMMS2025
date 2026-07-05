//5.18java
import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side length: ");
        int side = input.nextInt();
        
        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
Use code with caution.5.19javaimport java.util.Scanner;

public class SquareCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side length: ");
        int side = input.nextInt();
        
        System.out.print("Enter character: ");
        char fill = input.next().charAt(0);
        
        squareOfCharacters(side, fill);
    }

    public static void squareOfCharacters(int side, char fillCharacter) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
Use code with caution.5.20javaimport java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        double area = circleArea(radius);
        System.out.printf("The area of the circle is: %.2f%n", area);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
Use code with caution.5.21javaimport java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();
        
        displayDigits(number);
    }

    public static int getQuotient(int a, int b) {
        return a / b;
    }

    public static int getRemainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        int divisor = 10000;
        boolean started = false;
        
        while (divisor > 0) {
            int digit = getQuotient(number, divisor);
            
            if (digit > 0 || started || divisor == 1) {
                System.out.print(digit + "  ");
                started = true;
            }
            
            number = getRemainder(number, divisor);
            divisor = getQuotient(divisor, 10);
        }
        System.out.println();
    }
}
Use code with caution.5.22javaimport java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            int fahrenheit = input.nextInt();
            System.out.printf("Celsius equivalent: %d%n", celsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            int celsius = input.nextInt();
            System.out.printf("Fahrenheit equivalent: %d%n", fahrenheit(celsius));
        }
    }

    public static int celsius(int fahrenheit) {
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }

    public static int fahrenheit(int celsius) {
        return (int) (9.0 / 5.0 * celsius + 32);
    }
}
Use code with caution.5.23javaimport java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three floating-point numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        double smallest = minimum3(num1, num2, num3);
        System.out.printf("The smallest value is: %f%n", smallest);
    }

    public static double minimum3(double a, double b, double a3) {
        return Math.min(a, Math.min(b, a3));
    }
}
Use code with caution.5.24javapublic class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                displayFactors(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void displayFactors(int number) {
        System.out.print(number + " is perfect. Factors: ");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
Use code with caution.5.25javapublic class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.printf("%nTotal primes found: %d%n", count);
        System.out.println("To find all primes up to n, we must test all numbers up to n.");
    }

    // Part c optimized version using square root limit
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
Use code with caution.5.26javaimport java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        System.out.printf("Reversed number: %d%n", reverse(number));
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
Use code with caution.5.27javaimport java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        
        System.out.printf("The GCD is: %d%n", gcd(num1, num2));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
Use code with caution.5.28javaimport java.util.Scanner;

public class GradePoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student's average: ");
        int average = input.nextInt();
        
        System.out.printf("Quality points: %d%n", qualityPoints(average));
    }

    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) return 4;
        if (average >= 80 && average <= 89) return 3;
        if (average >= 70 && average <= 79) return 2;
        if (average >= 60 && average <= 69) return 1;
        return 0;
    }
}
Use code with caution.5.29javaimport java.util.Scanner;
import java.util.Random;

public class CoinToss {
    private enum Coin { HEADS, TAILS };
    private static final Random randomNumbers = new Random();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        
        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            
            if (choice != 1) break;
            
            Coin result = flip();
            if (result == Coin.HEADS) {
                headsCount++;
                System.out.println("Result: HEADS");
            } else {
                tailsCount++;
                System.out.println("Result: TAILS");
            }
            
            System.out.printf("Score -> Heads: %d, Tails: %d%n%n", headsCount, tailsCount);
        }
    }

    public static Coin flip() {
        if (randomNumbers.nextInt(2) == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}
Use code with caution.5.30javaimport java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumbers = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int secretNumber = 1 + randomNumbers.nextInt(1000);
            System.out.println("Guess a number between 1 and 1000.");
            int guess = 0;
            
            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                
                if (guess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                }
            }
            
            System.out.println("Congratulations. You guessed the number!");
            System.out.print("Play again? (1 for Yes, 0 for No): ");
            playAgain = input.nextInt() == 1;
        }
    }
}
Use code with caution.5.31javaimport java.util.Scanner;
import java.util.Random;

public class GuessNumberModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumbers = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int secretNumber = 1 + randomNumbers.nextInt(1000);
            System.out.println("Guess a number between 1 and 1000.");
            int guess = 0;
            int guessCount = 0;
            
            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                guessCount++;
                
                if (guess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                }
            }
            
            System.out.println("Congratulations. You guessed the number!");
            System.out.printf("Total guesses: %d%n", guessCount);
            
            if (guessCount < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else if (guessCount == 10) {
                System.out.println("Aha! You know the secret!");
            } else {
                System.out.println("You should be able to do better!");
            }
            
            System.out.print("Play again? (1 for Yes, 0 for No): ");
            playAgain = input.nextInt() == 1;
        }
    }
}
Use code with caution.5.32javaimport java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        System.out.printf("Distance: %.2f%n", distance(x1, y1, x2, y2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
Use code with caution.5.33javaimport java.util.Scanner;
import java.util.Random;

public class CrapsWager {
    private static final Random randomNumbers = new Random();
    private enum Status { CONTINUE, WON, LOST };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
        
        System.out.printf("Your initial bank balance is: $%d%n", bankBalance);
        System.out.print("Enter your wager: ");
        int wager = input.nextInt();
        
        while (wager > bankBalance || wager <= 0) {
            System.out.print("Invalid wager. Reenter wager: ");
            wager = input.nextInt();
        }
        
        displayChatter();
        
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case 7: case 11:
                gameStatus = Status.WON;
                break;
            case 2: case 3: case 12:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            bankBalance += wager;
            System.out.printf("Player wins! New balance: $%d%n", bankBalance);
        } else {
            bankBalance -= wager;
            System.out.printf("Player loses. New balance: $%d%n", bankBalance);
            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
            }
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        return die1 + die2;
    }

    public static void displayChatter() {
        String[] phrases = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!"
        };
        System.out.println(phrases[randomNumbers.nextInt(phrases.length)]);
    }
}
Use code with caution.5.34javapublic class NumberTable {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%-10s%-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-10d%-15s%-10s%-10s%n", 
                i, 
                Integer.toBinaryString(i), 
                Integer.toOctalString(i), 
                Integer.toHexString(i).toUpperCase()
            );
        }
    }
}
