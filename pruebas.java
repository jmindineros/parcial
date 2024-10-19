import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double m;
        Double max;
        Double n1;
        Double n2;

        System.out.println("escriba el primer numero");
        n1 = sc.nextDouble();
        System.out.println("escriba el segundo numero");
        n2 = sc.nextDouble();
        max = (n1 + n2)/2;

        while (n1 != 999 && n2 != 999){

        System.out.println("escriba el primer numero");
        n1 = sc.nextDouble();
        System.out.println("escriba el segundo numero");
        n2 = sc.nextDouble();
        m = (n1 + n2)/2;
        if (m>max){
            max = m;
        }
    }
        System.out.println("la media maxima" + max);

    }
}