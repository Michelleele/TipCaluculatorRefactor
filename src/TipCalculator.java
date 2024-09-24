public class TipCalculator {
    //private instances
    private double billAmount;
    private double tipPercentage;
    private int numberOfPeople;
    private double totalTips;
    private double totalBill;
    private double tipsPerPerson;
    private double totalPerPerson;

    //Constructor method for object bill
    TipCalculator(double billAmount, double tipPercentage, int numberOfPeople) {
        this.billAmount = billAmount;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
    }

    //Does calculation and stores them into instances
    public void doCalculations() {
        totalTips = billAmount * tipPercentage;
        totalBill = billAmount + totalTips;
        totalPerPerson = totalBill / numberOfPeople;
        tipsPerPerson = totalTips / numberOfPeople;
    }

    //prints out instances as receipt
    public void printResults() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.print("The total bill amount is: $");
        System.out.printf("%.2f", totalBill);
        System.out.println();
        System.out.print("The amount each person has to pay is: $");
        System.out.printf("%.2f", totalPerPerson);
        System.out.println();
        System.out.print("The total tip amount is: $");
        System.out.printf("%.2f", totalTips);
        System.out.println();
        System.out.print("The tip amount each person has to pay is: $");
        System.out.printf("%.2f", tipsPerPerson);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }

}
