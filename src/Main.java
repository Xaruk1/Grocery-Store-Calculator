import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner input for expenses
        Scanner sc = new Scanner(System.in);

        //exel for income
        System.out.printf("Earned amount:%n");
        int bubblegum = 202;
        System.out.printf("Bubblegum: $%d%n", bubblegum);
        int toffee = 118;
        System.out.printf("Toffee: $%d%n", toffee);
        int iceCream = 2250;
        System.out.printf("Ice cream: $%d%n", iceCream);
        int milkChocolate = 1680;
        System.out.printf("Milk chocolate: $%d%n", milkChocolate);
        int doughnut = 1075;
        System.out.printf("Doughnut: $%d%n", doughnut);
        int pancake = 80;
        System.out.printf("Pancake: $%d%n", pancake);

        //print of income sum
        int income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;
        System.out.printf("Income: %d%n", income);

        //reading expenses
        System.out.printf("Staff expenses:%n");
        int staffExpenses = sc.nextInt();
        System.out.printf("Other expenses:%n");
        int otherExpenses = sc.nextInt();

        //calculate expenses
        int expenses = staffExpenses + otherExpenses;

        //print expenses
        System.out.printf("Net income: $%d%n", income - expenses);

    }
}