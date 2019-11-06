package Action;

import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    private double income = 0;
    private double balance;
    private double allSum = 0;
    private double foodSum = 0;
    private double clothesSum = 0;
    private double entertainmentSum = 0;
    private double otherSum = 0;
    private ArrayList<String> food = new ArrayList<>();
    private ArrayList<String> clothes = new ArrayList<>();
    private ArrayList<String> entertainment = new ArrayList<>();
    private ArrayList<String> other = new ArrayList<>();
    private ArrayList<String> purch = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void income(){
        System.out.println("Enter income:");
        income += scan.nextDouble();
        balance += income;
        System.out.println("Income was added!");
    }

    public void food(){
        scan.nextLine();
        System.out.println("Enter purchase name:");
        String temp = scan.nextLine();
        System.out.println("Enter its price:");
        double price = scan.nextDouble();
        balance -= price;
        allSum += price;
        foodSum += price;
        temp += " $" + price;
        purch.add(temp);
        food.add(temp);
        System.out.println("Purchase was added!");
    }

    public void clothes(){
        scan.nextLine();
        System.out.println("Enter purchase name:");
        String temp = scan.nextLine();
        System.out.println("Enter its price:");
        double price = scan.nextDouble();
        balance -= price;
        allSum += price;
        clothesSum += price;
        temp += " $" + price;
        purch.add(temp);
        clothes.add(temp);
        System.out.println("Purchase was added!");
    }

    public void entertainment(){
        scan.nextLine();
        System.out.println("Enter purchase name:");
        String temp = scan.nextLine();
        System.out.println("Enter its price:");
        double price = scan.nextDouble();
        balance -= price;
        allSum += price;
        entertainmentSum += price;
        temp += " $" + price;
        purch.add(temp);
        entertainment.add(temp);
        System.out.println("Purchase was added!");
    }

    public void other(){
        scan.nextLine();
        System.out.println("Enter purchase name:");
        String temp = scan.nextLine();
        System.out.println("Enter its price:");
        double price = scan.nextDouble();
        balance -= price;
        allSum += price;
        otherSum += price;
        temp += " $" + price;
        purch.add(temp);
        other.add(temp);
        System.out.println("Purchase was added!");
    }

    public void all(){
        scan.nextLine();
        System.out.println("Enter purchase name:");
        String temp = scan.nextLine();
        System.out.println("Enter its price:");
        double price = scan.nextDouble();
        balance -= price;
        allSum += price;
        temp += " $" + price;
        purch.add(temp);
        System.out.println("Purchase was added!");
    }

    public void printAll(){
        if(purch.size() == 0){
            System.out.println("Purchase list is empty");
        }
        else {
            for (String temp : purch) {
                System.out.println(temp);
            }
            System.out.println("Total sum: $" + allSum);
        }
    }

    public void printFood(){
        if(food.size() == 0){
            System.out.println("Purchase list is empty");
        }
        else {
            System.out.println("Food:");
            for (String temp : food) {
                System.out.println(temp);
            }
            System.out.println("Total sum: $" + foodSum);
        }
    }

    public void printClothes(){
        if(clothes.size() == 0){
            System.out.println("Purchase list is empty");
        }
        else {
            System.out.println("Clothes:");
            for (String temp : clothes) {
                System.out.println(temp);
            }
            System.out.println("Total sum: $" + clothesSum);
        }
    }

    public void printEntertainment(){
        if(entertainment.size() == 0){
            System.out.println("Purchase list is empty");
        }
        else {
            System.out.println("Entertainment:");
            for (String temp : entertainment) {
                System.out.println(temp);
            }
            System.out.println("Total sum: $" + entertainmentSum);
        }
    }

    public void printOther(){
        if(other.size() == 0){
            System.out.println("Purchase list is empty");
        }
        else {
            System.out.println("Other:");
            for (String temp : other) {
                System.out.println(temp);
            }
            System.out.println("Total sum: $" + otherSum);
        }
    }

    public void printBalance(){
        System.out.println("Balance: $" + balance);
    }
}
