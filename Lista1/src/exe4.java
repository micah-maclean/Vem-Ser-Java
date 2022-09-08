import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um estado: \n 1- São Paulo \n 2- Rio de Janeiro \n 3- Minas Gerais ");
        int state = sc.nextInt();
        int city;

        switch (state) {
            case 1:
                System.out.println("Escolha uma cidade do estado de São Paulo: \n 1- São Paulo \n 2- Campinas");
                city = sc.nextInt();
                if(city == 1) {
                    System.out.println("São Paulo");
                } else {
                    System.out.println("Campinas");
                }
                break;
            case 2:
                System.out.println("Escolha uma cidade do estado de Rio de Janeiro: \n  1- Rio de Janeiro \n 2-Duque de Caxias ");
                city = sc.nextInt();
                if(city == 1) {
                    System.out.println("Rio de Janeiro");
                } else {
                    System.out.println("Duque de Caxias");
                }
                break;
            case 3:
                System.out.println("Escolha uma cidade do estado de Minas Gerais: \n  1- Belo Horizonte \n 2- Uberlândia");
                city = sc.nextInt();
                if(city == 1) {
                    System.out.println("Belo Horizonte");
                } else {
                    System.out.println("Uberlândia");
                }
                break;
        }
    }
}
