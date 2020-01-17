package Action;

import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    private double income = 0;
    private double balance = 0;
    private double allSum = 0;
    private double foodSum = 0;
    private double clothesSum = 0;
    private double entertainmentSum = 0;
    private double otherSum = 0;
    private ArrayList<ArrayList<String>> masAllType = new ArrayList<>();
    private ArrayList<ArrayList<String>> masFood= new ArrayList<>();
    private ArrayList<ArrayList<String>> masClothes= new ArrayList<>();
    private ArrayList<ArrayList<String>> masEntertainment= new ArrayList<>();
    private ArrayList<ArrayList<String>> masOther = new ArrayList<>();
    private ArrayList<ArrayList<String>> masAll = new ArrayList<>();
    private ArrayList<String> food = new ArrayList<>();
    private ArrayList<String> clothes = new ArrayList<>();
    private ArrayList<String> entertainment = new ArrayList<>();
    private ArrayList<String> other = new ArrayList<>();
    private ArrayList<String> purch = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void income(){
        System.out.println("Enter income:");
        double temp = scan.nextDouble();
        income += temp;
        balance += temp;
        System.out.println("Income was added!");
    }

    public void food(String temp, String price){
        double tempPrice = Double.parseDouble(price);

        balance -= tempPrice;
        allSum += tempPrice;
        foodSum += tempPrice;
        if(!price.contains(".")){
            price += ".00";
        }
        temp += " $" + price;
        purch.add(temp);
        food.add(temp);
        System.out.println("Purchase was added!");
    }

    private void bubbleSort(ArrayList<ArrayList<String>> mas){
        for(int i = mas.get(0).size() - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(Double.parseDouble(mas.get(1).get(j)) < Double.parseDouble(mas.get(1).get(j + 1))){
                    String tempPur = new String(mas.get(0).get(j + 1));
                    mas.get(0).set(j + 1, mas.get(0).get(j));
                    mas.get(0).set(j, tempPur);
                    String temp = new String(mas.get(1).get(j + 1));
                    mas.get(1).set(j + 1, mas.get(1).get(j));
                    mas.get(1).set(j, temp);
                }
            }
        }
    }

    public void sortType(){
        if(allSum != 0) {
            ArrayList<String> all = new ArrayList<>();
            ArrayList<String> money = new ArrayList<>();
            all.add("Food - ");
            all.add("Entertainment - ");
            all.add("Clothes - ");
            all.add("Other - ");
            money.add(Double.toString(foodSum));
            money.add(Double.toString(entertainmentSum));
            money.add(Double.toString(clothesSum));
            money.add(Double.toString(otherSum));
            masAllType.add(all);
            masAllType.add(money);
            bubbleSort(masAllType);
            for (int i = 0; i < masAllType.get(0).size(); i++) {
                System.out.println(masAllType.get(0).get(i) + "$" + Math.round(Double.parseDouble(masAllType.get(1).get(i))*100)/100D);
            }
        }
    }

    public void sortAll(){
        if(allSum != 0) {
            ArrayList<String> all = new ArrayList<>(food);
            ArrayList<String> money = new ArrayList<>();
            for (int i = 0; i < food.size(); i++) {
                money.add(food.get(i).split("\\$")[1]);
            }
            for (int i = 0; i < clothes.size(); i++) {
                all.add(clothes.get(i));
                money.add(clothes.get(i).split("\\$")[1]);
            }
            for (int i = 0; i < entertainment.size(); i++) {
                all.add(entertainment.get(i));
                money.add(entertainment.get(i).split("\\$")[1]);
            }
            for (int i = 0; i < other.size(); i++) {
                all.add(other.get(i));
                if(other.get(i).contains("Chick-fil-A")){
                    money.add("10.00");
                }
                else {
                    money.add(other.get(i).split("\\$")[1]);
                }
            }
            masAll.add(all);
            masAll.add(money);
            bubbleSort(masAll);
            for (int i = 0; i < masAll.get(0).size(); i++) {
                System.out.println(masAll.get(0).get(i));
            }
        }
    }

    public void sortFood(){
        if(foodSum != 0) {
            ArrayList<String> money = new ArrayList<>();
            for (int i = 0; i < food.size(); i++) {
                money.add(food.get(i).split("\\$")[1]);
            }
            masFood.add(food);
            masFood.add(money);
            bubbleSort(masFood);
            for (int i = 0; i < masFood.get(0).size(); i++) {
                System.out.println(masFood.get(0).get(i));
            }
        }
    }

    public void sortClothes(){
        if(clothesSum != 0) {
            ArrayList<String> money = new ArrayList<>();
            for (int i = 0; i < clothes.size(); i++) {
                money.add(clothes.get(i).split("\\$")[1]);
            }
            masAll.add(clothes);
            masAll.add(money);
            bubbleSort(masClothes);
            for (int i = 0; i < masClothes.get(0).size(); i++) {
                System.out.println(masClothes.get(0).get(i));
            }
        }
    }

    public void sortEntertainment(){
        if(entertainmentSum != 0) {
            ArrayList<String> money = new ArrayList<>();
            for (int i = 0; i < entertainment.size(); i++) {
                money.add(entertainment.get(i).split("\\$")[1]);
            }
            masEntertainment.add(entertainment);
            masEntertainment.add(money);
            bubbleSort(masEntertainment);
            for (int i = 0; i < masEntertainment.get(0).size(); i++) {
                System.out.println(masEntertainment.get(0).get(i));
            }
        }
    }

    public void sortOther(){
        if(otherSum != 0) {
            ArrayList<String> money = new ArrayList<>();
            for (int i = 0; i < other.size(); i++) {
                if(other.get(i).contains("Chick-fil-A")){
                    money.add("10.00");
                }
                else {
                    money.add(other.get(i).split("\\$")[1]);
                }
            }
            masOther.add(other);
            masOther.add(money);
            bubbleSort(masOther);
            for (int i = 0; i < masOther.get(0).size(); i++) {
                System.out.println(masOther.get(0).get(i));
            }
        }
    }

    public void food(String temp){
        purch.add(temp);
        food.add(temp);
    }

    public void clothes(String temp, String price){
        double tempPrice = Double.parseDouble(price);
        balance -= tempPrice;
        allSum += tempPrice;
        clothesSum += tempPrice;
        if(!price.contains(".")){
            price += ".00";
        }
        temp += " $" + price;
        purch.add(temp);
        clothes.add(temp);
        System.out.println("Purchase was added!");
    }

    public void clothes(String temp){
        purch.add(temp);
        clothes.add(temp);
    }

    public void entertainment(String temp, String price){
        double tempPrice = Double.parseDouble(price);
        balance -= tempPrice;
        allSum += tempPrice;
        entertainmentSum += tempPrice;
        if(!price.contains(".")){
            price += ".00";
        }
        temp += " $" + price;
        purch.add(temp);
        entertainment.add(temp);
        System.out.println("Purchase was added!");
    }

    public void entertainment(String temp){
        purch.add(temp);
        entertainment.add(temp);
    }

    public void other(String temp, String price){
        double tempPrice = Double.parseDouble(price);
        balance -= tempPrice;
        allSum += tempPrice;
        otherSum += tempPrice;
        if(!price.contains(".")){
            price += ".00";
        }
        temp += " $" + price;
        purch.add(temp);
        other.add(temp);
        System.out.println("Purchase was added!");
    }

    public void other(String temp){
        purch.add(temp);
        other.add(temp);
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

    public ArrayList<String> getClothes() {
        return clothes;
    }

    public ArrayList<String> getFood() {
        return food;
    }

    public ArrayList<String> getEntertainment() {
        return entertainment;
    }

    public ArrayList<String> getOther() {
        return other;
    }

    public double getAllSum() {
        return allSum;
    }

    public double getBalance() {
        return balance;
    }

    public double getClothesSum() {
        return clothesSum;
    }

    public double getEntertainmentSum() {
        return entertainmentSum;
    }

    public double getFoodSum() {
        return foodSum;
    }

    public double getIncome() {
        return income;
    }

    public double getOtherSum() {
        return otherSum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setAllSum(double allSum) {
        this.allSum = allSum;
    }

    public void setClothesSum(double clothesSum) {
        this.clothesSum = clothesSum;
    }

    public void setEntertainmentSum(double entertainmentSum) {
        this.entertainmentSum = entertainmentSum;
    }

    public void setFoodSum(double foodSum) {
        this.foodSum = foodSum;
    }

    public void setOtherSum(double otherSum) {
        this.otherSum = otherSum;
    }
}
