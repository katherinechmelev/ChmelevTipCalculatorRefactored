import java.text.DecimalFormat;
import java.util.Scanner;

public class TipRunner {
    public static void main (String []args) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numberOfGuests = scan.nextInt();
        scan.nextLine();
        System.out.print("What is the tip percentage?" );
        int tip = scan.nextInt();
        scan.nextLine();
        TipCalculator tipCalc = new TipCalculator(numberOfGuests,tip);

        double cost = 0.0;
        while (cost !=-1){
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            if(cost != -1) {
                tipCalc.addMeal(cost);
            }
        }

        System.out.println("-----------------");

        System.out.print("Total Bill Before Tip: " + formatter.format(tipCalc.getTotalBillBeforeTip()));
        System.out.print("Tip Percentage: " + tipCalc.getTipPercentage());
        System.out.print("Total Tip: " + tipCalc.tipAmount());
        System.out.print("Total Bill With Tip: " + formatter.format(tipCalc.totalBill()));
        System.out.print("Per Person Cost Before Tip: " + formatter.format(tipCalc.perPersonCostBeforeTip()));
        System.out.print("Tip Per Person: " + formatter.format(tipCalc.perPersonTipAmount()));
        System.out.print("Total Cost Per Person: " + formatter.format(tipCalc.perPersonTotalCost()));
    }
}
