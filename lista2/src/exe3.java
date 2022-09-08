import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int numberOfPlayers = 0, oldestPlayer = 0;
        double tallestPlayer = 0, heaviestPlayer = 0, averageHeight = 0;

        while(!name.equals("SAIR")) {
            System.out.println("Digite o nome do jogador:(ou SAIR para parar) ");
            name = sc.nextLine();

            if(!name.equals("SAIR")){
                numberOfPlayers++;

                System.out.println("Digite a altura do jogador:");
                double height = sc.nextDouble();
                System.out.println("Digite o peso do jogador:");
                double weight = sc.nextDouble();
                System.out.println("Digite a idade do jogador:");
                int age = sc.nextInt();

                if (height > tallestPlayer) {
                    tallestPlayer = height;
                }
                if (weight > heaviestPlayer) {
                    heaviestPlayer = weight;
                }
                if (age > oldestPlayer) {
                    oldestPlayer = age;
                }
                averageHeight += height;
            }
            averageHeight = averageHeight / numberOfPlayers;
        }

        System.out.printf("O número de jogadores cadastrados: %s \n", numberOfPlayers);
        System.out.printf("A altura do maior jogador: %,.2f \n", tallestPlayer);
        System.out.printf("O jogador mais velho: %s \n", oldestPlayer);
        System.out.printf("O jogador mais pesado: %s \n", heaviestPlayer);
        System.out.printf("A media das alturas dos jogadores: %s", averageHeight);
    }
}