import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int var1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int var2 = sc.nextInt();

        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.printf("O valor da primeira variavel é: %s", var1);
        System.out.printf("O valor da segunda variavel é: %s", var2);
    }

}
