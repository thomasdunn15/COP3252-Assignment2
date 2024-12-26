import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Knight knight = new Knight();

        // Get input for each attribute
        System.out.printf("Enter your knight's full name: ");
        knight.name = input.nextLine();
        System.out.printf("Enter your knight's initial health: ");
        knight.health = input.nextInt();
        System.out.printf("Enter your knight's age: ");
        knight.age = input.nextInt();
        System.out.printf("Enter your knight's initial gold: ");
        knight.gold = input.nextInt();
        System.out.printf("Enter your knight's battles: ");
        knight.battles = input.nextInt();

        // Display information for the knight
        System.out.printf("+-[ %s ]------------------------------------------------+\n", knight.name);
        System.out.printf("| Health  : %d\n", knight.health);
        System.out.printf("| Age     : %d\n", knight.age);
        System.out.printf("| Battles : %d\n", knight.battles);
        System.out.printf("| Gold    : %d\n", knight.gold);
        System.out.println("+-------------------------------------------------+");
    }
}
