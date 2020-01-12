package Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import Action.*;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Action temp = new Action();
        String tempPurchase;
        File file = new File("purchases.txt");
        double price;
        boolean flag = true;
        while(flag){
            System.out.println("Choose your action:");
            System.out.println("1) Add income");
            System.out.println("2) Add purchase");
            System.out.println("3) Show list of purchases");
            System.out.println("4) Balance");
            System.out.println("5) Save");
            System.out.println("6) Load");
            System.out.println("0) Exit");
            switch (scan.nextInt()){
                case 0:
                    System.out.println();
                    flag = false;
                    System.out.println("Bye!");
                    break;
                case 1:
                    System.out.println();
                    temp.income();
                    break;
                case 2:
                    boolean bool = true;
                    System.out.println();
                    while(bool) {
                        System.out.println("Choose the type of purchases");
                        System.out.println("1) Food");
                        System.out.println("2) Clothes");
                        System.out.println("3) Entertainment");
                        System.out.println("4) Other");
                        System.out.println("5) Back");
                        switch (scan.nextInt()) {
                            case 1:
                                scan.nextLine();
                                System.out.println("Enter purchase name:");
                                tempPurchase = scan.nextLine();
                                System.out.println("Enter its price:");
                                price = scan.nextDouble();
                                System.out.println();
                                temp.food(tempPurchase, price);
                                break;
                            case 2:
                                scan.nextLine();
                                System.out.println("Enter purchase name:");
                                tempPurchase = scan.nextLine();
                                System.out.println("Enter its price:");
                                price = scan.nextDouble();
                                System.out.println();
                                temp.clothes(tempPurchase, price);
                                break;
                            case 3:
                                scan.nextLine();
                                System.out.println("Enter purchase name:");
                                tempPurchase = scan.nextLine();
                                System.out.println("Enter its price:");
                                price = scan.nextDouble();
                                System.out.println();
                                temp.entertainment(tempPurchase, price);
                                break;
                            case 4:
                                scan.nextLine();
                                System.out.println("Enter purchase name:");
                                tempPurchase = scan.nextLine();
                                System.out.println("Enter its price:");
                                price = scan.nextDouble();
                                System.out.println();
                                temp.other(tempPurchase, price);
                                break;
                            case 5:
                                bool = false;
                                break;
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println();
                    bool = true;
                    while(bool) {
                        System.out.println("Choose the type of purchases");
                        System.out.println("1) Food");
                        System.out.println("2) Clothes");
                        System.out.println("3) Entertainment");
                        System.out.println("4) Other");
                        System.out.println("5) All");
                        System.out.println("6) Back");
                        switch (scan.nextInt()) {
                            case 1:
                                System.out.println();
                                temp.printFood();
                                break;
                            case 2:
                                System.out.println();
                                temp.printClothes();
                                break;
                            case 3:
                                System.out.println();
                                temp.printEntertainment();
                                break;
                            case 4:
                                System.out.println();
                                temp.printOther();
                                break;
                            case 5:
                                System.out.println();
                                temp.printAll();
                                break;
                            case 6:
                                bool = false;
                                break;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println();
                    temp.printBalance();
                    break;
                case 5:
                    file.delete();
                    file.createNewFile();
                    PrintWriter writer = new PrintWriter(file);
                    writer.println(temp.getIncome());
                    writer.println(temp.getBalance());
                    ArrayList<String> tempPurch = temp.getFood(); //save food
                    writer.println(tempPurch.size());
                    if(tempPurch.size() != 0) {
                        for (String str : tempPurch) {
                            writer.println(str);
                        }
                        writer.println(temp.getFoodSum());
                    }
                    tempPurch = temp.getClothes(); //save clothes
                    writer.println(tempPurch.size());
                    if(tempPurch.size() != 0) {
                        for (String str : tempPurch) {
                            writer.println(str);
                        }
                        writer.println(temp.getClothesSum());
                    }
                    tempPurch = temp.getEntertainment(); //save entertainment
                    writer.println(tempPurch.size());
                    if(tempPurch.size() != 0) {
                        for (String str : tempPurch) {
                            writer.println(str);
                        }
                        writer.println(temp.getEntertainmentSum());
                    }
                    tempPurch = temp.getOther(); //save other
                    writer.println(tempPurch.size());
                    if(tempPurch.size() != 0) {
                        for (String str : tempPurch) {
                            writer.println(str);
                        }
                        writer.println(temp.getOtherSum());
                    }
                    writer.println(temp.getAllSum()); //save all sum purchases
                    writer.close();
                    System.out.println("Purchases were saved!");
                    break;
                case 6:
                    System.out.println();
                    Scanner scanner = new Scanner(file);
                    temp.setIncome(Double.parseDouble(scanner.next()));
                    temp.setBalance(Double.parseDouble(scanner.next()));
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    if(size != 0) {
                        for (int i = 0; i < size; i++) { //food purchases
                            temp.food(scanner.nextLine());
                        }
                        temp.setFoodSum(Double.parseDouble(scanner.next()));
                    }
                    size = scanner.nextInt();
                    scanner.nextLine();
                    if(size != 0) {
                        for (int i = 0; i < size; i++) { //clothes purchases
                            temp.clothes(scanner.nextLine());
                        }
                        temp.setClothesSum(Double.parseDouble(scanner.next()));
                    }
                    size = scanner.nextInt();
                    scanner.nextLine();
                    if(size != 0) {
                        for (int i = 0; i < size; i++) { //entertainment purchases
                            temp.entertainment(scanner.nextLine());
                        }
                        temp.setEntertainmentSum(Double.parseDouble(scanner.next()));
                    }
                    size = scanner.nextInt();
                    scanner.nextLine();
                    if(size != 0) {
                        for (int i = 0; i < size; i++) { //other purchases
                            temp.other(scanner.nextLine());
                        }
                        temp.setOtherSum(Double.parseDouble(scanner.next()));
                    }
                    temp.setAllSum(Double.parseDouble(scanner.next()));
                    scanner.close();
                    System.out.println("Purchases were loaded!");
                    System.out.println();
                    break;
            }
            System.out.println();
        }
    }
}
