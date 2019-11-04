package Action;

import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    private double income = 0;
    private double balance;
    private double purchSum = 0;
    private ArrayList<String> purch = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void income(){
        System.out.println("Enter income:");
        income += scan.nextDouble();
        balance += income;
        System.out.println("Income was added!");
    }

    public void purchase(){
        scan.nextLine();
        System.out.println("Enter purchase name:");
        String temp = scan.nextLine();
        System.out.println("Enter its price:");
        double price = scan.nextDouble();
        balance -= price;
        purchSum += price;
        temp += " $" + price;
        purch.add(temp);
        System.out.println("Purchase was added!");
    }

    public void printPurch(){
        if(purch.size() == 0){
            System.out.println("Purchase list is empty");
        }
        else {
            for (String temp : purch) {
                System.out.println(temp);
            }
            System.out.println("Total sum: $" + purchSum);
        }
    }

    public void printBalance(){
        System.out.println("Balance: $" + balance);
    }
}
