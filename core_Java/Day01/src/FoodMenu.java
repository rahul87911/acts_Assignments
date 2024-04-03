import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalBill = 0.0;

        int choice;
        int quantity;
        do {
            System.out.println("\nFood Menu:");
            System.out.println("1. Dosa - $50.0");
            System.out.println("2. Samosa - $20.0");
            System.out.println("3. Idli - $40.0");
            System.out.println("4. Chai - $10.0");
            System.out.println("5. Coffee - $15.0");
            System.out.println("6. Uttappa - $60.0");
            System.out.println("7. Milkshake - $25.0");
            System.out.println("8. Fruit plate - $70.0");
            System.out.println("9. Noodles - $55.0");
            System.out.println("10. Generate Bill");

            System.out.print("\nEnter your choice (1-10): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 50.0 * quantity;
                    break;
                case 2:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 20.0 * quantity;
                    break;
                case 3:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 40.0 * quantity;
                    break;
                case 4:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 10.0 * quantity;
                    break;
                case 5:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 15.0 * quantity;
                    break;
                case 6:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 60.0 * quantity;
                    break;
                case 7:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 25.0 * quantity;
                    break;
                case 8:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 70.0 * quantity;
                    break;
                case 9:
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    totalBill += 55.0 * quantity;
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }

        } while (choice != 10);

        System.out.println("\nTotal Bill: $" + totalBill);
        
        scanner.close();
    }
}
