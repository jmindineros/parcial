import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int num;
        int max;
        int min;
        System.out.println("escriba el numero");
        num = sc.nextInt();
        min = num;
        max = num;

        for (int i = 1; i < 100;i++) {
            System.out.println("escriba el num");
            num=sc.nextInt();
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        System.out.println("maximo " + max + " minimo " + min);
    }
}