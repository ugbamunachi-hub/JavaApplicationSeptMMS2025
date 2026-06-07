
//.4.14
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; 
        int years = 10;

        for (int ratePercent = 5; ratePercent <= 10; ratePercent++) {
            double rate = ratePercent / 100.0;
            System.out.printf("%nInterest Rate: %d%%%n", ratePercent);
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}
Use code with caution.4.30javaimport java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswers = 0;

        System.out.println("1. Main driver of recent climate trends according to the IPCC?");
        System.out.println("   1) Solar shifts\n   2) Greenhouse gases\n   3) Volcanoes\n   4) Orbit variances");
        if (input.nextInt() == 2) correctAnswers++;

        System.out.println("\n2. Skeptics reference discrepancies between models and which tools?");
        System.out.println("   1) Satellite records\n   2) Ocean acidity maps\n   3) Ice measurements\n   4) Land data");
        if (input.nextInt() == 1) correctAnswers++;

        System.out.println("\n3. Paris Agreement target temperature rise cap?");
        System.out.println("   1) Below 2.0C\n   2) Zero warming\n   3) 350 ppm\n   4) Reduced industry");
        if (input.nextInt() == 1) correctAnswers++;

        System.out.println("\n4. Non-human variables skeptics highlight?");
        System.out.println("   1) Ocean currents and solar activity\n   2) Plate tectonics\n   3) Volcanoes\n   4) Ecosystem paths");
        if (input.nextInt() == 1) correctAnswers++;

        System.out.println("\n5. Physical core of the greenhouse effect framework?");
        System.out.println("   1) UV light reflection\n   2) Gases trapping infrared energy\n   3) Cosmic ray seeds\n   4) Ozone depletion");
        if (input.nextInt() == 2) correctAnswers++;

        System.out.printf("%nYour score: %d/5%n", correctAnswers);
        if (correctAnswers == 5) System.out.println("Excellent");
        else if (correctAnswers == 4) System.out.println("Very good");
        else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Websites: climate.nasa.gov, climate.gov, ipcc.ch");
        }
    }
}
Use code with caution.4.31The 23% vs 30% calculation variance depends on whether it is tax-inclusive or tax-exclusive. Proponents measure the tax share out of total final spending (\(30 / \$130 \approx 23\%\)). Opponents look at the tax added on top of the original product value (\(30 / \$100 = 30\%\)).javaimport java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Healthcare", "Vacations"};
        double totalExpenses = 0;
        
        for (String cat : categories) {
            System.out.printf("Enter expenses for %s ($): ", cat);
            totalExpenses += input.nextDouble();
        }
        
        System.out.printf("%nTotal Spending Base: $%,.2f%n", totalExpenses);
        System.out.printf("FairTax (23%% Inclusive Rate): $%,.2f%n", totalExpenses * 0.23);
        System.out.printf("FairTax (30%% Exclusive Rate): $%,.2f%n", totalExpenses * 0.30);
    }
}
Use code with caution.4.32To reach 1.5 billion users: 11 monthsTo reach 2.0 billion users: 18 months