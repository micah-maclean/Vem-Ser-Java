import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 13, 45, 67, 34, 87, 90, 100, 23, 56};

        System.out.println("Digite um numero:");
        int guess = sc.nextInt();
        boolean includes = false;

        for (int number: arr) {
            if(guess == number) {
                includes = true;
                System.out.println("O número digitado existe na lista");
            }
        }

        if (!includes) {
            System.out.println("O número digitado não existe na lista");
        }
    }
}
