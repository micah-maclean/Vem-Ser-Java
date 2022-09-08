import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int numBiggerThan10 = 0;

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um número:");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[i][j] > 10) {
                    numBiggerThan10++;
                }
            }
        }

        System.out.printf("Dos números digitados, %s são maiores do que 10", numBiggerThan10);

    }
}
