package Manager;

import java.util.Scanner;

import Action.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Action temp = new Action();
        boolean flag = true;
        while(flag){
            System.out.println("Choose your action:");
            System.out.println("1) Add income");
            System.out.println("2) Add purchase");
            System.out.println("3) Show list of purchases");
            System.out.println("4) Balance");
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
                                System.out.println();
                                temp.food();
                                break;
                            case 2:
                                System.out.println();
                                temp.clothes();
                                break;
                            case 3:
                                System.out.println();
                                temp.entertainment();
                                break;
                            case 4:
                                System.out.println();
                                temp.other();
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
            }
            System.out.println();
        }
    }
}
