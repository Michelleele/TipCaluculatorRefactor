import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner kyx = new Scanner(System.in);

        //greets user
        System.out.println("Welcome to Tip calculator!");
        System.out.println();

        //takes in user input and stores them into variables
        System.out.print("Please enter your bill amount: $");
        double billAmount = kyx.nextDouble();
        System.out.print("Please enter the total amount of people in your party: ");
        int peopleCount = kyx.nextInt();
        System.out.print("Please enter the percentage you would wish to tip: ");
        double tipPercent = kyx.nextDouble();

        //stores the values of the variable into object billOne
        TipCalculator billOne = new TipCalculator(billAmount, tipPercent, peopleCount);
        //calculations performed
        billOne.doCalculations();
        //receipt printed
        billOne.printResults();
    }
}
