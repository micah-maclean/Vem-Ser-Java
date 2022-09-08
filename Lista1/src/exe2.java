import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double score1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double score2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double score3 = sc.nextDouble();
        System.out.println("Digite a quarta nota:");
        double score4 = sc.nextDouble();

        double average = (score1 + score2 + score3 + score4) / 4;

        if (average <= 5) {
            System.out.println("Reprovado. Sua media final foi " + average);
        } else if (average > 5 && average < 7) {
            System.out.println("Em exame. Sua media final foi " + average);
        } else {
            System.out.println("Aprovado. Sua media final foi " + average);
        }
    }
}
