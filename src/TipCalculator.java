import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public int numPeople;
    public int tipPercentage;
    public double totalBillBeforeTip;

    Scanner scan = new Scanner (System.in);


    public TipCalculator(int numOfPeople, int tipPercent) {
        numPeople = numOfPeople;
        tipPercentage = tipPercent;
        totalBillBeforeTip = 0.0;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public double tipAmount(){
        return tipPercentage*totalBillBeforeTip;
    }

    public double totalBill(){
        return (totalBillBeforeTip + tipAmount());
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }

    public double perPersonTotalCost(){
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}
