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
                    System.out.println();
                    temp.purchase();
                    break;
                case 3:
                    System.out.println();
                    temp.printPurch();
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
