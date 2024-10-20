import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String art;
        Double artA = 0.0;
        Double artB = 0.0;
        Double importe;
        Double pruni;
        Double numart;
        Double totalA = 0.0;
        Double totalB = 0.0;

        while (true) {
            System.out.println("ingrese el articulo al cual quiere ingresar el dato sea A o B y para salir es X");
            art = sc.nextLine();
            
            if (art.equals("X")) {
                break;
            }

            System.out.println("ingresa el precio unitario");
            pruni = sc.nextDouble();
            System.out.println("ingresa el numero del articulo");
            numart = sc.nextDouble();
            sc.nextLine();
            if (art.equals("A")) {
                artA += numart;
                totalA += (numart * pruni);
            } else if (art.equals("B")) {
                artB += numart;
                totalB += (numart * pruni);
            } 

        }
        System.out.println("el total de articulo a es: " + artA + " y su total dee importe es: " + totalA);
        System.out.println("el total de articulo a es: " + artB + " y su total de importe es: " + totalB);
    }
}