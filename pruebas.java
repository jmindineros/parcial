import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sw;
        Double n;

        sw = 0;
        while (sw == 0) {
            System.out.println("ingrese n");
            n = sc.nextDouble();
            if (n != (int) n) {
                System.out.println("no es valido");
                System.out.println("ejecuta nuevamente");
                sw = 1;
            } else {
                System.out.println("correcto " + n + " es entero");
            }
        }

    }
}