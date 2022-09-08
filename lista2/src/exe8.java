import java.util.Arrays;
import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] arr = new double[5][4];
        double highestFinalGrade = 0, finalGradeAverage = 0, highestFinalGradeId = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero da matricula:");
            arr[i][0] = sc.nextInt();
            System.out.println("Digite a media das provas:");
            arr[i][1] = sc.nextDouble();
            System.out.println("Digite a media dos trabalhos:");
            arr[i][2] = sc.nextDouble();

            arr[i][3] = (arr[i][1] * 0.6) + (arr[i][2] * 0.4);
            finalGradeAverage += arr[i][2];

            if(arr[i][3] > highestFinalGrade) {
                highestFinalGrade = arr[i][3];
                highestFinalGradeId = arr[i][0];
            }
        }

        finalGradeAverage = finalGradeAverage / 5;

        System.out.printf("A número da matricula com a maior nota final é %,.0f e a média das notas finais é %,.1f", highestFinalGradeId, finalGradeAverage);
    }
}
