import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Digite o primeiro numero:");
        numbers[0] = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        numbers[1] = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        numbers[2] = sc.nextInt();

        if (numbers[0] < numbers[1] && numbers[0] < numbers[2]) {
            System.out.println("O menor número está na posição zero");
        } else if (numbers[1] < numbers[0] && numbers[1] < numbers[2]) {
            System.out.println("O menor número está na posição um");
        } else {
            System.out.println("O menor número está na posição dois");
        }
    }
}
