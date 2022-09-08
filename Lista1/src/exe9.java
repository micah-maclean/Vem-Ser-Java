import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DAYS_IN_A_YEAR = 365;
        final int DAYS_IN_A_MONTH = 30;

        System.out.println("Digite os anos:");
        int years = sc.nextInt();
        System.out.println("Digite os meses:");
        int months = sc.nextInt();
        System.out.println("Digite os dias:");
        int days = sc.nextInt();

        int ageInDays = (years * DAYS_IN_A_YEAR) + (months * DAYS_IN_A_MONTH) + days;
        System.out.printf("A sua idade em dias é %s", ageInDays);
    }
}
