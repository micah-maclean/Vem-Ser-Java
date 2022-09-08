import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do produto:");
        String productName = sc.nextLine();
        System.out.println("Informe o preço do produto em R$:");
        double price = sc.nextDouble();

        System.out.println("Produto: " + productName);
        System.out.println("Preço: R$" + price);
        System.out.println("------------------");

        for (int i = 1; i <= 10; i++) {
            double priceWithDiscount = price - (price * ((float)(5 * i) / 100));
            System.out.printf("%s x R$ %,.2f = %,.2f\n", i, priceWithDiscount, (priceWithDiscount * i));
        }
    }
}
