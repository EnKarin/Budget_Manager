import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double total = 0;
        ArrayList<String> spis = new ArrayList<>();
        while (!scan.hasNext("\n")){
            spis.add(scan.nextLine());
            String[] temp = spis.get(i).split(" ");
            total += Double.parseDouble(temp[temp.length - 1].substring(1));
            i++;
        }
        for(String temp: spis){
            System.out.println(temp);
        }
        System.out.println("\n" + "Total: $" + total);
    }
}
