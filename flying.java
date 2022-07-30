import java.util.Scanner;

public class flying {
    public static void main(String[] args) {
        System.out.println("How many miles do you plan to travel");
        Scanner king = new Scanner(System.in);
        int miles = king.nextInt();
        milesTraveled(miles);

    }

    public static void milesTraveled(int x){
        int rate = 56;
        int cost = x * rate;
        System.out.println("What is your name?");
        Scanner lion = new Scanner(System.in);
        String name = lion.nextLine();
        System.out.println(name+", your flight costs "+cost+"$!");
        String [] cakes = {"Strawberry", "Blueberry", "Pumpkin", "Raspberry"};
        if (cost <1000){
            System.out.print(cakes[0]+" cake as a gift for ordering.");

        } else System.out.print(cakes[2]+" cake as a gift for ordering.");

    }

}
