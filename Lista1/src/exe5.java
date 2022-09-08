import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da hora me R$:");
        double hourPrice = sc.nextDouble();
        System.out.println("Digite o número de horas normais:");
        double numNormalHours = sc.nextDouble();
        System.out.println("Digite o número de horas extras 50%:");
        double numExtraHours = sc.nextDouble();
        System.out.println("Digite o número de horas extras 100%:");
        double numExtraHours2 = sc.nextDouble();

        double salary = (hourPrice * numNormalHours) + (hourPrice * numExtraHours * 1.5) + (hourPrice * numExtraHours2 * 2);

        System.out.println("O seu sálario é : " + salary);
    }
}
