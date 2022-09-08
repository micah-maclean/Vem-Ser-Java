import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha um número:");
        int number = sc.nextInt();
        int guess = 0;
        
        while(guess != number) {
            System.out.println("Adivinhe um número:");
            guess = sc.nextInt();
            
            if(guess > number) {
                System.out.println("O número a encontrar é menor do que você digitou.");
            } else if (guess < number) {
                System.out.println("O número a encontrar é maior do que você digitou.");
            }
        }

        System.out.println("Você acertou o número.");
    }

}
