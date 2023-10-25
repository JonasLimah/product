package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Product product;
        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of product: ");
        int numberProduct = input.nextInt();
        for (int i = 1; i <= numberProduct; i++) {
            System.out.print("Comum, Used or Imported Product: (c/u/i): ");
            char type = input.next().toLowerCase().charAt(0);
            switch (type) {
                case 'c':
                    System.out.println("Product "+ i);
                    System.out.print("Name: ");
                    input.nextLine();
                    String nameItemC = input.nextLine();
                    System.out.print("Price: ");
                    Double priceItemC = input.nextDouble();
                    product = new Product(nameItemC,priceItemC);
                    list.add(product);
                    break;
                case 'u':
                    System.out.println("Product "+ i);
                    System.out.print("Name: ");
                    input.nextLine();
                    String nameItemU = input.nextLine();
                    System.out.print("Price: ");
                    Double priceItemU = input.nextDouble();
                    System.out.print("Manufacture date: ");
                    Date date = sdf.parse(input.next());
                    product = new UsedProducte(nameItemU,priceItemU,date);
                    list.add(product);
                    break;

                case 'i':
                    System.out.println("Product "+ i);
                    System.out.print("Name: ");
                    input.nextLine();
                    String nameItemI = input.nextLine();
                    System.out.print("Price: ");
                    Double priceItemI = input.nextDouble();
                    System.out.print("Customs fee: ");
                    Double customs = input.nextDouble();
                    product = new ImportedProduct(nameItemI,priceItemI,customs);
                    list.add(product);
                    break;
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product products:list
             ) {
            System.out.println(products.priceTag());
        }

    }
}