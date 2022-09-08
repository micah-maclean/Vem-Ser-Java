import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total consumido:");
        double owed = sc.nextDouble();
        System.out.println("Digite o valor pago:");
        double paid = sc.nextDouble();

        double change = paid - owed;

        if(change < 0) {
            System.out.println("O valor pago deve ser maior ou igual ao valor consumido.");
        } else {
            System.out.println("O valor do troco é:" + change);
        }
    }
}
