import entities.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Birth date on format(dd/MM/yyyy):");
        String birthdate = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(birthdate, fmt);
        Client client = new Client(name, email, birthDate);


        System.out.println("Enter order data");
        System.out.print("Status");
        String status = sc.nextLine();
        System.out.println();
        LocalDate orderDate = LocalDate.now();
        Order order = new Order(orderDate, OrderStatus.valueOf(status), client);


        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data");
            System.out.print("Product name");
            String itemName = sc.nextLine();
            System.out.print("Product Price");
            Double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(itemName, price);
            OrderItem item = new OrderItem(quantity, price, product);
            order.getItems().add(item);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


    }
}