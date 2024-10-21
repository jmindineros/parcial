import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double tmax;
        double contadormax = 0.0;
        double contadormin = 0.0;
        Double tmin;
        Double diasc=0.0;
        Double mmax;
        Double mmin;
        Double incorrectas = 0.0;
        System.out.println("para salir ingresa 0 en las dos temperaturas");
        System.out.println("");

        while (true) {

            System.out.println("ingresa temperatura maxima");
            tmax = sc.nextDouble();
            System.out.println("ingresa temperatura minima");
            tmin = sc.nextDouble();
            sc.nextLine();
            if (tmax==0 && tmin==0) {
                break;

            }
            if (tmax == 9 || tmin == 9) {
                incorrectas += 1;
                System.out.println("no se puede ingresar 9 en ninguna de las temperaturas");
                System.out.println("intentalo de nuevo");

            }else{
                diasc+=1;
            
            }if (tmax != 9) {
                contadormax += tmax;
            }if (tmin != 9) {
                contadormin += tmin;
            }
        }


        System.out.println("el numero de dias es ingresado es: "+diasc);
        System.out.println("la media de temperatura maxima es: "+contadormax/diasc);
        System.out.println("la media de temperatura minima es: "+contadormin/diasc);
        System.out.println("el numero de incorrectas es "+incorrectas);
        System.out.println("el porcentaje de las incorrectases "+(incorrectas/diasc+incorrectas)*100 );


    }
}