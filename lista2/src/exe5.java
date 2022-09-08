import java.util.Arrays;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        int[] reverseArr = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o %s° número:", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.printf("O array digitado foi: %s \n", Arrays.toString(arr));
        for (int i = 1; i < 20; i++) {
            reverseArr[i - 1] = arr[arr.length - i];
        }

        System.out.printf("O array digitado na ordem contrária é: %s", Arrays.toString(reverseArr));
    }
}
