import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome:");
        String userName = sc.nextLine();
        System.out.println("Escreva sua idade:");
        int userAge = sc.nextInt();
        System.out.println("Escreva sua cidade:");
        String userCity = sc.nextLine();
        System.out.println("Escreva seu estado:");
        String userState = sc.nextLine();

        System.out.printf("Olá seu nome é %s, você tem %s anos, é da cidade de %s, situada no estado de %s", userName, userAge, userCity, userState);
    }
}
