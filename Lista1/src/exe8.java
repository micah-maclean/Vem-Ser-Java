import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        int base = sc.nextInt();
        System.out.println("Digite o valor da altura do retângulo:");
        int height = sc.nextInt();

        int area = base * height;

        System.out.printf("A área do retângulo é de %s", area);
    }
}
