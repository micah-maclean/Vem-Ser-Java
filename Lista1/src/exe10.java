import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores:");
        int totalVoters = sc.nextInt();
        System.out.println("Digite o número de votos brancos:");
        int whiteVotes = sc.nextInt();
        System.out.println("Digite o número de votos nulos:");
        int nullVotes = sc.nextInt();
        System.out.println("Digite o número de votos validos:");
        int validVotes = sc.nextInt();

        double whiteVotesPercentage = ((double) whiteVotes / totalVoters) * 100;
        double nullVotesPercentage = ((double) nullVotes / totalVoters) * 100;
        double validVotesPercentage = ((double) validVotes / totalVoters) * 100;

        System.out.printf("%,.2f de votos brancos \n", whiteVotesPercentage);
        System.out.printf("%,.2f de votos nulos \n", nullVotesPercentage);
        System.out.printf("%,.2f de votos validos \n", validVotesPercentage);
    }

}
