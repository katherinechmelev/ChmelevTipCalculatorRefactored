import java.util.Scanner;

public class TipCalculator {
    public int numPeople;
    public double tipPercentage;
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

    public double getTipPercentage(){
        return tipPercentage;
    }

    public double tipAmount(){
        return (tipPercentage/100) * totalBillBeforeTip ;
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
